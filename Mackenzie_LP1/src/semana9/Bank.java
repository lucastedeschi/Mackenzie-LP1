/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author 41406133
 */
public class Bank{
    private ArrayList<BankAccount> accounts;
    
    public Bank(){
        accounts = new ArrayList<BankAccount>();  
    }
    public Bank(String filename){
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
            int indA = 0, indB = 3, indO = 2, indP = 1, indR = 4;
            BankAccount a = null;
            int quantObj = q/4;
            for(int j = 0;j<quantObj;j++){
                double tempB = Double.parseDouble(aux.get(indB));
                int tempA = Integer.parseInt(aux.get(indA));
                a = new BankAccount(tempA,aux.get(indP),aux.get(indO),tempB);
                this.addBankAccount(a);
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
    public void dump(){
        try{
            BufferedWriter w = new BufferedWriter(new FileWriter("saida.txt"));
            String linha = this.accounts.size()+"";
            int q  = Integer.parseInt(linha);
            for(BankAccount b: this.accounts){
                linha = b.toString();
                w.write(linha+" \r\n");
            }
            w.flush();
            w.close();
        }
        catch(IOException | NumberFormatException e){
            System.exit(-1);
        }
    }
    public void addBankAccount(BankAccount a){
        accounts.add(a);
    }
    public void addSavingsAccount(SavingsAccount a){
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
    @Override
    public String toString(){
        return accounts.toString();
    }
    public static void main(String args[]){
        Bank b = new Bank();
        BankAccount cb1 = new BankAccount(01,"senha","Lucas",100);
        BankAccount cb2 = new BankAccount(02,"senha","Jonatas",200);
        SavingsAccount cb3 = new SavingsAccount(03,"senha","Rubens",300, 2.5);
        SavingsAccount cb4 = new SavingsAccount(04,"senha","João",400, 3.8);  
        b.addBankAccount(cb1);
        b.addBankAccount(cb2);
        b.addSavingsAccount(cb3);
        b.addSavingsAccount(cb4);
        b.sort();
        System.out.println(b);
        Bank a = new Bank("entrada.txt");
        a.sort();
        System.out.println(a);
        a.dump();
    }
}
