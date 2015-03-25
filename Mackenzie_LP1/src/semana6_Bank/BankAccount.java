/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6_Bank;

/**
 *
 * @author Lucas Tedeschi
 */
public class BankAccount {
    private double balance;
    public BankAccount(){
        balance = 0;
    }
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withDraw(double amount){
        balance-=amount;
    }
    public void setBalance(double b){
        balance = b;
    }
    public double getBalance(){
        return balance;
    }
}
