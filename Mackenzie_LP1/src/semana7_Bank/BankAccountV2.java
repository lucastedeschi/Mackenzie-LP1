/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7_Bank;

import semana6_Bank.*;

/**
 *
 * @author Lucas Tedeschi
 */
public class BankAccountV2 {
    private double balance;
    public BankAccountV2(){
        balance = 0;
    }
    public BankAccountV2(double initialBalance){
        if (initialBalance >= 0){
            balance = initialBalance;
        }
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withDraw(double amount){
        balance-=amount + ((amount/100)*0.05);
    }
    public void limit(double limit){
        if (balance > limit){
            balance = -1;
        }
    }
    public void setBalance(double b){
        balance = b;
    }
    public double getBalance(){
        if (balance >= 0){
            return balance;
        }
        return -1;
    }
    void yield(double d) {
        balance += (balance/100) * 6.5;
    }
    void transfer(BankAccountV2 b) {
        b.balance += this.balance;
        this.balance = 0; 
    }
}
