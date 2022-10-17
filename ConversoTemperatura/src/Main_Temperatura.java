//CLASSE SCANNER
import java.util.Scanner;
/*
 * @author Yangz
 * Programa que peça a temperatura em graus Fahrenheit,
 * Transforme e mostre a temperatura em graus Celsius e vice-versa
 */
public class Main_Temperatura {
    public static void main(String[] args) {
        
        //OBJETO TIPO SCANNER
        Scanner entrada = new Scanner(System.in);

        //VARIAVEIS
        double graus_C, graus_F;
        int opcao;
        
        //DISPLAY
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("    --> CONVERSOR TEMPERATURA <--");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //LAÇO
        boolean sair = true;
        while (sair == true) {
            //MENU
            System.out.println("             ||   MENU   ||");
            System.out.println("----------------------------------------");
            System.out.println("[1] Converter CELSIUS para FAHRENHEIT\n[2] Converter FAHRENHEIT para CELSIUS\n[3] Sair");
            System.out.println(" ");
            //ENTRADA DE DADOS
            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        
            //ESTRUTURA CONDICIONAL - MENU
            //OPÇÃO - 1
            if (opcao == 1) {
                //COMANDO DE SAIDA/ENTRADA DE DADOS
                System.out.print("Digite a temperatura: "); 
                graus_C = entrada.nextDouble(); 
                entrada.nextLine(); 

                //VARIAVEL GRAUS_F RECEBE O VALOR DE 1.8 QUE É MULTIPLICADO
                //PELO VALOR DE GRAUS_C QUE É SOMADO COM 32
                graus_F = 1.8 * graus_C + 32;
        
                //COMANDO DE SAIDA DE DADOS
                System.out.format("A temperatura é: %.0f°F \n", graus_F);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            //OPÇÃO - 2
            }else if (opcao == 2) {
                //COMANDO DE SAIDA/ENTRADA DE DADOS
                System.out.print("Digite a temperatura: "); 
                graus_F = entrada.nextDouble(); 
                entrada.nextLine();

                //A VARIAVEL GRAUS_C RECEBE O VALOR DE GRAUS_F 
                //MENOS 32 MULTIPLICADO POR 5 DIVIDIDO POR 9
                graus_C = (graus_F -32.0) * ( 5.0 /9.0 );

                //COMANDO DE SAIDA DE DADOS
                System.out.format("A temperatura é: %.0f°C \n", graus_C);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            //OPÇÃO - 3
            }else if (opcao == 3) {
                System.out.println("      --> PROGRAMA ENCERRADO <--");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                sair = false;
            
            //ERRO
            }else {
                System.out.println("        !ERRO! Entrada Inválida");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
        }   
    }
}
