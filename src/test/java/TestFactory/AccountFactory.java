package TestFactory;

import TestEntities.Account;

public class AccountFactory {
    public  static Account criaUmacontaVazia(){
        return new Account(1L, 0.0);
    }
    public  static Account criarUmaConta(double saldoInicial){

        return new Account(1L, saldoInicial);
    }


}
