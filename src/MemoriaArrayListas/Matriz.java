package MemoriaArrayListas;
/*
 * Matrizes
 * - arranjos bidimensionais (vetor de vetores)
 * - homogênea (dados do mesmo tipo)
 * - ordenada (elementos acessados por meio de posições)
 * - Alocado uma unica vez, em um bloco contíguo de memória
 * 
 * Vantagens
 * - Acesso imediato aos elementos pela sua posição
 * 
 * Desvantagens
 * - Tamanho fixo
 * - Dificuldade para se realizar inserções e deleções
*/

import java.util.Scanner;

public class Matriz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o tamanho da matriz: ");
    int n = sc.nextInt();
    int[][] matriz = new int[n][n];
    
    for (int linha = 0; linha < matriz.length ; linha++) {
      for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        matriz[linha][coluna] = sc.nextInt();
      }
    }

    System.out.print("Diagonal Principal: ");
    for (int linha = 0; linha < matriz.length; linha++) {
      System.out.print(matriz[linha][linha] + " ");
    }

    int contador = 0;
    for (int linha = 0; linha <  matriz.length; linha++) {
      for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        if (matriz[linha][coluna] < 0) { 
          contador++; 
        }
      }
    }
    
    System.out.println();
    System.out.println("Numeros negativos: " + contador);
    sc.close();
  }
}
