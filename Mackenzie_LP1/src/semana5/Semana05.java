/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;
import java.awt.Rectangle;
import java.util.ArrayList;
/**
 *
 * @author 41404998
 */
public class Semana05 {
    public static void main(String args[]){
        ArrayList a1 = new ArrayList();
        a1.add("C");
        a1.add("A");
        a1.add(1,"A2");
        a1.remove("C");
        System.out.println(a1);
        System.out.println(a1.contains("A"));
        ArrayList vet = new ArrayList();
        System.out.println(vet.add("LPI"));
        System.out.println(vet);
        Rectangle box = new Rectangle(5,10,20,30);
        box.translate(15, 25);
        System.out.println("X: "+box.getX());
        System.out.println("Y: "+box.getY());
        System.out.println("Altura: "+box.getWidth());
        System.out.println("Largura: "+box.getHeight());
    }
}
