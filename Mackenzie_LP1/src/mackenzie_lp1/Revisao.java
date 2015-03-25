/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie_lp1;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author Lucas Tedeschi
 */
public class Revisao {
    public static int[] generateVector(int n){
        int v[] = new int[n];
        for (int i=0; i<n; i++){
            v[i] = (int)(Math.random()*100);
        }
        return v;
    }
    public static int[] generateVectorOrd(int n){
        int v[] = new int[n];
        for (int i=0; i<n; i++){
            v[i] = i * 2;
        }
        return v;
    }
    public static int[] generateVectorIgual(int n){
        int v[] = new int[n];
        int mid = n/2;
        for (int i=0; i<n; i++){
            if (i<mid){
                v[i] = 3;
            }   
            if (i>=mid){
                v[i] = 5;
            } 
        }
        return v;
    }
    public static void printVector(int v[]){
        for(int i=0; i<v.length; i++){
            System.out.println(v[i] + "");
        }
    }
    public static boolean busca( int v[], int x){
        for(int i = 0; i<v.length; i++){
            if (v[i] == x){
                return true;
            }
        }
        return false;        
    }
    public static int[] union(int v[], int w[]){
        int u[] = new int[v.length + w.length];
        int k = v.length;
        for(int i = 0; i<v.length;i++){
            u[i] = v[i];
        }
        for(int i = 0; i<w.length;i++){
            boolean achou = busca(v, w[i]);
            if (achou == false){
                u[k] = w[i];
                k++;
            }
        }
        return (Arrays.copyOf(u, k));  
    }
    public static int[] interseccao(int v[], int w[]){
        int in[] = new int[v.length + w.length];
        int k = 0;
        for(int i = 0; i<v.length;i++){
            for(int j = 0; j<w.length;j++){
                if (v[i] == w[j]){
                   in[i] = v[i];
                   k++;
                }
            }
        }
        return (Arrays.copyOf(in, k));  
    }
    public static int indexOf(int v[], int e){
        int low = 0;
        int high = v.length - 1;
        
        while (high >= low){
            int mid = (high + low)/2;
            if (v[mid] == e){
                return mid;
            }
            else if(v[mid] > e){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static int linear(int v[], int e){
        for(int i = 0; i<v.length; i++){
            if (v[i] == e){
                return i;
            }
        }
        return -1;    
    }
    public static int lastIndexOf(int v[], int e){
        int j = 0;
        for(int i = 0; i<v.length; i++){
            if (v[i] == e){
                j = i;
            }
        }
        return j;    
    }
    public static int lastIndexOfBin(int v[], int e){
       int x = indexOf(v, e); 
       
       while(v[x] == e){
           x = x + 1;
           if (x == v.length){
               return x - 1;
           }
       }
       return x - 1;    
    }
    public static void main(String args[]){
        //int vet1[] = generateVector(10);
        //int vet2[] = generateVector(7);
        int vetOrd[] = generateVectorOrd(10);
        int vetIgual[] = generateVectorIgual(5);
        
        //System.out.println("Vetor 01: ");
        //printVector(vet1);
        
        //System.out.println("Vetor 02: ");
        //printVector(vet2);
        
        //System.out.println("União: ");
        //printVector(union(vet1, vet2));
        
        //System.out.println("Intersecção: ");
        //printVector(interseccao(vet1, vet2));
        
        System.out.println("Vetor ordenado: ");
        printVector(vetOrd);
        System.out.println("Vetor para gerar números repetidos: ");
        printVector(vetIgual);
        
        Scanner s = new Scanner(System.in);
        System.out.println("O que deseja achar?");
        int e = s.nextInt();
        
        int resBoo = indexOf(vetOrd, e);
        System.out.println("Booleana: " + e + " está na posição " + resBoo + " do vetor.");
        int resLin = linear(vetOrd, e);
        System.out.println("Linear: " + e + " está na posição " + resLin + " do vetor.");
        int resIgual = lastIndexOf(vetIgual, e);
        System.out.println("Letra a: " + e + " aparece pela última vez na posição " + resIgual + " do vetor.");
        int resOrdB = lastIndexOfBin(vetIgual, e);
        System.out.println("Letra b: " + e + " aparece pela última vez na posição " + resOrdB + " do vetor.");
    }
}