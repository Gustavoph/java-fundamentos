package OrientacaoObjeto.Introducao.Produto;

import OrientacaoObjeto.Introducao.Produto.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Produto produto = new Produto();
    System.out.println("Informar dados do produto: ");

    System.out.print("Nome: ");
    produto.nome = sc.nextLine();

    System.out.print("Preço: ");
    produto.preco = sc.nextDouble();
    sc.nextLine();

    System.out.print("Quantidade: ");
    produto.quantidade = sc.nextInt();
    sc.nextLine();

    System.out.println(produto.toString());

    System.out.println();
    System.out.print("Entre um numero de produtos para adicionar no estoque: ");
    int quantidade = sc.nextInt();
    produto.adicionarProdutos(quantidade);

    System.out.println(produto.toString());

    System.out.println();
    System.out.print("Entre um numero de produtos para remover do estoque: ");
    quantidade = sc.nextInt();
    produto.removerProdutos(quantidade);

    System.out.println(produto.toString());
    sc.close();
  }
}
