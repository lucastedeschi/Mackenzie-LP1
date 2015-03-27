/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

/**
 *
 * @author Lucas Tedeschi
 */
public class RetanguloTeste {
    public static void main(String args[]){
        Retangulo box1 = new Retangulo(1,1,3,5);
        System.out.println("Retangulo A: " + box1);
        System.out.println("Área: " + box1.area());
        System.out.println("Permi               metro: " + box1.perimetro());
        Retangulo box2 = new Retangulo(2,2,3,4);
        System.out.println("Retangulo B: " + box2);
        System.out.println("Interseceção com retangulo B? " + box1.interseccao(box2));
    }
}
