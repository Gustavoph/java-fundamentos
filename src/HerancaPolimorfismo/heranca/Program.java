package HerancaPolimorfismo.heranca;

import HerancaPolimorfismo.heranca.entities.BusinessAccount;

/*
 * Herança
 * - Relação "é-um" (Uma BusinessAccount É-UMA Account)
 * - Superclassse (classe base "Account") e subclasse (classe derivada "BusinessAccount")
 * - Herança é uma associação entre classes e não entre objetos
 */


public class Program {
  public static void main(String[] args) {
    BusinessAccount account = new BusinessAccount();
    account.loan(100.0);
  }
}
