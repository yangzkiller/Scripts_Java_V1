//CLASSE MATH.PI PARA CALCULOS MATEMATICOS E CIENTIFICOS 
import static java.lang.Math.PI;
//CLASSE SCANNER
import java.util.Scanner;
/* @author: Yangz
 * Data: 10/10/2022
 * Programa que faz calculos geometricos
 * LEIA O README !!!
 */

public class Main_Geometrico {
    public static void main(String[] args) {

        //OBJETO TIPO SCANNER
        Scanner entrada = new Scanner(System.in);

        //VARIAVEIS
        float lado, lado_2, lado_3, area, raio; 
        int opcao;

        //DISPLAY
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("    --> CALCULADORA GEOMÉTRICA <--");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //LAÇO
        boolean sair = true;
        while (sair == true) {
            //MENU
            System.out.println("             ||   MENU   ||");
            System.out.println("----------------------------------------");
            System.out.println("[1] Calcular a área de um quadrado\n[2] Calcular o raio de um circulo\n[3] Calcular lados de um triângulo\n[4] Sair");
            System.out.println(" ");
            //ENTRADA DE DADOS
            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            //ESTRUTURA CONDICIONAL - MENU
            //OPÇÃO - 1
            if (opcao == 1) {
                System.out.println("1");

            //OPÇÃO - 2
            }else if (opcao == 2) {
                System.out.println("2");

            //OPÇÃO - 3
            }else if (opcao == 3) {
                System.out.println("3");
        
            //OPÇÃO - 4    
            }else if (opcao == 4) {
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
