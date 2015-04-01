/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

/**
 *
 * @author Lucas
 */
public class estudoSem2 {
    public static int[] generateVector(int n){
        int v[] = new int[n];
        for(int i = 0; i<n;i++){
            v[i] = (int)(Math.random()*100);
        }
        return v;
    }    
    public static int[] generateVectorOrder(int n){
        int v[] = new int[n];
        for(int i = 0; i<n;i++){
            v[i] = i;
        }
        return v;
    }
    
    public static void printVector(int v[]){
        for(int i = 0; i <v.length;i++){
            System.out.print(v[i] + " ");
        }
    }
    public static int indexOf(int v[], int n){
        for(int i = 0; i<v.length;i++){
            if(v[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int v[], int n){
    int low = 0;
    int high = v.length-1;
    while(high>=low){
        int mid = (high + low) / 2;
        if(n == mid){
            return n;
        }
        else if(n > mid){
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
    }
    return -1;
    }
    public static void main(String args[]){
        int v[] = generateVectorOrder(10);
        printVector(v);
        System.out.println(binarySearch(v,5));
    }
}
