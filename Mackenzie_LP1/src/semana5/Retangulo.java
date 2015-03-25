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
public class Retangulo{
    int x;
    int y;
    int width;
    int height;
    public Retangulo(){
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }
    public Retangulo(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ", " + this.width + ", " + this.height + ")";
    }
    public int area(){
        int area = this.width * this.height;
        return area;
    }
    public int perimetro(){
        int perimetro = (this.width*2) + (this.height*2);
        return perimetro;
    }
    public boolean interseccao(Retangulo box){
        return(this.y < box.height && this.height > box.y 
                && this.x < box.width && this.width > box.x);
//        Caso queira que tenha intersecço se B esteja exatamente em algum dos lados do retângulo A.
//        return(this.y <= box.height && this.height >= box.y 
//        && this.x <= box.width && this.width >= box.x);
       
    }
}
