/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author 41406133
 */
public class Bank implements BankAccountOperation{                                                                                                                          
    private ArrayList<BankAccount> accounts;
    protected int bankId;
    protected String bankname;
    
    public Bank(){
        accounts = new ArrayList<BankAccount>();  
    }
    public Bank(int bankId, String bankName){
        this.bankId = bankId;
        this.bankname = bankname;
        accounts = new ArrayList<BankAccount>(); 
    }
    public Bank(String entrada) {
        try {
            accounts = new ArrayList<BankAccount>();
            BufferedReader r = new BufferedReader(new FileReader(entrada));
            if (r != null) {   
                int q = (new Integer(r.readLine())).intValue();
                System.out.println(q);
                for (int i = 0; i < q; i++) {
                    setBank(r.readLine());
                }
                r.close(); 
            }
        } catch (Exception e) {
            System.exit(-1);
        }
    }
    @Override
    public double getBalance(int bankId, String bankName, int accountNumber){
        for(BankAccount a : accounts){
            if(a.getAccountNumber() == accountNumber){
                return a.getBalance();
            }
        }
        return 0;
    }
    @Override
    public void deposit(int bankId, String bankName, int accountNumber, double value){
        BankAccount b = find(accountNumber);
        b.balance = b.getBalance() + value;
    }
    @Override
    public void withDraw(int bankId, String bankName, int accountNumber, double value){
        BankAccount b = find(accountNumber);
        b.balance = b.getBalance() - value;
    }
    public void setBank(String conta) {
        String[] aux = conta.split("#");
        String p0 = aux[0];
        int p1 = Integer.parseInt(aux[1]);
        String p2 = aux[2];
        String p3 = aux[3];
        double p4 = Double.parseDouble(aux[4]);
        if (aux.length == 6) {
            if("RA".equals(p0)){
                double p5 = Double.parseDouble(aux[5]);
                BankAccount res = new RegularAccount(p0, p1, p2, p3, p4, p5);
                accounts.add(res);
            } else if("SA".equals(p0)){
                double p5 = Double.parseDouble(aux[5]);
                BankAccount res = new SavingsAccount(p0, p1, p2, p3, p4, p5);
                accounts.add(res);
            } 
        }
        else if (aux.length == 9){
            String p5 = aux[5];
            String p6 = aux[6];
            String p7 = aux[7];
            if("CLA".equals(p0)){
                String p8 = aux[8];
                BankAccount res = new CityLawAccount(p0, p1, p2, p3, p4, p5, p6, p7, p8);
                accounts.add(res);
            } else if("SLA".equals(p0)){
                String p8 = aux[8];
                BankAccount res = new StateLawAccount(p0, p1, p2, p3, p4, p5, p6, p7, p8);
                accounts.add(res);
            } else if("FLA".equals(p0)){
                int p8 = Integer.parseInt(aux[8]);
                BankAccount res = new FederationLawAccount(p0, p1, p2, p3, p4, p5, p6, p7, p8);
                accounts.add(res);
            }       
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
    public void addRegularAccount(RegularAccount a){
        accounts.add(a);
    }
    public void addFederationLawAccount(FederationLawAccount a){
        accounts.add(a);
    }
    public void addCityLawAccount(CityLawAccount a){
        accounts.add(a);
    }
    public void addStateLawAccount(StateLawAccount a){
        accounts.add(a);
    }
    public double getTotalBalance(){
        double soma = 0.0;
        for(BankAccount b : accounts){
            soma = soma + b.getBalance();
        }
        return soma;
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
    public BankAccount find(int accountNumber){
        for(BankAccount b : accounts){ //BankAccount = tipo -- b = contador -- accounts = nome do vetor
            if(b.getAccountNumber() == accountNumber){
                return b;
            }        
        }  
        return null;
    }
    public ArrayList sortAsc(){
        ArrayList<BankAccount> ord = accounts;
        int min;
        for(int i =0;i < ord.size()-1;i++){
            min = i;
            for(int j = i+1; j < ord.size();j++){
                if(ord.get(j).getBalance() < ord.get(min).getBalance()){
                    min = j;
                }
            }
            BankAccount aux = ord.get(min);
            ord.set(min, ord.get(i));
            ord.set(i, aux);
        }
         return ord;
    }
    public ArrayList sortDesc(){
        ArrayList<BankAccount> ord = accounts;
        int min;
        for(int i =0;i < ord.size()-1;i++){
            min = i;
            for(int j = i+1; j < ord.size();j++){
                if(ord.get(j).getBalance() > ord.get(min).getBalance()){
                    min = j;
                }
            }
            BankAccount aux = ord.get(min);
            ord.set(min, ord.get(i));
            ord.set(i, aux);
        }
        return ord;
    }
    public ArrayList<BankAccount> bankAccounts(){
        ArrayList<BankAccount> bank = new ArrayList();
        for(BankAccount b: accounts){
            if(!(b instanceof SavingsAccount)){
                bank.add(b);
            }
        }
        return bank;
    }
    public ArrayList<SavingsAccount> savingsAccounts(){
        ArrayList<BankAccount> bank = new ArrayList();
        for(BankAccount b: accounts){
            if(b instanceof SavingsAccount){
                bank.add((SavingsAccount) b);
            }
        }
        Bank bSA = new Bank();
        bSA.accounts = bank;
        return bSA.sortDesc();
    }
    public ArrayList<RegularAccount> regularAccounts(){
        ArrayList<BankAccount> bank = new ArrayList();
        for(BankAccount b: accounts){
            if(b instanceof RegularAccount){
                bank.add((RegularAccount) b);
            }
        }
        Bank bRA = new Bank();
        bRA.accounts = bank;
        return bRA.sortDesc();
    }
    public ArrayList<BankAccount> lawAccounts(){
        ArrayList<BankAccount> aCityLaw = new ArrayList();
        ArrayList<BankAccount> aStateLaw = new ArrayList();
        ArrayList<BankAccount> aFedLaw = new ArrayList();
        for(BankAccount b: this.accounts){
            if(b instanceof CityLawAccount){
               aCityLaw.add(b);
            }
        }
        Bank bCLA = new Bank();
        bCLA.accounts = aCityLaw;
        bCLA.sortAsc();
        aCityLaw = bCLA.accounts;
        for(BankAccount b: this.accounts){
            if(b instanceof StateLawAccount){
               aStateLaw.add(b);
            }
        }
        Bank bSLA = new Bank();
        bSLA.accounts = aStateLaw;
        bSLA.sortAsc();
        aStateLaw = bSLA.accounts;
        for(BankAccount b: this.accounts){
            if(b instanceof FederationLawAccount){
               aFedLaw.add(b);
            }
        }
        Bank bFLA = new Bank();
        bFLA.accounts = aFedLaw;
        bFLA.sortAsc();
        aFedLaw = bFLA.accounts;
        
        Bank bLaw = new Bank();
        bLaw.accounts.addAll(aCityLaw);
        bLaw.accounts.addAll(aStateLaw);
        bLaw.accounts.addAll(aFedLaw);
        
        return bLaw.accounts;
    }
    public String getAccountType(BankAccount b){
        if(b instanceof RegularAccount){
            return "RA";
        }
        if(b instanceof SavingsAccount){
            return "SA";
        }
        if(b instanceof CityLawAccount){
            return "CLA";
        }
        if(b instanceof FederationLawAccount){
            return "FLA";
        }
        if(b instanceof StateLawAccount){
            return "SLA";
        }
        return null;
    }
    @Override
    public String toString(){
        return accounts.toString();
    }
    public static void main(String args[]){
//        Bank b = new Bank();
//        BankAccount cb1 = new BankAccount(01,"senha","Lucas",100);
//        BankAccount cb2 = new BankAccount(02,"senha","Jonatas",200);
//        SavingsAccount cb3 = new SavingsAccount(03,"senha","Rubens",300, 2.5);
//        SavingsAccount cb4 = new SavingsAccount(04,"senha","João",400, 3.8);  
//        b.addBankAccount(cb1);
//        b.addBankAccount(cb2);
//        b.addSavingsAccount(cb3);
//        b.addSavingsAccount(cb4);
//        b.sort();
//        System.out.println(b);
        Bank a = new Bank("entrada.txt");
        a.sortAsc();
        System.out.println("Todos:");
        System.out.println(a);
        a.dump();
        Bank bank = new Bank("entrada.txt");
        System.out.println();
        System.out.println("Saving Accounts:");
        System.out.println(bank.savingsAccounts());
        System.out.println();
        System.out.println("Regular Accounts:");
        System.out.println(bank.regularAccounts());
        System.out.println();
        System.out.println("Law Accounts:");
        System.out.println();
        
        System.out.println(bank.lawAccounts());
        
        BankAccount bA = bank.accounts.get(3);
        System.out.println();
        System.out.println("Tipo da conta de ID 0003: ");
        System.out.println(bank.getAccountType(bA));
    }
}
