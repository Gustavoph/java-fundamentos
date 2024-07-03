package MemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

/*
 * Vetor (arrando de dados unidimensionais)
 * - Estrutura de dados homogênea (dados do mesmo tipo)
 * - Ordernada (elementos acessados por meio de posições)
 * - Alocada de uma vez só, um bloco contíguo em memória
 * - Acesso imediato aos elementos pela sua posição (VANTAGEM)
 * - Tamanho fixo e dificuldade de inserir e deletar elementos (DESVANTAGEM)
 */

public class Vetores {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int quantidade = sc.nextInt();

    double[] vetor = new double[quantidade];

    for(int contador = 0; contador < quantidade; contador++) {
      vetor[contador] = sc.nextDouble();
    }

    double soma = 0.0;

    for(int contador = 0; contador < quantidade; contador++) {
      System.out.printf("%.2f %n", vetor[contador]);
      soma += vetor[contador];
    }

    double media = soma / quantidade;
    System.out.printf("Altura média: %.2f", media);
    
    sc.close();
  }
}
