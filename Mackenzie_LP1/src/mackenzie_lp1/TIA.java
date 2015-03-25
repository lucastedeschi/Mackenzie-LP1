/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie_lp1;
import java.util.Scanner;
/**
 *
 * @author Lucas Tedeschi
 */
public class TIA {
    
    public static int[] vNota;
    public static int[] vTia;
    public static int[] vTiaBusca;
    public static int[] vNotaBusca;
    
    public static void merge(int p, int q, int r, int v[]){
        int w[] = new int[r-p];
        int tia[] = new int[r-p];
        int nota[] = new int[r-p];
        int i = p;
        int j = q;
        int k = 0; 
        while(i<q && j<r){
            if(v[i]<=v[j]){
                w[k] = v[i];
                tia[k] = vTia[i];
                nota[k] = vNotaBusca[i];
                k++;
                i++;
            }
            else{
                w[k] = v[j];
                tia[k] = vTia[j];
                nota[k] = vNotaBusca[j];
                k++;
                j++;
            }
        }
        while(i<q){
            w[k] = v[i];
            tia[k] = vTia[i];
            nota[k] = vNotaBusca[i];
            k++;
            i++;
        }
        while(j<r){
            w[k] = v[j];
            tia[k] = vTia[j];
            nota[k] = vNotaBusca[j];
            k++;
            j++;
        }
        i = p;
        while(i<r){
            v[i] = w[i-p];
            vTia[i] = tia[i-p];
            vNotaBusca[i] = nota[i-p];
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
    public static void printVector(int v[]){
        for(int i=0; i<v.length; i++){
            if(i == v.length-1){
            System.out.print(v[i] + ".");
            }
            else{
                System.out.print(v[i] + ", ");
                }
        }
    }
    public static int binarySearch(int[ ] a, int x, int low, int high) {
          if (low > high) return -1; 
          int mid = (low + high)/2;
          if (a[mid] == x) return mid;
          else if (a[mid] < x)
             return binarySearch(a, x, mid+1, high);
          else 
             return binarySearch(a, x, low, mid-1);
       }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Número de professores: ");
        int np = s.nextInt();
        for(int i=0;i<np;i++){
            System.out.println("[Professor " + (i+1) + "] Número de provas: ");
            int nprovas = s.nextInt();
            vTia = new int[nprovas];
            vNota = new int[nprovas];
            vTiaBusca = vTia;
            vNotaBusca = vNota;
            for(int j=0;j<nprovas;j++){
                System.out.println("[Professor " + (i+1) + "] [Nota " + (j+1) + "] TIA: ");
                vTia[j] = s.nextInt();
                System.out.println("[Professor " + (i+1) + "] [Nota " + (j+1) + "] Nota: ");
                vNota[j] = s.nextInt();
            }
            System.out.println("Foram digitadas " + nprovas + " notas:");
            sort(vNota);
            System.out.println(" ");
            System.out.println("TIAs: ");
            printVector(vTia);
            System.out.println(" ");
            System.out.println("Notas: ");
            printVector(vNota);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Qual TIA deseja procurar? ");
            int x  = s.nextInt();
            vNotaBusca = vNota;
            sort(vTiaBusca);
            int pos = binarySearch(vTiaBusca, x, 0, vTiaBusca.length);
            System.out.println("TIA: " + x + " | Nota: " + vNotaBusca[pos]);
        }
        
    }
    
}
