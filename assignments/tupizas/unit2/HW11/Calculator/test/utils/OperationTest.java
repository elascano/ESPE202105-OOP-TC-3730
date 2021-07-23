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
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddZero() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expResult = 0.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAddPositivos() {
        System.out.println("add");
        float addend1 = 6.0F;
        float addend2 = 3.5F;
        float expResult = 9.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 8.2F;
        float subtrahend = 4.1F;
        float expResult = 4.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat1() {
        System.out.println("subtract");
        float minuend = 9.2F;
        float subtrahend = 6.2F;
        float expResult = 3.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat2() {
        System.out.println("add");
        float addend1 = 4.6F;
        float addend2 = 2.2F;
        float expResult = 6.8F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat3() {
        System.out.println("add");
        float addend1 = 2.2F;
        float addend2 = 5.6F;
        float expResult = 7.8F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat4() {
        System.out.println("add");
        float addend1 = 7.2F;
        float addend2 = 1.6F;
        float expResult = 8.8F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat5() {
        System.out.println("subtract");
        float minuend = 2.2F;
        float subtrahend = 1.2F;
        float expResult = 1.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat6() {
        System.out.println("subtract");
        float minuend = 10.0F;
        float subtrahend = 5.0F;
        float expResult = 5.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat7() {
        System.out.println("subtract");
        float minuend = 3.2F;
        float subtrahend = 1.2F;
        float expResult = 2.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat8() {
        System.out.println("subtract");
        float minuend = 8.2F;
        float subtrahend = 1.2F;
        float expResult = 7.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat9() {
        System.out.println("subtract");
        float minuend = 6.2F;
        float subtrahend = 2.1F;
        float expResult = 4.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat10() {
        System.out.println("subtract");
        float minuend = 5.2F;
        float subtrahend = 3.1F;
        float expResult = 2.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat11() {
        System.out.println("subtract");
        float minuend = 8.3F;
        float subtrahend = 4.3F;
        float expResult = 4.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat12() {
        System.out.println("subtract");
        float minuend = 3.5F;
        float subtrahend = 1.2F;
        float expResult = 2.3F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat13() {
        System.out.println("add");
        float addend1 = 7.2F;
        float addend2 = 1.2F;
        float expResult = 8.4F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat14() {
        System.out.println("add");
        float addend1 = 6.2F;
        float addend2 = 3.2F;
        float expResult = 9.4F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat15() {
        System.out.println("add");
        float addend1 = 2.2F;
        float addend2 = 5.6F;
        float expResult = 7.8F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat16() {
        System.out.println("add");
        float addend1 = 8.2F;
        float addend2 = 1.6F;
        float expResult = 9.8F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFloat17() {
        System.out.println("add");
        float addend1 = 4.2F;
        float addend2 = 3.4F;
        float expResult = 7.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
}
