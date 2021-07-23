/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of add method, of class Operation.
     */
    
     @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 9.0F;
        float expResult = 14.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddPositive() {
        System.out.println("add");
        float addend1 = 14195.0F;
        float addend2 = 14.0F;
        float expResult = 14209.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

   
    
    @Test
    public void testAddNegative() {
        System.out.println("add");
        float addend1 = -15.0F;
        float addend2 = -143.0F;
        float expResult = -158.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddLarge() {
        System.out.println("add");
        float addend1 = 1349.0F;
        float addend2 = 014293.0F;
        float expResult = 15642.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddZero() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 146.17F;
        float expResult = 146.17F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddNegative2() {
        System.out.println("add");
        float addend1 = -7.0F;
        float addend2 = -5.0F;
        float expResult = -12.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddDecimal() {
        System.out.println("add");
        float addend1 = 10.32F;
        float addend2 = 9.78F;
        float expResult = 20.1F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    }
    
    @Test
    public void testAddSmallDecimal() {
        System.out.println("add");
        float addend1 = 0.001F;
        float addend2 = 0.14F;
        float expResult = 0.141F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddLargDecimal() {
        System.out.println("add");
        float addend1 = 14308.95F;
        float addend2 = 17508.12F;
        float expResult = 31817.07F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddPositiveDecimal() {
        System.out.println("add");
        float addend1 = 0.51F;
        float addend2 = 17.0F;
        float expResult = 17.51F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 14226.89F;
        float subtrahend = -14226.93F;
        float expResult = 28453.82F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = -19.41F;
        float subtrahend = 20.19F;
        float expResult = -39.6F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    } 
    
     @Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 1.0F;
        float subtrahend = -19.0F;
        float expResult = 20.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    } 
    
    @Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = -0.319F;
        float subtrahend = 56.0F;
        float expResult = -56.319F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    } 
    
    @Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = -16.32F;
        float subtrahend = -42.1F;
        float expResult = 25.78F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
    } 
    
    @Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 18.0F;
        float subtrahend = -43.0F;
        float expResult = 61.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    } 
    
    @Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 329.0F;
        float subtrahend = 421.5F;
        float expResult = -92.5F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    } 
    
    @Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = -1479.0F;
        float subtrahend = 0.0F;
        float expResult = -1479.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    } 
    
    @Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = -345F;
        float expResult = 345F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    } 
    
    @Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 17.6F;
        float subtrahend = 1.0F;
        float expResult = 16.6F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    } 
}

