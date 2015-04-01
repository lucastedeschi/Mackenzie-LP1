/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

/**
 *
 * @author Lucas
 */
public class estudoSem4 {
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
    public static int fatorial(int n){
        if(n == 0){
            return 1;
        }
        return n * fatorial(n-1);
    }
    public static int binarySearch(int v[], int n){
    int low = 0;
    int high = v.length-1;
    while(high>=low){
        int mid = (high + low) / 2;
        if(n == mid){
            return mid;
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
    public static int binaryRec(int v[], int n, int low, int high){
        if (high < low){
            return -1;
        }
        int mid = (high + low)/2;
        if (v[mid] == n){
            return mid;
        }
        else if(n < v[mid]){
            return binaryRec(v, n, low, mid-1);
        }
            else{
                    return binaryRec(v, n, mid+1, high);
                    }
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
        System.out.println(binaryRec(v,1,0,v.length));
    }
}
