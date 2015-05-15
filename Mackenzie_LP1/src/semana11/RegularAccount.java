/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

/**
 *
 * @author 41406133
 */
public class RegularAccount
    extends BankAccount{
    private double adm;
    
    public RegularAccount(String TP, int accountNumber, String password, String owner, double balance, double adm){
        super(TP, accountNumber, password, owner, balance);
        this.adm=adm;
        super.balance = super.balance+this.adm;
    }
    @Override
    public double getBalance(){
        return super.balance;
    }
    @Override
    public String toString(){
       return "Tipo de conta: " + super.TP + " - Account number: " + super.accountNumber + " - Account owner: " + super.owner + " - Account password: " + super.password + " - Account balance: " + super.balance + " - Taxas Administrativas: " + adm + "\n";
    }
    
}
