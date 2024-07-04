package HerancaPolimorfismo.classesAbstratas;

import java.util.ArrayList;
import java.util.List;

import HerancaPolimorfismo.classesAbstratas.entities.Account;
import HerancaPolimorfismo.classesAbstratas.entities.BusinessAccount;
import HerancaPolimorfismo.classesAbstratas.entities.SavingsAccount;

/*
 * Classes abstratas
 * - Não é possível instanciar uma classe abstrata
 * somente extender ela
 * 
 * - Mesmo sem poder instanciar, fazemos a classe abstrata
 * para poder prover reuso
 * - Polimorfismo, a superclasse generica (abstract) permite
 * tratar todas as subclasses de maneira mais facil e genérica
 */

public class Main {
  public static void main(String[] args) {
    List<Account> accounts = new ArrayList<>();

    accounts.add(new SavingsAccount(101, "Alex", 500.00, 0.01));
    accounts.add(new BusinessAccount(1002, "Bob", 1000.0, 400.0));

    double sum = 0.0;
    for (Account account: accounts) {
      sum += account.getBalance();
    }

    System.out.printf("Total Balance: %.2f%n", sum);

    sum = 0.0;
    for (Account account: accounts) {
      account.deposit(100.0);
      sum += account.getBalance();
    }    
    
    System.out.printf("Total Balance: %.2f%n", sum);
  }
}
