/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

/**
 *
 * @author Lucas
 */
public class estudoSem1 {
    public static int[] generateVector(int n){
        int v[] = new int[n];
        for(int i = 0; i<n;i++){
            v[i] = (int)(Math.random()*100);
        }
        return v;
    }
    public static void printVector(int v[]){
        for(int i = 0; i <v.length;i++){
            System.out.print(v[i] + " ");
        }
    }
    public static void main(String args[]){
        printVector(generateVector(10));
    }
}
