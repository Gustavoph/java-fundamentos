package TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * StackTrace
 * - Mostra a sequencia de chamadas que gerou a exceção
 */

public class StackTrace {
  public static void main(String[] args) {
    StackTrace.method();
  }

  public static void method() {
    Scanner sc = new Scanner(System.in);
    
    try {
      String[] vect = sc.nextLine().split(" ");
      int position = sc.nextInt();
      System.out.println(vect[position]);
  
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("Inválid position");
    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("Input error");
    }
    
    sc.close();
  }
}
