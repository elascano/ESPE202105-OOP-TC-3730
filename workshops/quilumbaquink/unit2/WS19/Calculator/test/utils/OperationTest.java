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
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
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
        float addend1 = 5.00F;
        float addend2 = 3.00F;
        float expResult = 8.00F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd1() {
        System.out.println("add");
        float addend1 = 1.20F;
        float addend2 = 3.40F;
        float expResult = 4.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = 1.20F;
        float addend2 = 0.0F;
        float expResult = 1.20F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd3() {
        System.out.println("add");
        float addend1 = 5.20F;
        float addend2 = 6.00F;
        float expResult = 11.20F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 3.20F;
        float addend2 = -3.00F;
        float expResult = 0.20F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = -7.00F;
        float addend2 = -2.00F;
        float expResult = -9.00F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 1.50F;
        float addend2 = -1.20F;
        float expResult = 0.30F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.01);
    }
    @Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = -2.15F;
        float addend2 = -1.18F;
        float expResult = -3.33F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = 899956.20F;
        float addend2 = 265963.00F;
        float expResult = 1165919.20F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd9() {
        System.out.println("add");
        float addend1 = 320.00F;
        float addend2 = 15.00F;
        float expResult = 335.00F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
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
    @Test
    public void testSubtract1() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 15.0F;
        float subtrahend = 12.0F;
        float expResult = 3.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 10.30F;
        float subtrahend = 8.20F;
        float expResult = 2.10F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.01);
        
    }
    @Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 7.0F;
        float subtrahend = 0.0F;
        float expResult = 7.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 0.50F;
        float subtrahend = 0.16F;
        float expResult = 0.34F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 4859875.0F;
        float subtrahend = 1689459.0F;
        float expResult = 3170416.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 365.78F;
        float subtrahend = -156.0F;
        float expResult = 521.78F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = -2.0F;
        float subtrahend = 3.5F;
        float expResult = -5.50F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = -12345.35F;
        float subtrahend = -1589.87F;
        float expResult = -10755.48F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.01);
        
    }
    
}
