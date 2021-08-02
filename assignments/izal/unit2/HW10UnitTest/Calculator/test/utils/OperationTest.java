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
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddZeros() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expResult = 0.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddFloat1() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 3.5F;
        float expResult = 8.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddFloat2() {
        System.out.println("add");
        float addend1 = 8.0F;
        float addend2 = 2.2F;
        float expResult = 10.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddFloat3() {
        System.out.println("add");
        float addend1 = 8.0F;
        float addend2 = 2.2F;
        float expResult = 10.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddFloat4() {
        System.out.println("add");
        float addend1 = 8.0F;
        float addend2 = 4.2F;
        float expResult = 12.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddFloat5() {
        System.out.println("add");
        float addend1 = 8.0F;
        float addend2 = 6.2F;
        float expResult = 14.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddFloat6() {
        System.out.println("add");
        float addend1 = 3.0F;
        float addend2 = 4.2F;
        float expResult = 7.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddFloat7() {
        System.out.println("add");
        float addend1 = 7.2F;
        float addend2 = 4.0F;
        float expResult = 11.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddFloat8() {
        System.out.println("add");
        float addend1 = 7.2F;
        float addend2 = 4.0F;
        float expResult = 11.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testAddFloat9() {
        System.out.println("add");
        float addend1 = 3.F;
        float addend2 = 3.4F;
        float expResult = 6.4F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.00);
        
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
        float minuend = 8.2F;
        float subtrahend = 5.2F;
        float expResult = 3.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 4.1F;
        float subtrahend = 2.0F;
        float expResult = 2.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 6.1F;
        float subtrahend = 2.1F;
        float expResult = 4.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 5.0F;
        float subtrahend = 2.0F;
        float expResult = 3.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 17.8F;
        float subtrahend = 3.9F;
        float expResult = 13.9F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 155.0F;
        float subtrahend = 48.0F;
        float expResult = 107.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 63.8F;
        float subtrahend = 15.9F;
        float expResult = 47.9F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 1058.2F;
        float subtrahend = 169.1F;
        float expResult = 889.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 12587.5F;
        float subtrahend = 1234.4F;
        float expResult = 11353.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
}
