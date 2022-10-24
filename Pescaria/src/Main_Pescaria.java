//CLASSE SCANNER
import java.util.Scanner;

/**
 * @author Yangz
 * controlar o rendimento diário. 
 * Toda vez que ele traz um peso de peixes maior que o estabelecido 
 * pelo regulamento de pesca do estado de São Paulo (50 quilos) 
 * deve pagar uma multa de R$ 4,00 por quilo excedente. 
 * João precisa que você faça um programa que leia a variável peso (peso de peixes)
 * e calcule o excesso. 
 * Gravar na variável excesso a quantidade de quilos além do limite e na variável multa
 * o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas. 
 */

public class Main_Pescaria {
    public static void main(String[] args) {
        //OBJETO TIPO SCANNER
        Scanner entrada = new Scanner(System.in);

        //VARIAVEIS
        int pesoLimit = 50;
        double peso, excesso, multa, valor, total;
        int opcao;
        
        //DISPLAY
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("            --> PESCARIA <--");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //LAÇO
        boolean sair = true;
        while (sair == true) {
            //MENU
            System.out.println("             ||   MENU   ||");
            System.out.println("----------------------------------------");
            System.out.println("[1] Calcular valor da multa\n[2] Calcular valor de venda\n[3] Sair");
            System.out.println(" ");
            //ENTRADA DE DADOS
            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            //ESTRUTURA CONDICIONAL - MENU
            //OPÇÃO - 1
            if (opcao == 1) {
                //COMANDO DE ENTRADA/SAIDA DE DADOS
                System.out.print("Digite a quantidade de Peixes(Kg): ");
                peso = entrada.nextFloat(); 
                
                //ESTRUTURA CONDICIONAL
                if (peso > pesoLimit) {
                    //PROCESSAMENTO DOS DADOS
                    excesso = peso - pesoLimit;
                    multa = excesso * 4.00;
                    //COMANDO DE SAIDA DE DADOS
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.format("--> O valor da multa é: R$%.2f \n", multa); 
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                }else {
                    //COMANDO DE SAIDA DE DADOS
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("--> A quantidade de peixes, não excedeu o limite!!");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");      
                }
            }

            //OPÇÃO - 2
            else if (opcao == 2) {
                //COMANDO DE ENTRADA/SAIDA DE DADOS
                System.out.print("Digite a quantidade de Peixes(Kg): ");
                peso = entrada.nextFloat(); 
            
                System.out.print("Digite o valor do (Kg) do peixe: ");
                valor = entrada.nextFloat(); 

                //PROCESSAMENTO DOS DADOS
                total = valor * peso;
                //COMANDO DE SAIDA DE DADOS
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.format("--> O valor da venda é: R$%.2f \n", total); 
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


                        
        }

            //OPÇÃO - 3
            else if (opcao == 3) {
                System.out.println("      --> PROGRAMA ENCERRADO <--");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                sair = false;
            }

            //ERRO
            else {
                System.out.println("        !ERRO! Entrada Inválida");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
        }
    }
}
