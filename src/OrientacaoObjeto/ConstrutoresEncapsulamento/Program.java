package OrientacaoObjeto.ConstrutoresEncapsulamento;

import OrientacaoObjeto.ConstrutoresEncapsulamento.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Informar dados do produto: ");

    System.out.print("Nome: ");
    String nome = sc.nextLine();

    System.out.print("Preço: ");
    double preco = sc.nextDouble();
    sc.nextLine();

    System.out.print("Quantidade: ");
    int quantidade = sc.nextInt();
    sc.nextLine();

    Produto produto = new Produto();
    produto.setNome(nome);
    System.out.println(produto.toString());

    System.out.println();
    System.out.print("Entre um numero de produtos para adicionar no estoque: ");
    quantidade = sc.nextInt();
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
