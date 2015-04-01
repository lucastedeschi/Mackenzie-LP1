/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author Lucas
 */
public class estudoSem3 {
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
    public static int[] selectionSort(int v[]){
        int r[] = new int[v.length];
        int aux = 0;
            for(int i = 0;i < v.length-1;i++){
                for(int j = i+1; j < v.length;j++){
                    if (v[i] > v[j]){
                        aux = v[j];
                        v[j] = v[i];
                        v[i] = aux;     
                    }
                }
            }
        return r;
    }
    public static int[] bubbleSort(int v[]){
        int r[] = new int[v.length];
        int aux = 0;
        for(int j = 0; j < v.length;j++){
            for (int i = 0; i < v.length-1;i++){
                if (v[i]  > v[i+1]){
                    aux = v[i+1];
                    v[i+1] = v[i];
                    v[i] = aux;
                }
            }
        }
        return r;
    }
    public static void main(String args[]){
        int v[] = generateVector(10);
        printVector(v);
        bubbleSort(v);
        System.out.println("");
        printVector(v);
    }
}
