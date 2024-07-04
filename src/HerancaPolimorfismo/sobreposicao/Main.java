package HerancaPolimorfismo.sobreposicao;

import HerancaPolimorfismo.sobreposicao.entities.Account;
import HerancaPolimorfismo.sobreposicao.entities.BusinessAccount;
import HerancaPolimorfismo.sobreposicao.entities.SavingsAccount;

/*
 * Sobreposição - @Override
 * - Quando você precisa sobrescrever um método da superclasse 
 * na subclasse, é aconselhavel utilizar "@Override" para avisar
 * ao compilador que aquele método é uma sobreposição
 * 
 * Super
 * - Habilita a utilização de métodos da superclasse
 * basta usar super.metodo(), ou super() para chamar o construtor
 * da classe principal
 * - Também podemos utilizar para reaproveitar códigos da superclasse
 */

public class Main {
  public static void main(String[] args) {
    Account acc = new Account(1001, "Gustavo", 1000.0);
    acc.withdraw(200.0);
    System.out.println(acc.getBalance());

    Account acc2 = new SavingsAccount(1002, "Giovanna", 1000.0, 0.01);
    acc2.withdraw(200.0);
    System.out.println(acc2.getBalance());

    Account acc3 = new BusinessAccount(1002, "Giovanna", 1000.0, 500.0);
    acc3.withdraw(200.0);
    System.out.println(acc3.getBalance());
  }
}
