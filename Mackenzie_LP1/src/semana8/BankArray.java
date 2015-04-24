/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author 41406133
 */
public class BankArray {
    private ArrayList<BankAccount> accounts;
    
    public BankArray(){
        accounts = new ArrayList<BankAccount>();
    }
    public BankArray(String filename){
        accounts = new ArrayList<BankAccount>();
        try{
            BufferedReader r = new BufferedReader(new FileReader(filename));
            String s = r.readLine();
            int q = Integer.parseInt(s);
            ArrayList<String> aux = new ArrayList();
            for(int i = 0;i<q;i++){
                s = r.readLine();
                aux.add(s);
            }
            int indA = 0, indB = 3, indO = 2, indP = 1;
            BankAccount a = null;
            int quantObj = q/4;
            for(int j = 0;j<quantObj;j++){
                double tempB = Double.parseDouble(aux.get(indB));
                int tempA = Integer.parseInt(aux.get(indA));
                a = new BankAccount(tempA,aux.get(indP),aux.get(indO),tempB);
                this.addAccount(a);
                indA = indA + 4;
                indB = indB + 4;
                indO = indO + 4;
                indP = indP + 4;
            }  
        }
        catch(IOException | NumberFormatException e){
            System.exit(-1);
        }
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
            accounts.set(min, accounts.get(i));
            accounts.set(i, aux);            
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
        BankArray a = new BankArray("entrada.txt");
        System.out.println(a);
    }
}
