/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import semana11.*;
import java.util.Date;

/**
 *
 * @author 41406133
 */
public class CityLawAccount extends LawAccount{
    public String city;
    
    public CityLawAccount(String TP, int accountNumber, String password, String owner, double balance, String reason, String dateCreation, String dateClearance, String city){
        super(TP, accountNumber, password, owner, balance, reason, dateCreation, dateClearance);
        this.city = city;
    } 
    public double getBalance(){
        return super.getBalance();
    }
    @Override
    public String toString(){
       return super.toString() + (" - Cidade: " + this.city + "\n");
    }
}
