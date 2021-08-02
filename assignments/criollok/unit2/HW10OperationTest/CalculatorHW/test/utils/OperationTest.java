/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template ile, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin Criollo BetaSotwareTech ESPE-DCCO
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test o add method, o class Operation.
     */
    @Test
    public void testAdd01() {
        System.out.println("add");
        double addend1 = 0.3;
        double addend2 = -24.8;
        double expResult = -24.5;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testAdd02() {
        System.out.println("add");
        double addend1 = 4.8;
        double addend2 = -124.9;
        double expResult = -120.1;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testAdd03() {
        System.out.println("add");
        double addend1 = 2.20;
        double addend2 = 6.40;
        double expResult = 8.60;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd04() {
        System.out.println("add");
        double addend1 = -8.2;
        double addend2 = 204.3;
        double expResult = 196.1;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd05() {
        System.out.println("add");
        double addend1 = -157862.9;
        double addend2 = -207865647.1;
        double expResult = -208023510.0;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd06() {
        System.out.println("add");
        double addend1 = -0.9;
        double addend2 = 1034.7;
        double expResult = 1033.8;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd07() {
        System.out.println("add");
        double addend1 = 648.5;
        double addend2 = 0.8;
        double expResult = 649.3;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd08() {
        System.out.println("add");
        double addend1 = -6755.3;
        double addend2 = 181436.9;
        double expResult = 174681.6;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd09() {
        System.out.println("add");
        double addend1 = 3964.8;
        double addend2 = -1.7;
        double expResult = 3963.1;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    } @Test
    public void testAdd10() {
        System.out.println("add");
        double addend1 = -1.5;
        double addend2 = -0.7;
        double expResult = -2.2;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test o subtract method, o class Operation.
     */
    @Test
    public void testSubtract11() {
        System.out.println("subtract");
        double minuend = -87414.8;
        double subtrahend = -874.5;
        double expResult = -86540.3;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtract12() {
        System.out.println("subtract");
        double minuend = -875.7;
        double subtrahend = 0.6;
        double expResult = -876.3;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract13() {
        System.out.println("subtract");
        double minuend = 7.2;
        double subtrahend = -1.9;
        double expResult = 9.1;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtract14() {
        System.out.println("subtract");
        double minuend = 0.2;
        double subtrahend = 24.1;
        double expResult = -23.9;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtract15() {
        System.out.println("subtract");
        double minuend = 1.8;
        double subtrahend = 0.6;
        double expResult = 1.2;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtract16() {
        System.out.println("subtract");
        double minuend = -47852.1;
        double subtrahend = 0.8;
        double expResult = -47852.9;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtract17() {
        System.out.println("subtract");
        double minuend = 0.1;
        double subtrahend = 4.8;
        double expResult = -4.7;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtract18() {
        System.out.println("subtract");
        double minuend = 1457.0;
        double subtrahend = -87563.3;
        double expResult = 89020.3;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtract19() {
        System.out.println("subtract");
        double minuend = 78.7;
        double subtrahend = 8756.1;
        double expResult = -8677.4;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtract20() {
        System.out.println("subtract");
        double minuend = -7.8;
        double subtrahend = 0.9;
        double expResult = -8.7;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
}
