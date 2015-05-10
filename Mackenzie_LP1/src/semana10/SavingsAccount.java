/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

/**
 *
 * @author Lucas
 */
public class SavingsAccount 
    extends BankAccount{
    
    private double interestRate;
    
    public SavingsAccount(String TP, int accountNumber, String password, String owner, double balance, double interestRate){
        super(TP, accountNumber, password, owner, balance);
        this.interestRate = interestRate;
        super.balance = super.balance+this.interestRate;
    }
    @Override
    public double getBalance(){
        return super.balance;
    } 
    @Override
    public String toString(){
       return "Tipo de conta: " + super.TP + " - Account number: " + super.accountNumber + " - Account owner: " + super.owner + " - Account password: " + super.password + " - Account balance: " + super.balance + " - Juros: " + interestRate + "\n";
    }
}
