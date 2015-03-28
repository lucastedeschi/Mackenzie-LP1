/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7_Bank;

/**
 *
 * @author Lucas Tedeschi
 */
public class BankAccountV2 {
    private int accountNumber;  
    private static int lastAccountNumber = 1000; 
    private double balance; 
    private String name; 
    private char vN[] = new char[3];
    private int vI[] = new int[4];
    private String pass[] = new String[7];
    
    public BankAccountV2() {
        accountNumber=lastAccountNumber++;
        balance = 0;
    }

    public BankAccountV2(double initialBalance, String name) {
        accountNumber=lastAccountNumber++;
        balance = initialBalance;
        this.name = name; 
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withDraw(double amount) {
        balance -= amount;
    }
    
    public int[] generatePasswordInt(){ 
        for (int j=0; j<4; j++){
            vI[j] = (int)(Math.random()*100);
        }
        return vI;
    }
    
    public char[] generatePasswordChar(){
        String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
        for (int i=0; i<3; i++){
            int k = (int)(Math.random()*100);
            vN[i] = letras.charAt(k);
        }  
        return vN;
    }
    
    public boolean numberName(){
        for(int i=0;i<name.length();i++){
            if (name.charAt(i) >= 0 && name.charAt(i) <= 9){
                return false;
            }
        }
        return true;
    }
    
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    
    public String getName(){
        return name;
    }
    public String getPassword(){
        return "Senha: " + generatePasswordChar() + generatePasswordInt();
    }
}
