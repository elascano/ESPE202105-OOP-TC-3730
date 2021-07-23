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
 * @author Eliana Cuaspa Beta-SotwareTech ESPE-DCCO
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test o add method, o class Operation.
     */
    @Test
    public void testAdd1() {
        System.out.println("add");
        double addend1 = 1.0;
        double addend2 = -2.0;
        double expResult = -1.0;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd2() {
        System.out.println("add");
        double addend1 = 2.5;
        double addend2 = 6.0;
        double expResult = 8.5;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd3() {
        System.out.println("add");
        double addend1 = -4.3;
        double addend2 = -3.6;
        double expResult = -7.9;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testAdd4() {
        System.out.println("add");
        double addend1 = 6.0;
        double addend2 = 8.0;
        double expResult = 14.0;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd5() {
        System.out.println("add");
        double addend1 = 5.0;
        double addend2 = 5.0;
        double expResult = 10.0;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd6() {
        System.out.println("add");
        double addend1 = 3.33;
        double addend2 = -1.5;
        double expResult = 1.83;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd7() {
        System.out.println("add");
        double addend1 = 17.0;
        double addend2 = -2.5;
        double expResult = 14.5;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd8() {
        System.out.println("add");
        double addend1 = 3.0;
        double addend2 = 2.0;
        double expResult = 5.0;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd9() {
        System.out.println("add");
        double addend1 = 4.7;
        double addend2 = 6.4;
        double expResult = 11.1;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testAdd10() {
        System.out.println("add");
        double addend1 = 1.1;
        double addend2 = 2.3;
        double expResult = 3.4;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd() {
        System.out.println("add");
        double addend1 = 5.0;
        double addend2 = 3.0;
        double expResult = 8.0;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddPositivos() {
        System.out.println("add");
        double addend1 = 1.20;
        double addend2 = 3.40;
        double expResult = 4.60;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test o subtract method, o class Operation.
     */
    @Test
    public void testSubtract1() {
        System.out.println("subtract");
        double minuend = -1.0;
        double subtrahend = -5.8;
        double expResult = 4.8;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        double minuend = 2.0;
        double subtrahend = -9.0;
        double expResult = 11.0;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract3() {
        System.out.println("subtract");
        double minuend = -8.0;
        double subtrahend = -15.0;
        double expResult = 7.0;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract4() {
        System.out.println("subtract");
        double minuend = -2.9;
        double subtrahend = -8.6;
        double expResult = 5.7;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract5() {
        System.out.println("subtract");
        double minuend = -1.22;
        double subtrahend = -5.0;
        double expResult = 3.78;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract6() {
        System.out.println("subtract");
        double minuend = 5.0;
        double subtrahend = 0.0;
        double expResult = 5.0;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract7() {
        System.out.println("subtract");
        double minuend = 2.3;
        double subtrahend = 2.6;
        double expResult = -0.3;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract8() {
        System.out.println("subtract");
        double minuend = 0.5;
        double subtrahend = 14.6;
        double expResult = -14.1;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract9() {
        System.out.println("subtract");
        double minuend = -21.40;
        double subtrahend = -2.7;
        double expResult = -18.7;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract10() {
        System.out.println("subtract");
        double minuend = 0.5;
        double subtrahend = 1.0;
        double expResult = -0.5;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
}
