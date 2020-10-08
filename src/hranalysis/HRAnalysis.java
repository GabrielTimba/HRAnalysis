package hranalysis;

import weka.classifiers.trees.J48;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


/**
 *
 * @author gabriel
 */
public class HRAnalysis {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        Menu m = new Menu();
        m.menuPrincipal();
        
        /*DataSource ds =new DataSource("src/hranalysis/train.csv");
        
        Instances ins = ds.getDataSet();
        ins.setClassIndex(12);
        
        J48 j= new J48();
        j.buildClassifier(ins);
        
        Instance novo = new DenseInstance(13);
        novo.setDataset(ins);
        
        novo.setValue(0, "Operations");
        novo.setValue(1, "region_34");
        novo.setValue(2, "Master & above");
        novo.setValue(3, "m");
        novo.setValue(4, "sourcing");
        novo.setValue(5, 1);
        novo.setValue(6, 33);
        novo.setValue(7, 3);
        novo.setValue(8, 6);
        novo.setValue(9, 0);
        novo.setValue(10, 0);
        novo.setValue(11, 63);
        
        double probabilidades[]= j.distributionForInstance(novo);
        
        System.out.println("Yes:" +probabilidades[1] );
        System.out.println("No:"+probabilidades[0]);*/
    }
    
}
