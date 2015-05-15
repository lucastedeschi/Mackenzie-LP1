/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

import semana8.*;

/**
 *
 * @author 41406133
 */
public abstract class BankAccount {
    protected int accountNumber;
    protected String password;
    protected String owner;
    protected double balance;
    protected String TP;
    
    public BankAccount(String TP, int accountNumber, String password, String owner, double balance){
        this.accountNumber = accountNumber;
        this.TP = TP;
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
    public abstract double getBalance();
    
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getPassword(){
        return password;
    }
    public String getOwner(){
        return owner;
    }
    public abstract String toString();
}