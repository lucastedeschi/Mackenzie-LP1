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
    public void sort(){
        int j,i,min;
        for(i = 0;i < accounts.size()-1;i++){
            min = i;
            for(j = i + 1;j < accounts.size();j++){
                if(accounts.get(j).getAccountNumber() < accounts.get(i).getAccountNumber()){
                   min = j;
                }
            }
            BankAccount aux = accounts.get(min);
            accounts.set(j, accounts.get(i));
            accounts.set(i, accounts.get(j));            
        }
    }
    public static void main(String args[]){
        BankArray b = new BankArray();
        BankAccount cb1 = new BankAccount(01,"senha","Lucas",100);
        BankAccount cb2 = new BankAccount(02,"senha","Jonatas",200);
        BankAccount cb3 = new BankAccount(03,"senha","Rubens",300);
        BankAccount cb4 = new BankAccount(04,"senha","João",400);  
        b.addAccount(cb1);
        b.addAccount(cb2);
        b.addAccount(cb3);
        b.addAccount(cb4);
        b.sort();
    }
}
