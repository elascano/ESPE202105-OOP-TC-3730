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
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of add method, of class Operation.
     */
  @org.junit.Test
    public void testAddzeros() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expResult = 0.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 2.90F;
        float addend2 = 36.50F;
        float expResult = 39.40F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
 @org.junit.Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = 1.10F;
        float addend2 = 1.20F;
        float expResult = 2.3000001907348633F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
 @org.junit.Test
    public void testAdd3() {
        System.out.println("add");
        float addend1 = 30.50F;
        float addend2 = 49.90F;
        float expResult = 80.40F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
 @org.junit.Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 12.50F;
        float addend2 = 15.10F;
        float expResult = 27.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
 @org.junit.Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = 30.60F;
        float addend2 = 20.50F;
        float expResult = 51.10F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
 @org.junit.Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 20.20F;
        float addend2 = 10.10F;
        float expResult = 30.30000114440918F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      

    }
 @org.junit.Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = 8.80F;
        float addend2 = 5.40F;
        float expResult = 14.200000762939453F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      

    }
 @org.junit.Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = 5.50F;
        float addend2 = 3.40F;
        float expResult = 8.90F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
 @org.junit.Test
    public void testAdd9() {
        System.out.println("add");
        float addend1 = 13.20F;
        float addend2 = 13.10F;
        float expResult = 26.30F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
 @org.junit.Test
    public void testAdd10() {
        System.out.println("add");
        float addend1 = 8.40F;
        float addend2 = 8.50F;
        float expResult = 16.899999618530273F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    

       
    }

    /**
     * Test of subtract method, of class Operation.
     */
    @org.junit.Test
    public void testSubtractzeros() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @org.junit.Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 10.50F;
        float subtrahend = 2.45F;
        float expResult = 8.05F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
       
    }
      @org.junit.Test
    public void testSubtract1() {
        System.out.println("subtract");
        float minuend = 20.60F;
        float subtrahend = 10.20F;
        float expResult = 10.40000057220459F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
     @org.junit.Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 55.22F;
        float subtrahend = 35.15F;
        float expResult = 20.06999969482422F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       

    }
     @org.junit.Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 45.70F;
        float subtrahend = 11.30F;
        float expResult = 34.40F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
     @org.junit.Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 60.30F;
        float subtrahend = 12.22F;
        float expResult = 48.07999801635742F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
      

    }
     @org.junit.Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 33.35F;
        float subtrahend = 8.44F;
        float expResult = 24.91F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
     @org.junit.Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 11.11F;
        float subtrahend = 1.31F;
        float expResult = 9.799999237060547F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }
     @org.junit.Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 22.66F;
        float subtrahend = 3.33F;
        float expResult = 19.33F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
     @org.junit.Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 55.44F;
        float subtrahend = 35.70F;
        float expResult = 19.73999786376953F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }
     @org.junit.Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 30.30F;
        float subtrahend = 11.31F;
        float expResult = 18.98999786376953F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    

    }
     @org.junit.Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 13.01F;
        float subtrahend = 6.30F;
        float expResult = 6.71F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
    
    }
    

