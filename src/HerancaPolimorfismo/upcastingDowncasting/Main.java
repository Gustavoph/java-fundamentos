package HerancaPolimorfismo.upcastingDowncasting;

import HerancaPolimorfismo.heranca.entities.Account;
import HerancaPolimorfismo.heranca.entities.BusinessAccount;

public class Main {
  public static void main(String[] args) {
    Account acc = new Account(1001, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1001, "Alex", 0.0, 500.0);
    
    /* 
     * Upcasting
     * - Uma conta businessAccount é uma account, logo pode ser feito
     * o upcasting
     */ 
    Account acc2 = bacc;
    Account acc3 = new BusinessAccount();

     /* 
     * Downcasting
     * - O inverso não pode ser feito de maneira natural pois
     * o que existe em uma subclasse pode não existir na superclasse,
     * caso não tenha problema, basta avisar o compilador, com a 
     * tipagem a frente da instanciação
     * 
     * - Para evitar error de downcasting, pode usar o instanceof
     */
    BusinessAccount bacc2 = (BusinessAccount) acc2;
    BusinessAccount bacc3 = (BusinessAccount) acc3;

    if (acc3 instanceof BusinessAccount) {
      BusinessAccount bacc4 = (BusinessAccount) acc3;
    }
  }
}
