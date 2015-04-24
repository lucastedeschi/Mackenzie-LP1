/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41406133
 */
public class BankArrayTest {
    
    public BankArrayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addAccount method, of class BankArray.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        BankAccount a = null;
        BankArray instance = new BankArray();
        instance.addAccount(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBalance method, of class BankArray.
     */
    @Test
    public void testGetTotalBalance() {
        System.out.println("getTotalBalance");
        BankArray instance = new BankArray();
        double expResult = 0.0;
        double result = instance.getTotalBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class BankArray.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        int accountNumber = 0;
        BankArray instance = new BankArray();
        BankAccount expResult = null;
        BankAccount result = instance.find(accountNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximum method, of class BankArray.
     */
    @Test
    public void testGetMaximum() {
        System.out.println("getMaximum");
        BankArray instance = new BankArray();
        BankAccount expResult = null;
        BankAccount result = instance.getMaximum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class BankArray.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        int limit = 0;
        BankArray instance = new BankArray();
        int expResult = 0;
        int result = instance.count(limit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
