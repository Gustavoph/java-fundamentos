package Outros;

public class Funcoes {
  public static void main(String[] args) {
    System.out.println(soma(10, 5));
    System.out.println(Funcoes.soma(10, 5));

    showMessage("Hello World!");
    showMessage("Welcome!");
  }

  public static int soma(int x, int y) {
    return x + y;
  }

  public static void showMessage(String message) {
    System.out.println(message);
  }
}
