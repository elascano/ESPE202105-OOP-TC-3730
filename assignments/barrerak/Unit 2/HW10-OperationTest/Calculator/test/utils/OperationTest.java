/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
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
        float minuend = 3.0F;
        float subtrahend = 3.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
  
    }
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 5.0F;
        float subtrahend = 4.0F;
        float expResult = 1.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
  
    }
    @Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 10.0F;
        float subtrahend = 5.0F;
        float expResult = 5.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
  
    }
    @Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 12.0F;
        float subtrahend = 30.0F;
        float expResult = -18.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
  
    }
    @Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 30.0F;
        float subtrahend = 15.0F;
        float expResult = 15.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
  
    }
    @Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 13.0F;
        float subtrahend = 1.0F;
        float expResult = 12.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
  
    }
    @Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 19.0F;
        float subtrahend = 20.0F;
        float expResult = -1.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
  
    }
    @Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 13.0F;
        float subtrahend = 100.0F;
        float expResult = -87.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
  
    }
    @Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 1.0F;
        float subtrahend = 900.0F;
        float expResult = -899.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 12.0F;
        float subtrahend = 12.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
  
    }
    @Test
        public void testAddPositivos() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        float expResult = 4.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
      
    }
    @Test
        public void testAdd() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expResult = 0.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
        @Test
        public void testAdd1() {
        System.out.println("add");
        float addend1 = 12.0F;
        float addend2 = 22.0F;
        float expResult = 34.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
        @Test
        public void testAdd2() {
        System.out.println("add");
        float addend1 = 2.0F;
        float addend2 = 3.0F;
        float expResult = 5.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
        @Test
        public void testAdd3() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 23.0F;
        float expResult = 28.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
        @Test
        public void testAdd4() {
        System.out.println("add");
        float addend1 = 87.0F;
        float addend2 = 2.0F;
        float expResult = 89.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
        @Test
        public void testAdd5() {
        System.out.println("add");
        float addend1 = 1.0F;
        float addend2 = 2.0F;
        float expResult = 3.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
        @Test
        public void testAdd6() {
        System.out.println("add");
        float addend1 = 10.0F;
        float addend2 = 10.0F;
        float expResult = 20.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
        @Test
        public void testAdd7() {
        System.out.println("add");
        float addend1 = 20.0F;
        float addend2 = 20.0F;
        float expResult = 40.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
        @Test
        public void testAdd8() {
        System.out.println("add");
        float addend1 = 9.0F;
        float addend2 = 8.0F;
        float expResult = 17.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
        @Test
        public void testAdd9() {
        System.out.println("add");
        float addend1 = 3.0F;
        float addend2 = 6.0F;
        float expResult = 9.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
        @Test
        public void testAdd10() {
        System.out.println("add");
        float addend1 = 2.0F;
        float addend2 = 5.0F;
        float expResult = 7.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
        
        
}
