package MemoriaArrayListas.entidades;
/*
 * Implementa o método compareTo
 */


public class Account implements Comparable<Account> {
  private String name; 
  private Double salary;

  public Account(String name, Double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Override
  public int compareTo(Account other) {
    return this.name.compareTo(other.getName());
  }
}
