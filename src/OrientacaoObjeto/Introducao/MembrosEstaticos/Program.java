package OrientacaoObjeto.Introducao.MembrosEstaticos;

import OrientacaoObjeto.Introducao.MembrosEstaticos.utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o raio: ");
    double raio = sc.nextDouble();
    sc.nextLine();

    double circunferencia = Calculator.cicunferencia(raio);
    double volume = Calculator.volume(raio);

    System.out.printf("Circunferencia: %.2f %n", circunferencia);
    System.out.printf("Volume: %.2f %n", volume);
    System.out.printf("PI: %.2f %n", Calculator.PI);

    sc.close();
  }
}
