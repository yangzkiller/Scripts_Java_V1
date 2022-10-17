//CLASSE SCANNER
import java.util.Scanner;
/* @author Yangz
 * @data: 16/10/2022
 * Programa que peça um número correspondente a um determinado ano
 * e em seguida informe se este ano é ou não bissexto. 
 */
public class Main {
    public static void main(String[] args) {    
        try (
        //OBJETO TIPO SCANNER
        Scanner entrada = new Scanner(System.in)) {
            //VARIAVEIS
            int ano;
            int opcao;

            //DISPLAY
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("  --> CALCULADORA DE ANO BISSEXTO <--");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                
            //LAÇO
            boolean sair = true;
            while (sair == true) {

                //MENU
                System.out.println("             ||   MENU   ||");
                System.out.println("----------------------------------------");
                System.out.println("[1] Calculo Bissexto\n[2] Sair");
                System.out.println(" ");
                //ENTRADA DE DADOS
                System.out.print("Digite uma opção: ");
                opcao = entrada.nextInt();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    
                //ESTRUTURA CONDICIONAL - MENU
                //OPÇÃO - 1
                if (opcao == 1) {
                    //ENTRADA DE DADOS
                    System.out.print("Digite o Ano: ");
                    ano = entrada.nextInt();
                    System.out.println("----------------------------------------");

                    //PROCESSAMENTO DE DADOS
                    if(ano % 4 == 0) {
                        System.out.println("--> Bissexto <--");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");      
                    }else {
                        System.out.println("--> Não é Bissexto <--");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    }
                    
                //OPÇÃO - 2
                }else if (opcao == 2) {
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
} 

