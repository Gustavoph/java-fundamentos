package MemoriaArrayListas;

public class ForEach {
  public static void main(String[] args) {
    int[] idades = new int[] { 22, 39 };

    for (int idade: idades) {
      System.out.println(idade);
    }

    String[] nomes = new String[] { "Gustavo", "Oliveira" };

    for (String nome: nomes) {
      System.out.println(nome);
    }
  }
}
