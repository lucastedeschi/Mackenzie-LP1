/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author 41406133
 */
public class ATM implements BankAccountOperation {
    private ArrayList<Bank> banks;
    private Bank b;
    private double fee;
    public ATM(){
        banks = new ArrayList<Bank>();  
    }
    public ATM(Bank b, double fee){
        b = new Bank();
        this.fee = fee;
    }
    public ATM(String entradaATM) {
        try {
            banks = new ArrayList<Bank>();
            BufferedReader r = new BufferedReader(new FileReader(entradaATM));
            if (r != null) {   
                int q = (new Integer(r.readLine())).intValue();
                System.out.println(q);
                for (int i = 0; i < q; i++) {
                    setBanks(r.readLine());
                }
                r.close(); 
            }
        } catch (Exception e) {
            System.exit(-1);
        }
    }
    public void setBanks(String bank) {
        String[] aux = bank.split("#");
        int p0 = Integer.parseInt(aux[0]);
        String p1 = aux[1];
        Bank res = new Bank(p0, p1);
        banks.add(res);
    } 
    @Override
    public double getBalance(int bankId, String bankName, int accountNumber){
        return b.getBalance(bankId, bankName, accountNumber);
    }
    @Override
    public void deposit(int bankId, String bankName, int accountNumber, double value){
        b.deposit(bankId, bankName, accountNumber, value);
        b.withDraw(bankId, bankName,accountNumber, this.fee);
    }
    @Override
    public void withDraw(int bankId, String bankName, int accountNumber, double value){
        b.withDraw(bankId, bankName,accountNumber, value);
    }
}
