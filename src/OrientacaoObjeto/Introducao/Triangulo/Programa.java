package OrientacaoObjeto.Introducao.Triangulo;

import OrientacaoObjeto.Introducao.Triangulo.entities.Triangulo;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Triangulo x;
    x = new Triangulo();

    System.out.print("Entre os valores do triangulo: ");
    x.a = sc.nextInt();
    x.b = sc.nextInt();
    x.c = sc.nextInt();

    System.out.println(x.area());
  }
}
