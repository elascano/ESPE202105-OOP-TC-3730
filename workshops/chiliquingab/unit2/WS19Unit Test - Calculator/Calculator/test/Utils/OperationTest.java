/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
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
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 1.0F;
        float addend2 = 7.0F;
        float expResult = 3.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 3.0F;
        float subtrahend = 4.0F;
        float expResult = -1.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
}
