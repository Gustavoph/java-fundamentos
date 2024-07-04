package EnumeracaoComposicao.composicao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import EnumeracaoComposicao.composicao.entities.Departmant;
import EnumeracaoComposicao.composicao.entities.HourContract;
import EnumeracaoComposicao.composicao.entities.Worker;
import EnumeracaoComposicao.composicao.entities.enums.WorkerLevel;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter department's name: ");
    String departmentName = sc.nextLine();

    System.out.println("Enter worker data: ");

    System.out.print("Name: ");
    String workerName = sc.nextLine();

    System.out.print("Level: ");
    String workerLevel = sc.nextLine();

    System.out.print("Base Salary: ");
    double workerSalary = sc.nextDouble();
    sc.nextLine();

    Departmant departmant = new Departmant(departmentName);
    Worker worker = new Worker(
      workerName,
      WorkerLevel.valueOf(workerLevel),
      workerSalary,
      departmant
    );

    System.out.print("How many contracts to this worker: ");
    int quantity = sc.nextInt();
    sc.nextLine();

    for (int counter = 0; counter < quantity; counter++) {
      System.out.println("Enter contract " + (counter + 1));
      System.out.print("Date (DD/MM/YYYY): ");
      String dateString = sc.nextLine();
      LocalDate date = LocalDate.parse(dateString, fmt);

      System.out.print("Value per hour: ");
      double value = sc.nextDouble();
      sc.nextLine();

      System.out.print("Duration (hours): ");
      int hours = sc.nextInt();
      sc.nextLine();

      HourContract contract = new HourContract(date, value, hours);
      worker.addContract(contract);
    }

    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = sc.nextLine();
    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    
    System.out.println("Name: " + worker.getName());
    System.out.println("Departament: " + worker.getDepartmant().getName());
    System.out.println("Income for: " + monthAndYear + ": " +  String.format("%.2f", worker.income(year, month)));

    sc.close();
  }
}
