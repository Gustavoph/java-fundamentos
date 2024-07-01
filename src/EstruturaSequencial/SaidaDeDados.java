package EstruturaSequencial;

import java.util.Locale;

public class SaidaDeDados {
  public static void main(String[] args) {
    System.out.println("Bom dia - Com quebra de linha");
    System.out.print("Bom dia - Sem quebra de linha");

    int idade = 22;
    System.out.println("\nIdade: " + idade);

    Locale.setDefault(Locale.US);

    double salario = 1412.0;
    System.out.printf("Salário: %.2f%n", + salario);

    String nome = "Gustavo";
    System.out.printf("Nome: %s, Idade: %d, Salário: %.2f%n", nome, idade, salario);
  }
}
