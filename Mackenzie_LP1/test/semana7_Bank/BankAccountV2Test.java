/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7_Bank;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Lucas Tedeschi
 */
public class BankAccountV2Test {
    
    public BankAccountV2Test() {
    }
//    @Test
//    public void testBankAccount(){
//        BankAccountV2 a = new BankAccountV2(-100);
//        Assert.assertEquals(0.0, a.getBalance(),0.0); 
//    // Extra 01: se foi digitado um valor negativo, balance se mantém como 0.
//    }
//    @Test
//    public void testGetBalanceNegative(){
//        BankAccountV2 a = new BankAccountV2(0);
//        a.withDraw(100);
//        Assert.assertEquals(-1, a.getBalance(),0.0);
//    // Extra 02: se o saldo estive negativo, balance ficará como -1.
//    }
//    @Test
//    public void testwithDrawPercent(){
//        BankAccountV2 a = new BankAccountV2(100);
//        a.withDraw(10);
//        Assert.assertEquals(89.995, a.getBalance(),0.0);
//    // Extra 04: verifica se a taxa de 0,05% sobre o valor sacado foi aplicada.
//    }
    @Test
    public void testnumberName(){
        BankAccountV2 b = new BankAccountV2(2500.03, "J4oaquim Silva Filho");
        Assert.assertFalse(b.numberName());
    }       
    @Test
    public void testPassword(){
        BankAccountV2 b = new BankAccountV2(2500.03, "Joaquim Silva Filho");
        b.getPassword();
    }
}
