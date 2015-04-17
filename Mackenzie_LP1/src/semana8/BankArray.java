/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;
import java.util.ArrayList;
/**
 *
 * @author 41406133
 */
public class BankArray {
    private ArrayList<BankAccount> accounts;
    
    public BankArray(){
        accounts = new ArrayList<BankAccount>(100);
    }
    public void addAccount(BankAccount a){
        accounts.add(a);
    }
    public double getTotalBalance(){
        double soma = 0.0;
        for(BankAccount b : accounts){
            soma = soma + b.getBalance();
        }
        return soma;
    }
    public BankAccount find(int accountNumber){
        for(BankAccount b : accounts){ //BankAccount = tipo -- b = contador -- accounts = nome do vetor
            if(b.getAccountNumber() == accountNumber){
                return b;
            }        
        }  
        return null;
    }
    public BankAccount getMaximum(){
        if(accounts.isEmpty()){
            return null;
        }
        BankAccount max = accounts.get(0);
        for(BankAccount b : accounts){
            if (b.getBalance() > max.getBalance()){
                max = b;
            }
        }
        return max;
    }
    public int count(int limit){
        int cont = 0;
        for(BankAccount b : accounts){
            if (b.getBalance() >= limit){
                cont++;
            }
        }
        return cont;
    }
}
