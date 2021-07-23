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
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
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
        float addend1 = 7.0F;
        float addend2 = 2.0F;
        float expResult = 9.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = -5.0F;
        float addend2 = 2.0F;
        float expResult = -3.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd3() {
        System.out.println("add");
        float addend1 = 10.0F;
        float addend2 = -5.5F;
        float expResult = 4.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 7.6F;
        float addend2 = 4.0F;
        float expResult = 11.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = -7.6F;
        float addend2 = -5.6F;
        float expResult = -13.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 7.0F;
        float expResult = 7.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 7.6F;
        float expResult = 7.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = -7.9F;
        float addend2 = 0.0F;
        float expResult = -7.9F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd9() {
        System.out.println("add");
        float addend1 = 9.0F;
        float addend2 = 3.0F;
        float expResult = 12.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd10() {
        System.out.println("add");
        float addend1 = -5.0F;
        float addend2 = 3.0F;
        float expResult = -2.0F;
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
        float minuend = 6.0F;
        float subtrahend = 6.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 7.0F;
        float subtrahend = -6.0F;
        float expResult = 13.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 5.0F;
        float subtrahend = 6.0F;
        float expResult = -1.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 50.5F;
        float subtrahend = -60.0F;
        float expResult = 110.5F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 3.0F;
        float subtrahend = 4.0F;
        float expResult = -1.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 6.0F;
        float subtrahend = -7.0F;
        float expResult = 13.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 8.0F;
        float subtrahend = 4.5F;
        float expResult = 3.5F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 6.1F;
        float subtrahend = -9.0F;
        float expResult = 15.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.2F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = -4.3F;
        float subtrahend = -23.0F;
        float expResult = 18.7F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    
}
