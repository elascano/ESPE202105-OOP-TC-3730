/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package units;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
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
     * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
     */
    @Test
    public void testAddZeroes() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expResult = 0.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }  
    @Test
    public void testAddIntegerNegativeAndPositive() {
        System.out.println("add");
        float addend1 = -5.0F;
        float addend2 = 2.0F;
        float expResult = -3.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
 

    @Test
    public void testAddFloats() {
        System.out.println("add");
        float addend1 = -7.6F;
        float addend2 = -5.6F;
        float expResult = -13.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of substract method, of class Operation.
     * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
     */
    @Test
    public void testSubstractZeroes() {
        System.out.println("substract");
        float minuend = 0.0F;
        float subrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
  
 
}