/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jennifer Beltran
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
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        float expResult = 4.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    }
    
    @Test
    public void testAddPositivos() {
        System.out.println("add");
        float addend1 = 1.5F;
        float addend2 = 3.5F;
        float expResult = 5.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
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
        float expResult =11.6F;
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
        float addend1 = 5.6F;
        float addend2 = 4.8F;
        float expResult = 10.4F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd10() {
        System.out.println("add");
        float addend1 = 9.4F;
        float addend2 = 6.5F;
        float expResult = 15.9F;
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
        float subtrachend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrachend);
        assertEquals(expResult, result, 0.0);
    
    }
    
    @Test
    public void testSubtract1() {
        System.out.println("subtract");
        float minuend = 5.0F;
        float subtrachend = 3.0F;
        float expResult = 2.0F;
        float result = Operation.subtract(minuend, subtrachend);
        assertEquals(expResult, result, 0.0);
    
    }
    
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 7.0F;
        float subtrachend = 2.0F;
        float expResult = 5.0F;
        float result = Operation.subtract(minuend, subtrachend);
        assertEquals(expResult, result, 0.0);
    
    }
    
    @Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = -5.0F;
        float subtrachend = 2.0F;
        float expResult = -7.0F;
        float result = Operation.subtract(minuend, subtrachend);
        assertEquals(expResult, result, 0.0);
    
    }
    
    @Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 10.0F;
        float subtrachend = -5.5F;
        float expResult = 15.5F;
        float result = Operation.subtract(minuend, subtrachend);
        assertEquals(expResult, result, 0.0);
    
    }
    
    @Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 7.6F;
        float subtrachend = 4.0F;
        float expResult = 3.6F;
        float result = Operation.subtract(minuend, subtrachend);
        assertEquals(expResult, result, 0.0);
    
    }
    
    @Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = -7.6F;
        float subtrachend = -5.6F;
        float expResult = -2.0F;
        float result = Operation.subtract(minuend, subtrachend);
        assertEquals(expResult, result, 0.0);
    
    }
    
    @Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrachend = 7.0F;
        float expResult = -7.0F;
        float result = Operation.subtract(minuend, subtrachend);
        assertEquals(expResult, result, 0.0);
    
    }
    
    @Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrachend = 7.6F;
        float expResult = -7.6F;
        float result = Operation.subtract(minuend, subtrachend);
        assertEquals(expResult, result, 0.1);
    
    }
    
    @Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = -7.9F;
        float subtrachend = .0F;
        float expResult = -7.9F;
        float result = Operation.subtract(minuend, subtrachend);
        assertEquals(expResult, result, 0.0);
    
    }
    
    @Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 5.6F;
        float subtrachend = 4.8F;
        float expResult = 0.8F;
        float result = Operation.subtract(minuend, subtrachend);
        assertEquals(expResult, result, 0.1);
    
    }
}
