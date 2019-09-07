
package multiplicacaomatriz;

import java.util.Scanner;


public class MultiplicacaoMatriz {

    
    public static void main(String[] args) {
        
        //Possibilita ler as variáveis
        Scanner leia = new Scanner(System.in);
       
        //declaração das variáveis
       int numero = 0;
         
       //Leitura do número de colunas e linhas
        System.out.println("Informe a quantidade de LINHAS que você deseja em sua matriz:");
       final int quantidadeLinhas = leia.nextInt();
        
        System.out.println ("Informe a quantidade de COLUNAS que você deseja em sua matriz:");
       final int quantidadeColunas = leia.nextInt();
       
       //declaração das matrizes
        int [][] matrizA = new int [quantidadeLinhas][quantidadeColunas];
        int [][] matrizB = new int [quantidadeLinhas][quantidadeColunas];
        
        //leitura dos dados da mmatriz
        for (int linha = 0; linha < matrizA.length; linha++) {
            for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {
                System.out.println ("Digite os valores de Matriz A:");
                matrizA [linha][coluna] = leia.nextInt();
            }        
        }
        //numero a ser multiplicado
        System.out.println("Informe um número para multiplicar com Matriz A");
        numero = leia.nextInt();
        
        //percorre a matriz
        for (int linha = 0; linha < matrizB.length; linha++) {
            for (int coluna = 0; coluna < matrizB[linha].length; coluna++)
        
        //faz o cálculo        
         matrizB [linha] [coluna] = ((numero) * (matrizA [linha][coluna]));
        } 
        //percorre matrizB para impressão dos dados
         for (int linha = 0; linha < matrizB.length; linha++) {
            for (int coluna = 0; coluna < matrizB[linha].length; coluna++)
            
        System.out.print("["+linha+"]"+"["+coluna+"] => "+matrizB [linha][coluna]+"\t"); //\n
         System.out.println("");
        }   
    }
    
}
