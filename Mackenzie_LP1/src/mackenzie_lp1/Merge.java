/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie_lp1;
import static mackenzie_lp1.Revisao.*;

/**
 *
 * @author 41406133
 */
public class Merge {
    public static void merge(int p, int q, int r, int v[]){
        int w[] = new int[r-p];
        int i = p;
        int j = q;
        int k = 0; 
        while(i<q && j<r){
            if(v[i]<=v[j]){
                w[k] = v[i];
                k++;
                i++;
            }
            else{
                w[k] = v[j];
                k++;
                j++;
            }
        }
        while(i<q){
            w[k] = v[i];
            k++;
            i++;
        }
        while(j<r){
            w[k] = v[j];
            k++;
            j++;
        }
        i = p;
        while(i<r){
            v[i] = w[i-p];
            i++;
        }
    }
    public static void sort(int v[]){
        int b = 1;
        while(b<v.length){
            int p = 0;
                while(p+b<v.length){
                    int r = p + 2 * b;
                    if(r > v.length){
                        r = v.length;
                    }
                    merge(p,p+b,r,v);
                    p = p+2*b;
                }
            b=2*b;
        }
    }
    public static void main(String args[]){
        int v[] = generateVector(10);
        System.out.println("Vetor original: ");
        printVector(v);
        sort(v);
        System.out.println("Vetor convertido: ");
        printVector(v);
    }
}