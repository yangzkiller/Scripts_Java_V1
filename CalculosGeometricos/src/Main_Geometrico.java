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
            System.out.println("[1] Calcular a área de um quadrado\n[2] Calcular a área de um circulo\n[3] Calcular lados de um triângulo\n[4] Sair");
            System.out.println(" ");
            //ENTRADA DE DADOS
            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            //ESTRUTURA CONDICIONAL - MENU
            //OPÇÃO - 1
            if (opcao == 1) {
                //COMANDO DE ENTRADA/SAIDA DE DADOS
                System.out.print("Digite o tamanho do lado do quadrado: "); 
                lado = entrada.nextFloat();
                System.out.println("----------------------------------------"); 
        
                //VARIAVEL AREA RECEBE VALOR DE LADO MULTIPLICADO POR ELE MESMO
                area = lado * lado;
        
                //COMANDO DE SAIDA DE DADOS
                System.out.format("A área do quadrado: %.2f \n", area);
                System.out.format("O dobro da área do quadrado: %.2f \n", area*2);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            //OPÇÃO - 2
            }else if (opcao == 2) {
                //COMANDO DE ENTRADA/SAIDA DE DADOS
                System.out.print("Digite o raio do circulo: "); 
                raio = entrada.nextFloat(); 
                System.out.println("----------------------------------------"); 
                        
                //A VARIAVEL AREA RECEBE O VALOR DE PI
                //MULTIPLICADO PELO RAIO MULTIPICADO POR ELE MESMO.
                area = (float) (PI * raio * raio);
        
                //COMANDO DE SAIDA DE DADOS
                System.out.printf("A área do circulo é: %.2f \n", area);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            //OPÇÃO - 3
            }else if (opcao == 3) {
                //COMANDOS DE SAIDA/ENTRADA DE DADOS
                System.out.println("---------Digite o valor dos lados---------");
                System.out.print("lado - 1: ");
                lado = entrada.nextInt();
        
                System.out.print("lado - 2: ");
                lado_2 = entrada.nextInt();
        
                System.out.print("lado - 3: ");
                lado_3 = entrada.nextInt();
                System.out.println("----------------------------------------");

                //ESTRUTURA CONDICIONAL
                if (lado+lado_2> lado_3 && lado+lado_3> lado_2 && lado_2+lado_3> lado) {
                    System.out.println("Os três lados formam um triângulo!");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                }
                else {
                    System.out.println("Os três lados NÃO formam um triangulo"); 
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");        
                }
                if(lado==lado_2 && lado==lado_3) {
                    System.out.println("Do tipo Equilatero");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                }
                if (lado==lado_2 && lado==lado_3 && lado_2==lado_3) {
                    System.out.println("Do tipo Isoceles");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                }
                if (lado!=lado_2  && lado!=lado_3 && lado_2!=lado_3) {
                    System.out.println("Do tipo Escaleno");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                }
        
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
