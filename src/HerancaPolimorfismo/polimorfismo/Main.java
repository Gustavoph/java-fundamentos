package HerancaPolimorfismo.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import HerancaPolimorfismo.polimorfismo.entities.Employee;
import HerancaPolimorfismo.polimorfismo.entities.OutsourcedEmployee;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> employees = new ArrayList<>();

    System.out.print("Enter the number of employees: ");
    int quantity = sc.nextInt();
    sc.nextLine();

    for (int counter = 1; counter <= quantity; counter ++) {
      System.out.println("Employee #" + counter);
      System.out.print("Outsourced: (y/n): ");
      char isOutsourced = sc.next().charAt(0);
      sc.nextLine();

      System.out.print("Name: ");
      String name = sc.nextLine();
      
      System.out.print("Hours: ");
      int hours = sc.nextInt();

      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();

      if (isOutsourced == 'y') {
        System.out.print("Additional charge: ");
        double additionalCharge = sc.nextDouble();
        sc.nextLine();
        employees.add( new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
      } else {
        employees.add(new Employee(name, hours, valuePerHour));
      }
    }

    System.out.println();
    System.out.println("Payments: ");
    for (Employee employee: employees) {
      System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
    }

    sc.close();
  }
}
