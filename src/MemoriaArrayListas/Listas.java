package MemoriaArrayListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Listas
 * - estrutura de dados homogênea (mesmo tipo de dados)
 * - ordenada (elementos acessados por meio de posições)
 * - Inicia vazia, e seus elementos são alocados sob demanda
 * - Cada elemento ocupa um "nó" (ou nodo) da lista
 * 
 * Tipo (Interface) : List
 * - Classes que implementam: ArrayList, LinkedList, etc...
 * 
 * Vantagens:
 * - Tamanho variável
 * - Facilidade par se realizar inserções e deleções
 * 
 * Desvantagens:
 * - Acesso sequencial aos elementos ** (depende da implementação da lista ARRAYLIST)
 */

public class Listas {
  public static void main(String[] args) {
    // Não aceita tipos primitivos (somente Wrapper classes)
     List<String> nomes = new ArrayList<>();

     // Adicionando elementos
     nomes.add("Gustavo");
     nomes.add("Giovanna");
     nomes.add("Maryanna");
     nomes.add("Wanessa");

    System.out.println("ADD: ");
    for (String nome: nomes) {
      System.out.println(nome);
    }
    System.out.println();

    // Adicionando elementos pelo indice da lista
    nomes.add(1, "Gilmar");
    System.out.println("ADD INDEX: ");
    for (String nome: nomes) {
      System.out.println(nome);
    }
    System.out.println();

    nomes.remove("Maryanna");
    nomes.removeIf(x -> x.contains("nn"));

    System.out.println("REMOVE: ");
    for (String nome: nomes) {
      System.out.println(nome);
    }
    System.out.println();

    System.out.println("INDEX IF: " + nomes.indexOf("Gustavo"));
    System.out.println();

    List<String> filtrados = nomes.stream()
      .filter(nome -> nome.contains("W"))
      .collect(Collectors.toList());

    System.out.println("FILTRADOS: ");
    for (String nome: filtrados) {
      System.out.println(nome);
    }
    System.out.println();

    String busca = nomes.stream()
      .filter(nome -> nome.contains("J"))
      .findFirst()
      .orElse(null);

    System.out.println();
    System.out.println("BUSCADO: " + busca);
  }
}
