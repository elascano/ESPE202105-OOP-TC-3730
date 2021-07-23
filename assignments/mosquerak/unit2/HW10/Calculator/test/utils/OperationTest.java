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
 * @author Kerly Mosquera CODE ESPE-DCCO
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
        float addend1 = 5.0F;
        float addend2 = 3.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testAdd1() {
        System.out.println("add");
        float addend1 = 15.0F;
        float addend2 = 3.0F;
        float expResult = 18.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }@Test
    public void testAdd3() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 13.0F;
        float expResult = 18.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 8.0F;
        float expResult = 13.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
   @Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 17.0F;
        float expResult = 22.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 25.0F;
        float addend2 = 3.0F;
        float expResult = 28.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = 4.0F;
        float addend2 = 3.0F;
        float expResult = 7.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = 19.0F;
        float addend2 = 15.0F;
        float expResult = 34.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
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
    public void testAddPositivos1() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        float expResult = 4.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 3.4F;
        float subtrahend = 1.0F;
        float expResult = 2.4F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
     
    }
    @Test
    public void testSubtract1() {
        System.out.println("subtract");
        float minuend = 12.01F;
        float subtrahend = 2.0F;
        float expResult = 10.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
     
    }@Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 3.14F;
        float subtrahend = 2.1F;
        float expResult = 1.04F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
     
    }@Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 2.2F;
        float subtrahend = 1.7F;
        float expResult = 0.5F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
     
    }@Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 9.0F;
        float subtrahend = 2.1F;
        float expResult = 6.9F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
     
    }@Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 3.14F;
        float subtrahend = 2.70F;
        float expResult = 0.44F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
     
    }
    @Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 1.9F;
        float subtrahend = 1.5F;
        float expResult = 0.4F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
     
    }
    @Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 19.0F;
        float subtrahend = 15.0F;
        float expResult = 4.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
     
    }
    @Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = -56.0F;
        float subtrahend = 7.6F;
        float expResult = -63.6F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
     
    }
    @Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 10.0F;
        float subtrahend = 5.0F;
        float expResult = 5.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
     
    }
}
