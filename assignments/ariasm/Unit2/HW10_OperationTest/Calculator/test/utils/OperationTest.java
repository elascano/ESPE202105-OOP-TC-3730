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
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
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
    public void testAddPositives() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        float expResult = 4.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    }
    
    @Test
    public void testAdd1() {
        System.out.println("add");
        float addend1 = 3.0F;
        float addend2 = 5.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = -9.0F;
        float addend2 = 2.0F;
        float expResult = -7.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd3() {
        System.out.println("add");
        float addend1 = 10.0F;
        float addend2 = -9.5F;
        float expResult = 0.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 3.6F;
        float addend2 = 2.0F;
        float expResult = 5.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = -3.3F;
        float addend2 = -5.2F;
        float expResult = -8.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 9.0F;
        float addend2 = 0.0F;
        float expResult = 9.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 9.2F;
        float expResult = 9.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = -2.2F;
        float addend2 = 0.0F;
        float expResult = -2.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd9() {
        System.out.println("add");
        float addend1 = 10.0F;
        float addend2 = 3.0F;
        float expResult = 13.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd10() {
        System.out.println("add");
        float addend1 = -9.0F;
        float addend2 = 3.0F;
        float expResult = -6.0F;
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
        float minuend = 9.0F;
        float subtrahend = 6.0F;
        float expResult = 3.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 9.0F;
        float subtrahend = -6.0F;
        float expResult = 15.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 5.0F;
        float subtrahend = 9.0F;
        float expResult = -4.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 90.5F;
        float subtrahend = -30.0F;
        float expResult = 120.5F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 3.0F;
        float subtrahend = 9.0F;
        float expResult = -6.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 6.0F;
        float subtrahend = -10.0F;
        float expResult = 16.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 10.0F;
        float subtrahend = 4.5F;
        float expResult = 5.5F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 3.1F;
        float subtrahend = -4.0F;
        float expResult = 7.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 4.0F;
        float subtrahend = 9.0F;
        float expResult = -5.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = -2.6F;
        float subtrahend = -15.0F;
        float expResult = 12.4F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    
}
