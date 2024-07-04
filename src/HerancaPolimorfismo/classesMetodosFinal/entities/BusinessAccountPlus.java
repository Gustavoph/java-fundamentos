package HerancaPolimorfismo.classesMetodosFinal.entities;

public class BusinessAccountPlus extends BusinessAccount {
  // Não da para sobrescrever uma classe com FINAL
  @Override
  public void withdraw(double amount) {
    super.withdraw(amount);
    this.balance -= 2.0;
  }
}
