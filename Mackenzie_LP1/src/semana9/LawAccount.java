/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;
import java.util.*;

/**
 *
 * @author Lucas
 */
public class LawAccount 
    extends BankAccount{
    
    public String reason;
    public Date dateCreation;
    public Date dateClearance;
    public double admRate;
    
    public LawAccount(int accountNumber, String password, String owner, double balance, String reason, Date dateCreation, Date dateClearance){
        super(accountNumber, password, owner, balance);
        this.reason = reason;
        this.dateClearance = dateClearance;
        this.dateCreation = dateCreation;
    } 
    public double getBalance(){
        return super.getBalance()-(admRate);
    }
}
