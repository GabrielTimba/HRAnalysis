package hranalysis;   

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private Tarrefas ta;
    private Validacao val;
    BufferedReader br;
    
    public Menu() throws Exception {
        ta = new Tarrefas();
        val =  new Validacao();
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public void menuPrincipal() throws IOException, Exception {
        byte op;
        do {
            System.out.println("========== Analisador Lexico =============");
            System.out.println("1. Ler o dataset de treino");
            System.out.println("2. Predizer dados de novo funcionario");
            System.out.println("3.Sair");
            System.out.println("==========================================");
            op = val.validarByte("Introduza uma opcao: ", (byte) 1, (byte) 3);
            
            switch (op) {
                case 1:
                    ta.lerTrain();
                    System.out.println("\nDataset lido!\n");
                    break;
                case 2: 
                    novoFuncionario();
                    break;
                case 3: System.out.println("\n----- Fim de Execusao -----\n\n");break;
            }
        } while(op != 3);
        
    }
    
    private void novoFuncionario() throws IOException, Exception {
        String newEmployee;
        System.out.println("========== Predizer =============");
        System.out.println("Introduza os dados no seguinte formato:");
        System.out.println("department,region,education,gender,recruitment_channel,no_of_trainings,age,previous_year_rating,");
        System.out.println("length_of_service,KPIs_met >80%,awards_won?,avg_training_score,is_promoted");
        System.out.print("Info: ");

        newEmployee=br.readLine();
        ta.predictNewEmployees(newEmployee);
    }
}
