package MemoriaArrayListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import MemoriaArrayListas.entidades.Account;


/*
 * Ordernar Lista
 * - Para ordernar uma lista que seja uma Entidade (Classe) é necessário
 * implementar a interface CompareTo
 */

public class OrdenarListas {
  public static void main(String[] args) {
    List<Account> accounts = new ArrayList<>();

    accounts.add(new Account("Gustavo", 100.0));
    accounts.add(new Account("Alex", 100.0));

    Collections.sort(accounts);
    

    for(Account account: accounts) {
      System.out.println(account.getName());
    }
  }
}
