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
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
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
        float addend1 = 7.0F;
        float addend2 = 10.0F;
        float expResult = 17.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd1() {
        System.out.println("add");
        float addend1 = 16.0F;
        float addend2 = 7.30F;
        float expResult = 23.30F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = 4.15F;
        float addend2 = 1.20F;
        float expResult = 5.35F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
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
    public void testAddPositivos2() {
        System.out.println("add");
        float addend1 = 5.20F;
        float addend2 = 4.40F;
        float expResult = 9.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testAddNegativos() {
        System.out.println("add");
        float addend1 = -6.20F;
        float addend2 = -2.40F;
        float expResult = -8.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddNegativos2() {
        System.out.println("add");
        float addend1 = -5.13F;
        float addend2 = -7.38F;
        float expResult = -12.51F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddPositivoaNegativos() {
        System.out.println("add");
        float addend1 = -4.0F;
        float addend2 = 5.40F;
        float expResult = 1.40F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testAddLong() {
        System.out.println("add");
        float addend1 = 8452.91F;
        float addend2 = 945.13F;
        float expResult = 9398.04F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    

    /**
     * Test of subtract method, of class Operation.
     */
    
    @Test
    public void testSubtractZeroes() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 11.0F;
        float subtrahend = 10.0F;
        float expResult = 1.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
    }
    
    @Test
    public void testSubtract1() {
        System.out.println("subtract");
        float minuend = 16.0F;
        float subtrahend = 7.30F;
        float expResult = 8.70F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 28.0F;
        float subtrahend = 9.56F;
        float expResult = 18.44F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
    }
    
    @Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 3.00F;
        float subtrahend = 1.00F;
        float expResult = 2.00F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtractFloat1() {
        System.out.println("subtract");
        float minuend = -41.54F;
        float subtrahend = 8.86F;
        float expResult = -50.40F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtractNegativos() {
        System.out.println("subtract");
        float minuend = -1.79F;
        float subtrahend = 3.46F;
        float expResult = -5.25F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtractNegativos1() {
        System.out.println("subtract");
        float minuend = -57.19F;
        float subtrahend = 3.60F;
        float expResult = -60.79F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
    }
    
    @Test
    public void testSubtractLong() {
        System.out.println("subtract");
        float minuend = 5452.91F;
        float subtrahend = 95.13F;
        float expResult = 5357.78F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
    }
    
    @Test
    public void testSubtractLong2() {
        System.out.println("subtract");
        float minuend = -345.91F;
        float subtrahend = 955.13F;
        float expResult = -1301.04F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    

}  

