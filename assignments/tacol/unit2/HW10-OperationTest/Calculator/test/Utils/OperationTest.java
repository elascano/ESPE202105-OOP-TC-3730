/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
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
    public void testAdd() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 3.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void test() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 3.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 3.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void TestAdd() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 3.0F;
        float expResult = 8.0F;
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
    public void TestSubtract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testsubstract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
     @Test
    public void Testsubstract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        }
    
     @Test
    public void TestSubstract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
}
