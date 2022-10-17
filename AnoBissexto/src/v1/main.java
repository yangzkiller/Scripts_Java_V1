package v1;
//CLASSE SCANNER
import java.util.Scanner;
/* @author Yangz
 * @data: 16/10/2022
 * Programa que peça um número correspondente a um determinado ano
 * e em seguida informe se este ano é ou não bissexto. 
 */
public class main {
    public static void main(String[] args) {
        //OBJETO TIPO SCANNER
        Scanner entrada = new Scanner(System.in);
        //VARIAVEIS
        int ano;
        //COMANDOS DE SAIDA/ENTRADA DE DADOS
        System.out.print("Ano: ");
        ano = entrada.nextInt();
        //ESTRUTURA CONDICIONAL
        if(ano % 4 == 0) {
            System.out.println("É bissexto!");       
        }else {
            System.out.println("Não é bissexto!");
        }
    } 
}
