/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

import semana8.*;

/**
 *
 * @author 41406133
 */
public class BankAccount {
    private int accountNumber;
    private String password;
    private String owner;
    private double balance;
    
    public BankAccount(int accountNumber, String password, String owner, double balance){
        this.accountNumber = accountNumber;
        if(password==null){
            password = "123";
        }   else{
                    this.password = password;
                }
        if(owner == null){
            owner = "Nome não-informado";
        }   else{
            this.owner = owner;
            this.balance = balance;
        }
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withDraw(double amount) {
        balance -= amount;
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
    public String getPassword(){
        return password;
    }
    public String getOwner(){
        return owner;
    }
    @Override
    public String toString(){
       return "Account number: " + accountNumber + " - Account owner: " + owner + " - Account password: " + password + " - Account balance: " + balance + "\n";
    }
}
