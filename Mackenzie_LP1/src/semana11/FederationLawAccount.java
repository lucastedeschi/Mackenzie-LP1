/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

import java.util.Date;

/**
 *
 * @author 41406133
 */
public class FederationLawAccount extends LawAccount{
    public int instance;
    
    public FederationLawAccount(String TP, int accountNumber, String password, String owner, double balance, String reason, String dateCreation, String dateClearance, int instance){
        super(TP, accountNumber, password, owner, balance, reason, dateCreation, dateClearance);
        this.instance = instance;
    } 
    @Override
    public double getBalance(){
        return super.getBalance();
    }
    @Override
    public String toString(){
       return super.toString() + (" - Número: " + this.instance + "\n");
    }
}