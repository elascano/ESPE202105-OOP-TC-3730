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
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAdd01() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expResult = 0.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAdd02() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 3.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd03() {
        System.out.println("add");
        float addend1 = 56.0F;
        float addend2 = 18.0F;
        float expResult = 74.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd04() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 3.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd05() {
        System.out.println("add");
        float addend1 = 23.50F;
        float addend2 = 78.40F;
        float expResult = 101.9F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd06() {
        System.out.println("add");
        float addend1 = -7.0F;
        float addend2 = 18.0F;
        float expResult = 11.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd07() {
        System.out.println("add");
        float addend1 = -18.0F;
        float addend2 = -42.0F;
        float expResult = -60.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd08() {
        System.out.println("add");
        float addend1 = 5.76F;
        float addend2 = 3.87F;
        float expResult = 9.63F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd09() {
        System.out.println("add");
        float addend1 = 56.0F;
        float addend2 = 907.0F;
        float expResult = 963.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd10() {
        System.out.println("add");
        float addend1 = -465.0F;
        float addend2 = 3.89F;
        float expResult = -461.11F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtract01() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testSubtract02() {
        System.out.println("subtract");
        float minuend = 84.0F;
        float subtrahend = 56.0F;
        float expResult = 28.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testSubtract03() {
        System.out.println("subtract");
        float minuend = 6735.0F;
        float subtrahend = 8976.0F;
        float expResult = -2241.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testSubtract04() {
        System.out.println("subtract");
        float minuend = -45.0F;
        float subtrahend = -65.0F;
        float expResult = 20.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testSubtract05() {
        System.out.println("subtract");
        float minuend = 763.0F;
        float subtrahend = 67.56F;
        float expResult = 695.44F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testSubtract06() {
        System.out.println("subtract");
        float minuend = 89.0F;
        float subtrahend = 89.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testSubtract07() {
        System.out.println("subtract");
        float minuend = 8.78F;
        float subtrahend = -89.8F;
        float expResult = 98.58F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testSubtract08() {
        System.out.println("subtract");
        float minuend = 674.0F;
        float subtrahend = 90.0F;
        float expResult = 584.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testSubtract09() {
        System.out.println("subtract");
        float minuend = -567.0F;
        float subtrahend = 876.0F;
        float expResult = -1443.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 34.34F;
        float subtrahend = 675.7F;
        float expResult = -641.36F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
}
