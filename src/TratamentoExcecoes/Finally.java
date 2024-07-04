package TratamentoExcecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Finally
 * - Bloco de código que será executado independente 
 * se der erro ou não
 * - Muito utilizado para fechar conexões
 */

public class Finally {
  public static void main(String[] args) {
    File file =  new File("./message.txt");
    Scanner sc = null;

    try {
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch(FileNotFoundException e) {
      System.out.println("Error opening file: " + e);
    } finally {
      System.out.println("Finally block executed");
      if (sc != null) { sc.close(); }
    }
  }
}
