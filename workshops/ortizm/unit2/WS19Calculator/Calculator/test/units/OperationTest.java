/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package units;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ortiz Marlon Codec ESPE-DCCO
 */
public class OperationTest {
    
    public OperationTest() {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddZeroe() {
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
        float addend1 = 5.0F;
        float addend2 = 3.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testAddPosutivos2() {
        System.out.println("add");
        float addend1 = 1.20F;
        float addend2 = 3.40F;
        float expResult = 4.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    
    
      @Test
    public void testAddPosutivos3() {
        System.out.println("add");
        float addend1 = 3.0F;
        float addend2 = 3.0F;
        float expResult = 6.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }

      @Test
    public void testAddPosutivos4() {
        System.out.println("add");
        float addend1 = 15.0F;
        float addend2 = 3.0F;
        float expResult = 18.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }

      @Test
    public void testAddPosutivos5() {
        System.out.println("add");
        float addend1 = 1.20F;
        float addend2 = 3.40F;
        float expResult = 4.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }

      @Test
    public void testAddPosutivos6() {
        System.out.println("add");
        float addend1 = 14.8F;
        float addend2 = 5.7F;
        float expResult = 20.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }

      @Test
    public void testAddPosutivos7() {
        System.out.println("add");
        float addend1 = 1.20F;
        float addend2 = 3.40F;
        float expResult = 4.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }

      @Test
    public void testAddPosutivos8() {
        System.out.println("add");
        float addend1 = 9.9F;
        float addend2 = 9.1F;
        float expResult = 20.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }

      @Test
    public void testAddPosutivos9() {
        System.out.println("add");
        float addend1 = 25.0F;
        float addend2 = 15.0F;
        float expResult = 40.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
      @Test
    public void testAddPosutivos10() {
        System.out.println("add");
        float addend1 = 13.20F;
        float addend2 = 3.40F;
        float expResult = 17.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }



    /**
     * Test of subtract method, of class Operation.
     */
  
      @Test
    public void testSubtract1() {
        System.out.println("subtract");
        float minuend = 5.0F;
        float subtrahend = 2.0F;
        float expResult = 3.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 19.0F;
        float subtrahend = 18.0F;
        float expResult = 1.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 11.0F;
        float subtrahend = 13.0F;
        float expResult = -2.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 8.9F;
        float subtrahend = 4.5F;
        float expResult = 4.4F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 9.4F;
        float subtrahend = 5.4F;
        float expResult = 4.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 1.0F;
        float subtrahend = 0.0F;
        float expResult = 1.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 15.0F;
        float subtrahend = 5.0F;
        float expResult = 10.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 10.0F;
        float subtrahend = 9.2F;
        float expResult = 0.8F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 14.0F;
        float subtrahend = 12.2F;
        float expResult = 1.8F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 15.0F;
        float subtrahend = 1.9F;
        float expResult = 13.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
