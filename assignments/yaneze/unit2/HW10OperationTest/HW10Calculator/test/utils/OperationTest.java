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
 * @author Erick Yánez LAMESTech ESPE-DCC0
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
        float addend1 = -3.20F;
        float addend2 = -3.80F;
        float expResult = -7.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testAddPositivosNegativos() {
        System.out.println("add");
        float addend1 = 5.20F;
        float addend2 = -3.40F;
        float expResult = 1.80F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
    @Test
    public void testAddPositivos1() {
        System.out.println("add");
        float addend1 = 5.70F;
        float addend2 = 1.20F;
        float expResult = 6.90F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
 
    
    public void testAddPositivos2() {
        System.out.println("add");
        float addend1 = 10.70F;
        float addend2 = 12.20F;
        float expResult = 22.90F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
    
    public void testAddPositivos3() {
        System.out.println("add");
        float addend1 = 8.70F;
        float addend2 = 4.90F;
        float expResult = 13.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
    public void testAddPositivos4() {
        System.out.println("add");
        float addend1 = 6.90F;
        float addend2 = 1.20F;
        float expResult = 8.10F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }

    public void testAddPositivos5() {
        System.out.println("add");
        float addend1 = 8.10F;
        float addend2 = 9.80F;
        float expResult = 17.90F;
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
        float minuend = 3.0F;
        float subtrahend = 2.50F;
        float expResult = 0.50F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 6.50F;
        float subtrahend = 2.50F;
        float expResult = 4.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 9.80F;
        float subtrahend = 5.70F;
        float expResult = 4.10F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 2.90F;
        float expResult = -2.90F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
  
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 15.90F;
        float subtrahend = 5.90F;
        float expResult = 10.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 80.0F;
        float subtrahend = 550.0F;
        float expResult = -470.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 0.8F;
        float subtrahend = 1.0F;
        float expResult = -0.20F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
   
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 55.80F;
        float subtrahend = 62.90F;
        float expResult = -7.10F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 5.0F;
        float subtrahend = 0.0F;
        float expResult = 5.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
}
