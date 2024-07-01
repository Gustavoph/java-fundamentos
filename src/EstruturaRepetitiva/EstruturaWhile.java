package EstruturaRepetitiva;

import java.util.Scanner;

public class EstruturaWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("O CR7 é o Goat? : (S/N): ");
    String resposta = sc.nextLine();

    while (!resposta.equals("S")) {
      System.out.print("O CR7 é o Goat? : (S/N): ");
      resposta = sc.nextLine();
    }
  }
}
