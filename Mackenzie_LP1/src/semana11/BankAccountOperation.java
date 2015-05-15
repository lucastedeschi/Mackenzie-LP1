/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

/**
 *
 * @author 41406133
 */
public interface BankAccountOperation {
    public double getBalance(int bankId, String bankName, int accountNumber);
    public void deposit(int bankId, String bankName, int accountNumber, double value);
    public void withDraw(int bankId, String bankName, int accountNumber, double value);
}
