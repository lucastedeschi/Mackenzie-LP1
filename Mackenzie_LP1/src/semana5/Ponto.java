/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

/**
 *
 * @author 41404998
 */
public class Ponto {
    int x;
    int y;
    public Ponto(){
        x =0;
        y=0;
    }
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "(" + this.x+ "," + this.y+")";
    }
    
}
