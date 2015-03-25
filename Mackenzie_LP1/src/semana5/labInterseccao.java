/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;
import java.awt.Rectangle;
/**
 *
 * @author Lucas Tedeschi
 */
public class labInterseccao {
    public static Rectangle interseccao(Rectangle s, Rectangle t){
        Rectangle box = s.intersection(t);
        return box;
    }
    public static void main(String args[]){
        Rectangle box1 = new Rectangle(1,1,2,3);
        Rectangle box2 = new Rectangle(2,2,2,3);
        Rectangle res = interseccao(box1,box2);
        System.out.println("Retângulo resultante da interseccção: " + res);
    }
}
