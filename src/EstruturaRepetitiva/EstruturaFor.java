package EstruturaRepetitiva;

import java.util.Scanner;

public class EstruturaFor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos 'BOM DIA' você deseja ?: ");
    int vezes = sc.nextInt();
    sc.nextLine();

    for (int contador = 0; contador < vezes; contador++) {
      System.out.println("Bom dia");
    }
  }
}
