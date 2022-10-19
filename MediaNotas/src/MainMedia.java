//MÉDIA DE NOTAS 
//@author: YANGZ
//DATA: 18/10/22

//V1 - Boletim escolar que recebe quantas notas o usuario quer

//CLASSE SCANNER
import java.util.Scanner;

public class MainMedia {
    public static void main(String[] args) throws Exception {
        //OBJETO TIPO SCANNER
        Scanner entrada = new Scanner(System.in);

        //VARIAVEIS
        int opcao;
        float nota_1, nota_2, nota_3, nota_4, soma, media;
        
        //DISPLAY
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("        --> BOLETIM ESCOLAR <--");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
 
        //LAÇO
        boolean sair = true;
        while (sair == true) {
            //MENU
            System.out.println("            ||   MENU   ||");
            System.out.println("----------------------------------------");
            System.out.println("[1] Calcular média de 2 notas\n[2] Calcular média de 4 notas\n[3] Sair");
            System.out.println(" ");
            //ENTRADA DE DADOS
            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            //ESTRUTURA CONDICIONAL - MENU
            //OPÇÃO - 1
            if (opcao == 1) {
                //COMANDO DE ENTRADA/SAIDA DE DADOS
                System.out.print("Digite a nota da  1° Prova: "); 
                nota_1 = entrada.nextFloat();
                System.out.print("Digite a nota da  2° Prova: "); 
                nota_2 = entrada.nextFloat();
                System.out.println("----------------------------------------"); 
        
                //PROCESSAMENTO
                soma = nota_1 + nota_2; 
                media = soma / 2;

                //ESTRUTURA CONDICIONAL - APROVAÇÃO

                //APROVADO
                if (media >= 6) {
                    System.out.format("Aluno (APROVADO) com média: %.2f\n", media);
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");               
                }
                //REPROVADO
                else {
                    System.out.format("Aluno (REPROVADO) com média: %.2f\n", media);  
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");     
                }
            }
            //OPÇÃO - 2
            else if (opcao == 2) {
                //COMANDO DE ENTRADA/SAIDA DE DADOS
                System.out.print("Digite a nota da  1° Prova: "); 
                nota_1 = entrada.nextFloat();
                System.out.print("Digite a nota da  2° Prova: "); 
                nota_2 = entrada.nextFloat();
                System.out.print("Digite a nota da  3° Prova: "); 
                nota_3 = entrada.nextFloat();
                System.out.print("Digite a nota da  4° Prova: "); 
                nota_4 = entrada.nextFloat();
                System.out.println("----------------------------------------"); 
        
                //PROCESSAMENTO
                soma = nota_1 + nota_2 + nota_3 + nota_4; 
                media = soma / 4;

                //ESTRUTURA CONDICIONAL - APROVAÇÃO

                //APROVADO
                if (media >= 6) {
                    System.out.format("Aluno (APROVADO) com média: %.2f\n", media);
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");               
                }
                //REPROVADO
                else {
                    System.out.format("Aluno (REPROVADO) com média: %.2f\n", media);  
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");     
                }   
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
