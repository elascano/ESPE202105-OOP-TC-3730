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
 * @author Camilo Ponce Program Builder ESPE-DCCO
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
    public void testAddZeroes() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expResult = 0.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 3.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testAdd1() {
        System.out.println("add");
        float addend1 = 12.0F;
        float addend2 = 30.1F;
        float expResult = 32.1F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    } 
        @Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = 10.0F;
        float addend2 = 6.0F;
        float expResult = 16.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }        
            @Test
    public void testAddPositivos() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        float expResult = 4.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }   
    
            @Test
    public void testAddPositivos1() {
        System.out.println("add");
        float addend1 = 4.3F;
        float addend2 = 6.8F;
        float expResult = 11.1F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }  
                
           @Test
    public void testAddPositivos2() {
        System.out.println("add");
        float addend1 = 6.3F;
        float addend2 = 6.5F;
        float expResult = 12.8F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }  
            @Test
    public void testAddNegativos() {
        System.out.println("add");
        float addend1 = -3.2F;
        float addend2 = -3.4F;
        float expResult = -6.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }      
             @Test
    public void testAddNegativos1() {
        System.out.println("add");
        float addend1 = -7.1F;
        float addend2 = -4.4F;
        float expResult = -11.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }   
             @Test
    public void testAddNegativos2() {
        System.out.println("add");
        float addend1 = -1.1F;
        float addend2 = -1.4F;
        float expResult = -2.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }     

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractZeros() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testSubtract1() {
        System.out.println("subtract");
        float minuend = 8.0F;
        float subtrahend = 3.0F;
        float expResult = 5.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 10.0F;
        float subtrahend = 8.0F;
        float expResult = 2.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 12.0F;
        float subtrahend = 3.0F;
        float expResult = 9.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testSubtractpositive() {
        System.out.println("subtract");
        float minuend = 13.1F;
        float subtrahend = 4.1F;
        float expResult = 9.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testSubtractpositive1() {
        System.out.println("subtract");
        float minuend = 5.6F;
        float subtrahend = 2.3F;
        float expResult = 3.3F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testSubtractpositive3() {
        System.out.println("subtract");
        float minuend = 123.34F;
        float subtrahend =120.32F;
        float expResult = 3.2F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testSubtractnegative1() {
        System.out.println("subtract");
        float minuend = -10.0F;
        float subtrahend = -10.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testSubtractnegative2() {
        System.out.println("subtract");
        float minuend = -12.0F;
        float subtrahend = -22.0F;
        float expResult = -10.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testSubtractnegative3() {
        System.out.println("subtract");
        float minuend = -1.0F;
        float subtrahend = -32.0F;
        float expResult = 31.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
}
