/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import semana11.*;

/**
 *
 * @author 41406133
 */
public class StateLawAccount extends LawAccount {
    public String state;
    
    public StateLawAccount(String TP, int accountNumber, String password, String owner, double balance, String reason, String dateCreation, String dateClearance, String state){
        super(TP, accountNumber, password, owner, balance, reason, dateCreation, dateClearance);
        this.state = state;
    } 
    @Override
    public double getBalance(){
        return super.getBalance();
    }
    @Override
    public String toString(){
       return super.toString() + (" - Estado: " + state + "\n");
    }
}  
