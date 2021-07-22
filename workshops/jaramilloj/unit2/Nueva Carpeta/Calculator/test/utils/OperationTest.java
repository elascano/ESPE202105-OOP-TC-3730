/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author  LESLIE TITOAÑA
 */
public class OperationTest {
    
    public OperationTest() {
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
     * Test of add method, of class Operation.
     * Author JEAN JARAMILLO OPP
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        float expResult = 4.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
    

    /**
     * Test of substract method, of class Operation.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float minuend = 0.0F;
        float subrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
