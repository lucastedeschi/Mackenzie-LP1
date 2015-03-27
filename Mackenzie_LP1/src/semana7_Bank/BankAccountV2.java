/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7_Bank;

/**
 *
 * @author Lucas Tedeschi
 */
public class BankAccountV2 {
    private double balance;
    private int accountNumber;
    public BankAccountV2(){
        balance = 0;
    }
    public BankAccountV2(int accountNumber, double initialBalance){
        if (initialBalance >= 0){
            balance = initialBalance;
            this.accountNumber = accountNumber;
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
    public void setAccountNumber(int b){
        accountNumber = b;
    }
    public double getBalance(){
        if (balance >= 0){
            return balance;
        }
        return -1;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    void yield(double d) {
        balance += (balance/100) * 6.5;
    }
    void transfer(BankAccountV2 b) {
        b.balance += this.balance;
        this.balance = 0; 
    }
}
