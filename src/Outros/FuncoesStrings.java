package Outros;

public class FuncoesStrings {
  public static void main(String[] args) {
    String nome = "Gustavo Oliveira";

    System.out.println("Original: " + nome);
    System.out.println("Minusculo: " + nome.toLowerCase());
    System.out.println("Maiusculo: " + nome.toUpperCase());
    System.out.println("Remove espaços nos cantos: " + nome.trim());
    System.out.println("Substring: " + nome.substring(0, 7));
    System.out.println("Replace: " + nome.replace("a", "x"));
    System.out.println("Primeiro Indice: " + nome.indexOf("s"));
    System.out.println("Ultimo Indice: " + nome.lastIndexOf("a"));
    String[] nomes = nome.split(" ");
    System.out.printf("Split: %s %s %n", nomes[0], nomes[1]);
  }
}
