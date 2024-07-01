package EstruturaRepetitiva;

import java.util.Scanner;

public class EstruturaDoWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String resposta;

    do {
      System.out.print("O CR7 é o Goat? : (S/N): ");
      resposta = sc.nextLine();
    } while (!resposta.equals("S"));
  }
}
