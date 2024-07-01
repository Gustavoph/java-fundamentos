package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);


    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();

    System.out.print("Digite sua idade: ");
    int idade = sc.nextInt();
    sc.nextLine();

    System.out.print("Digite seu salário: ");
    double salario = sc.nextDouble();
    sc.nextLine();

    System.out.print("Digite seu sexo: ");
    char sexo = sc.next().charAt(0);
    sc.nextLine();

    System.out.printf("Bem vindo(a): %s %n", nome);
    System.out.printf("Sua categoria é: %d %n", idade);
    System.out.printf("Sua média salárial é: %.2f %n", salario);
    System.out.printf("Seu sexo é: %c %n", sexo);

    sc.close();
  }
}
