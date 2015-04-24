/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;
import java.io.*;

/**
 *
 * @author 1132587
 */
public class ExemploArquivos {

    /**
     * copia arquivos
     */
    public static void main(String[] args) {
        try{
           BufferedReader r=new BufferedReader(new FileReader("entrada.txt")); // leitura
           BufferedWriter w=new BufferedWriter(new FileWriter("saida.txt")); // gravação
           // O que acontece se os arqiuvos nao puderam ser abertos ?
           String linha = r.readLine();  // quantidade de dados a serem lidos
           
           w.write(linha);   // grava quantidade no arquivo de saída
		   w.newLine();
           int q = Integer.parseInt(linha);
                   
           for(int i=0;i<q;i++){
              linha = r.readLine();
              w.write(linha.toUpperCase());
			  w.newLine();
           }
           r.close();   // fecha arquivo de entrada
           w.flush();  // força escrita final de dados no arquivo de saída
           w.close(); // fecha arquivo de saída
        }
        catch(IOException | NumberFormatException e){
            System.exit(-1);
        } 

    }
}