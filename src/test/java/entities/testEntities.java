package entities;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class testEntities {
    @Test
    public void testardepositopositivoaumentasaldo(){
         double amount = 200.0;
         double valorEsperado =  196.0;
         Account acc = new Account(1L, 0.0);

         acc.deposit(amount);

        Assertions.assertEquals(valorEsperado, acc.getBalance());


    }
    //@Test
    //public  void testSe


}