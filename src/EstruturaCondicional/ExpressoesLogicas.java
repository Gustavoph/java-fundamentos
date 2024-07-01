package EstruturaCondicional;

public class ExpressoesLogicas {
  public static void main(String[] args) {
    int idade = 22;
    String nome = "Gustavo";

    // And só é verdade se ambas as condições forem verdadeiras
    System.out.printf("And: %b %n", idade >= 18 && nome == "Gustavo");
    System.out.printf("And: %b %n", idade >= 18 && nome != "Gustavo");

    // Or é verdade se qualquer uma das condições forem verdadeiras
    System.out.printf("Or: %b %n", idade >= 18 || nome == "Gustavo");
    System.out.printf("Or: %b %n", idade >= 18 || nome != "Gustavo");

    // Not ele inverte o valor final, se for true vira falso, falso vira true
    System.out.printf("Not: %b %n", !(idade >= 18 && nome == "Gustavo"));
    System.out.printf("Not: %b %n", !(idade >= 18 || nome != "Gustavo"));
  }
}
