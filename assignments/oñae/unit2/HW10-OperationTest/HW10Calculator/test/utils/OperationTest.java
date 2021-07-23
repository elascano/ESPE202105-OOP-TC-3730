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
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class OperationTest {
    
    public OperationTest() {
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
    public void testAddPositivos() {
        System.out.println("add");
        float addend1 = 1.20F;
        float addend2 = 3.40F;
        float expResult = 4.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
    @Test
    public void testAddNegativos() {
        System.out.println("add");
        float addend1 = -5.30F;
        float addend2 = -7.50F;
        float expResult = -12.80F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testAddPositivosNegativos() {
        System.out.println("add");
        float addend1 = 6.30F;
        float addend2 = -4.20F;
        float expResult = 2.10F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
    @Test
    public void testAddPositivos1() {
        System.out.println("add");
        float addend1 = 6.50F;
        float addend2 = 3.40F;
        float expResult = 9.89F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
 
    
    public void testAddPositivos2() {
        System.out.println("add");
        float addend1 = 13.40F;
        float addend2 = 15.30F;
        float expResult = 25.40F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
    
    public void testAddPositivos3() {
        System.out.println("add");
        float addend1 = 7.40F;
        float addend2 = 3.30F;
        float expResult = 16.70F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
    public void testAddPositivos4() {
        System.out.println("add");
        float addend1 = 8.30F;
        float addend2 = 9.60F;
        float expResult = 7.20F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }

    public void testAddPositivos5() {
        System.out.println("add");
        float addend1 = 7.40F;
        float addend2 = 4.40F;
        float expResult = 20.50F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }    

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 4.0F;
        float subtrahend = 5.80F;
        float expResult = 0.60F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 7.90F;
        float subtrahend = 5.80F;
        float expResult = 7.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 4.70F;
        float subtrahend = 4.30F;
        float expResult = 6.20F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 1.90F;
        float expResult = -6.90F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
  
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 13.80F;
        float subtrahend = 7.40F;
        float expResult = 12.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 30.0F;
        float subtrahend = 880.0F;
        float expResult = -460.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 0.1F;
        float subtrahend = 3.0F;
        float expResult = -0.80F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
   
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 57.40F;
        float subtrahend = 45.80F;
        float expResult = -3.40F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 8.0F;
        float subtrahend = 0.0F;
        float expResult = 7.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
}
