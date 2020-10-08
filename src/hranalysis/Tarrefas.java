/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hranalysis;

import weka.classifiers.trees.J48;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
        
public class Tarrefas {
    
    private Validacao val;
    private DataSource ds;
    private Instances ins;
    private J48 j;
    
    public Tarrefas() throws Exception {
        val = new Validacao();
        ds =new DataSource("src/hranalysis/train.csv");
        ins = ds.getDataSet();
    }
    
    public void lerTrain() throws Exception{
        ins.setClassIndex(12);
        
        j= new J48();
        j.buildClassifier(ins);
    }
    
    public void predictNewEmployees(String employeeIstances) throws Exception{
        Instance novo = new DenseInstance(13);
        novo.setDataset(ins);
        
        String[] values=employeeIstances.split(",");
        System.out.println(values[1]);
        novo.setValue(0, values[0]);
        novo.setValue(1, values[1]);
        novo.setValue(2, values[2]);
        novo.setValue(3, values[3]);
        novo.setValue(4, values[4]);
        novo.setValue(5, Integer.parseInt(values[5]));
        novo.setValue(6, Integer.parseInt(values[6]));
        novo.setValue(7, Integer.parseInt(values[7]));
        novo.setValue(8, Integer.parseInt(values[8]));
        novo.setValue(9, Integer.parseInt(values[9]));
        novo.setValue(10,Integer.parseInt(values[10]));
        novo.setValue(11,Integer.parseInt(values[11]));
        
        double probabilidades[]= j.distributionForInstance(novo);
        
        System.out.println("Yes:" +probabilidades[1] );
        System.out.println("No:"+probabilidades[0]);
    }
     
}
