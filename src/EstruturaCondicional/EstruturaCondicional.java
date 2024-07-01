package EstruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicional {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Que horas são agora: ");
    int hora = sc.nextInt();
    sc.nextLine();

    // if/else
    if (hora >= 0 && hora < 12) {
      System.out.println("Bom dia!");
    } else if (hora >= 12 && hora < 18) {
      System.out.println("Boa tarde!");
    } else if (hora >= 18 && hora < 24) {
      System.out.println("Boa noite!");
    } else {
      System.out.println("Hora não identificada");
    }

    System.out.print("Qual linguagem vc programa [JS | JAVA]: ");
    String linguagem = sc.nextLine();

    // switch/case
    switch (linguagem) {
      case "JS":
        System.out.println("undefined");
        break;
      case "JAVA":
        System.out.println("stack overflow");
        break;
      default:
        System.out.println("Linguagem não identificada");
        break;
    }

    // ternário
    System.out.print("CR7 é o melhor jogador do mundo? (S/N): ");
    String resposta = sc.nextLine();
    System.out.println((resposta.equals("S")) ? "Boa!" : "BANIDO!");
  }
}
