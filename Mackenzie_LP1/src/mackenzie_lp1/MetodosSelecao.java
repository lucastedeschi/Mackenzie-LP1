/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie_lp1;
import static mackenzie_lp1.Revisao.*;
/**
 *
 * @author Lucas Tedeschi
 */
public class MetodosSelecao {
    public static void Troca(int i, int j,int v[]){
        int aux;
        aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
    public static int[] SelectionSort(int v[]){
        int j,i,min;
        for(i = 0;i < v.length-1;i++){
            min = i;
            for(j = i + 1;j < v.length;j++){
                if(v[j] < v[min]){
                   min = j;
                }
            }
            Troca(i,min,v);
        }
     return v;
    }
    public static int[] BubbleSort(int v[]){
        int j,i,aux;
        for(i = 0;i <v.length -1;i++){
            for(j = 0;j < ((v.length - 1) -i);j++){
                if(v[j]> v[j+1]){
                    aux = j+1;
                    Troca(j,aux,v);
                }
            }
        }
        return v;
    }
    public static void main (String args[]){
        int v[];
        v = generateVector(10);
        printVector(v);
        System.out.println("Selection Sort");
        v = SelectionSort(v);
        printVector(v);
        v = generateVector(10);
        printVector(v);
        System.out.println("Bubble Sort");
        v = BubbleSort(v);
        printVector(v);
    }
}
