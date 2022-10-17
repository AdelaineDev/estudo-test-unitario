package TestEntities;


import TestFactory.AccountFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class testAccount extends AccountFactory {
    @Test
    public void testarDepositoValorPositivoAumentaSaldo(){
         double amount = 200.0;
         double valorEsperado =  196.0;
         Account acc = AccountFactory.criaUmacontaVazia();

         acc.deposit(amount);

        Assertions.assertEquals(valorEsperado, acc.getBalance());


    }
    @Test
    public  void testarDepositodeValorNegativo(){
        double valorEsperado = 100.0;
        Account acc = AccountFactory.criarUmaConta(valorEsperado);

        acc.deposit(-200.00);
        Assertions.assertEquals(valorEsperado, acc.getBalance());
    }
    @Test
    public  void testarZerarConta(){
        double valorEsperado = 0.0;
        double valorInicial = 300.00;
        Account acc = AccountFactory.criarUmaConta(valorInicial);

        double valorFinal = acc.fullWithrow();

        Assertions.assertEquals(valorEsperado, acc.getBalance());
        Assertions.assertEquals(valorFinal, valorInicial);


    }

}
