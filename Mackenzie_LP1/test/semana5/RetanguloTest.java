/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41406133
 */
public class RetanguloTest {
    
    public RetanguloTest() {
    }

    @Test
    public void testInterseccao() {
        Retangulo box1 = new Retangulo(1,1,3,5);
        Retangulo box2 = new Retangulo(2,2,3,4);
        Assert.assertTrue(box1.interseccao(box2));
    }
    
}
