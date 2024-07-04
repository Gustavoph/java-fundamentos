package HerancaPolimorfismo.classesMetodosFinal.entities;

public final class SavingsAccount extends Account {
  private Double interestRate;

  public SavingsAccount() {}

  public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public void updateBalance() {
    this.balance += this.balance * interestRate;
  }

  @Override
  public void withdraw(double amount) {
    this.balance -= amount;
  }
}
