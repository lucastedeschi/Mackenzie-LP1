/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

/**
 *
 * @author 41406133
 */
public class Bank {
    private BankAccount accounts[];
    private int last;
    
    public Bank(){
        accounts = new BankAccount[100];
        last = 0;
    }
    public void addAccount(BankAccount a){
        if (last <= 99){
            accounts[last] = a;
            last++;
        }
    }
    public double getTotalBalance(){
        double soma = 0.0;
        for(int i=0;i<last;i++){
            soma = soma + accounts[i].getBalance();
        }
        return soma;
    }
    public BankAccount find(int accountNumber){
        for(int i = 0;i<last;i++){
            if(accounts[i].getAccountNumber() == accountNumber){
                return accounts[i];
            }        
        }  
        return null;
    }
    public BankAccount getMaximum(){
        if(last == 0){
            return null;
        }
        BankAccount max = accounts[0];
        for(int i = 0;i<last;i++){
            if (accounts[i].getBalance() > max.getBalance()){
                max = accounts[i];
            }
        }
        return max;
    }
    public int count(int limit){
        int cont = 0;
        for(int i = 0;i<last;i++){
            if (accounts[i].getBalance() >= limit){
                cont++;
            }
        }
        return cont;
    }
}
