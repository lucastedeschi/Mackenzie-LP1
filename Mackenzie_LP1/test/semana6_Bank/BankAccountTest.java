/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6_Bank;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Lucas Tedeschi
 */
public class BankAccountTest {
    
    public BankAccountTest() {
    }
    @Test
    public void testYeld(){
        BankAccount a = new BankAccount(100);
        a.yield(6.5);
        Assert.assertEquals(106.5, a.getBalance(),0.0);
    }
    @Test
    public void testTransfer(){
        BankAccount a = new BankAccount(1000);
        BankAccount b = new BankAccount(500);
        a.transfer(b);
        Assert.assertEquals(0.0, a.getBalance(),0.0);
        Assert.assertEquals(1500, b.getBalance(),0.0);
    }
    @Test
    public void testBankAccount(){
        BankAccount a = new BankAccount(-100);
        Assert.assertEquals(0.0, a.getBalance(),0.0); 
    // Extra 01: se foi digitado um valor negativo, balance se mantém como 0.
    }
    @Test
    public void testGetBalanceNegative(){
        BankAccount a = new BankAccount(0);
        a.withDraw(100);
        Assert.assertEquals(-1, a.getBalance(),0.0);
    // Extra 02: se o saldo estive negativo, balance ficará como -1.
    }
    @Test
    public void testGetBalanceLimit(){
        BankAccount a = new BankAccount(100);
        a.limit(500);
        Assert.assertEquals(100, a.getBalance(),0.0);
    // Extra 03: se o saldo não ultrapassou o limite, ele será o mesmo. Se tivesse ultrapassado, o saldo seria -1.
    }
    @Test
    public void testwithDrawPercent(){
        BankAccount a = new BankAccount(100);
        a.withDraw(10);
        Assert.assertEquals(89.995, a.getBalance(),0.0);
    // Extra 04: verifica se a taxa de 0,05% sobre o valor sacado foi aplicada.
    }
}
