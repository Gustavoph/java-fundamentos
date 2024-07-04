package EnumeracaoComposicao.composicao.entities;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

import EnumeracaoComposicao.composicao.entities.enums.WorkerLevel;

public class Worker {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;
  private Departmant departmant;
  private List<HourContract> contracts = new ArrayList<>();

  public Worker() {}

  public Worker(String name, WorkerLevel level, Double baseSalary, Departmant departmant) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.departmant = departmant;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkerLevel getLevel() {
    return level;
  }

  public void setLevel(WorkerLevel level) {
    this.level = level;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public Departmant getDepartmant() {
    return departmant;
  }

  public void setDepartmant(Departmant departmant) {
    this.departmant = departmant;
  }

  public List<HourContract> getContracts() {
    return contracts;
  }

  public void addContract(HourContract contract) {
    this.contracts.add(contract);
  }

  public void removeContract(HourContract contract) {
    this.contracts.remove(contract);
  }

  public double income (int year, int month) {
    double totalIncome = this.baseSalary;

    YearMonth targetDate = YearMonth.of(year, month);

    totalIncome += contracts.stream()
            .filter(contract -> YearMonth.from(contract.getDate()).equals(targetDate))
            .mapToDouble(HourContract::totalValue)
            .sum();

    return totalIncome;
  }
}
