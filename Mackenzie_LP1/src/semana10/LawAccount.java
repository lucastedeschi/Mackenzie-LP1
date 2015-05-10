/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;
import java.util.*;

/**
 *
 * @author Lucas
 */
public abstract class LawAccount 
    extends BankAccount{
    
    public String reason;
    public String dateCreation;
    public String dateClearance;
    public double admRate;
    
    public LawAccount(String TP, int accountNumber, String password, String owner, double balance, String reason, String dateCreation, String dateClearance){
        super(TP, accountNumber, password, owner, balance);
        this.reason = reason;
        this.dateClearance = dateClearance;
        this.dateCreation = dateCreation;
    } 
    @Override
    public double getBalance(){
        return super.balance-(admRate);
    }
    @Override
    public String toString(){
       return "Tipo de conta: " + super.TP + " - Account number: " + super.accountNumber + " - Account owner: " + super.owner + " - Account password: " + super.password + " - Account balance: " + super.balance + " - Razão: " + reason + " - Data de Criação: " + dateCreation + " - Data de Apuração: " + dateClearance;
    }
}
