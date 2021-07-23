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
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAdd1() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 1.6F;
        float expResult = 2.8F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    
    }

     @Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        float expResult = 4.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    
    }
    
    
     @Test
    public void testAdd3() {
        System.out.println("add");
        float addend1 = 1.9F;
        float addend2 = 6.4F;
        float expResult = 8.3F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    
    }
    
     @Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 7.2F;
        float addend2 = 3.5F;
        float expResult = 10.7F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    
    }
    
     @Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = 1.8F;
        float addend2 = 5.4F;
        float expResult = 7.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    
    }
    
    
    
     @Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 8.3F;
        float addend2 = 20.4F;
        float expResult = 28.7F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    
    }
    
    
     @Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = 1.5F;
        float addend2 = 5.4F;
        float expResult = 6.9F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    
    }
    
    
     @Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = 3.8F;
        float addend2 = 4.7F;
        float expResult = 8.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    
    }
    
    
     @Test
    public void testAdd9() {
        System.out.println("add");
        float addend1 = 6.2F;
        float addend2 = 2.5F;
        float expResult = 8.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    
    }
    
    
     @Test
    public void testAdd10() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 4.6F;
        float expResult = 5.8F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    
    }
    
    
    
    
    
    
    
    //Difference
    
    
    
    
    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtract1() {
        System.out.println("subtract");
        float minuend = 4.4F;
        float subtrahend = 2.1F;
        float expResult = 2.3F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
        
    }
    
    
      @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 6.3F;
        float subtrahend = 4.2F;
        float expResult = 2.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
        
    }
    
    
      @Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 6.2F;
        float subtrahend = 4.7F;
        float expResult = 1.5F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
      @Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 12.6F;
        float subtrahend = 13.4F;
        float expResult = -0.8F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
        
    }
    
      @Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 13.5F;
        float subtrahend = 8.4F;
        float expResult = 5.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
        
    }
    
      @Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 4.3F;
        float subtrahend = 1.5F;
        float expResult = 2.8F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
        
    }
    
      @Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 5.6F;
        float subtrahend = 2.4F;
        float expResult = 3.2F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
        
    }
    
      @Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 1.9F;
        float subtrahend = 4.5F;
        float expResult = -2.6F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    
      @Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 3.7F;
        float subtrahend = 3.9F;
        float expResult = -0.2F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
        
    }
    
    
      @Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 6.9F;
        float subtrahend = 4.06F;
        float expResult = 2.84F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.1);
        
    }
}
