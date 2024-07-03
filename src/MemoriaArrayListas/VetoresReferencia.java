package MemoriaArrayListas;

import java.util.Scanner;

import MemoriaArrayListas.entidades.Produto;

public class VetoresReferencia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe a quantidade de produtos: ");
    int quantidadeProdutos = sc.nextInt();
    sc.nextLine();

    Produto[] produtos = new Produto[quantidadeProdutos];

    for(int contador = 0; contador < produtos.length; contador++) {
      System.out.printf("Informe o nome do produto %d: ", contador + 1);
      String nome = sc.nextLine();

      System.out.printf("Informe o preço do produto %d: ", contador + 1);
      double preco = sc.nextDouble();
      sc.nextLine();

      produtos[contador] = new Produto(nome, preco);
    }

    double somaDosPrecos = 0.0;
    for(int contador = 0; contador < quantidadeProdutos; contador++) {
      System.out.println(produtos[contador].toString());
      somaDosPrecos += produtos[contador].getPreco();
    }

    double media = somaDosPrecos / produtos.length;
    System.out.printf("Preço médio: %.2f", media);
    
    sc.close();
  }
}
