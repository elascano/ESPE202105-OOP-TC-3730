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
 * @author Estefania
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
    public void testAdd1() {
        System.out.println("add");
        float addend1 = 3.0F;
        float addend2 = 4.0F;
        float expResult = 7.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);   
    }
    
    @org.junit.Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = 3.30F;
        float addend2 = 4.25F;
        float expResult = 7.55F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);   
    } 
    
    @org.junit.Test
    public void testAdd3() {
        System.out.println("add");
        float addend1 = 23.43F;
        float addend2 = 12.6F;
        float expResult = 36.03F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);   
    } 
    
    @org.junit.Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 21.6F;
        float addend2 = 4.12F;
        float expResult = 25.720001220703125F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);   
    } 
     
    @org.junit.Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = 1.0F;
        float addend2 = 45.2F;
        float expResult = 46.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);   
    } 
    
    @org.junit.Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 29.0F;
        float addend2 = 7.20F;
        float expResult = 36.20F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);   
    } 
    
    @org.junit.Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = 21.80F;
        float addend2 = 53.60F;
        float expResult = 75.39999389648438F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);   
    } 

    @org.junit.Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = 73.90F;
        float addend2 = 12.80F;
        float expResult = 86.70000457763672F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);   
    } 

    @org.junit.Test
    public void testAdd9() {
        System.out.println("add");
        float addend1 = 33.30F;
        float addend2 = 41.20F;
        float expResult = 74.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);   
    } 
    
    @org.junit.Test
    public void testAdd10() {
        System.out.println("add");
        float addend1 = 42.0F;
        float addend2 = 5.0F;
        float expResult = 47.0F;
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
    public void testSubtract1() {
        System.out.println("subtract");
        float minuend = 2.0F;
        float subtrahend = 12.0F;
        float expResult = -10.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }  
    
    @org.junit.Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 21.80F;
        float subtrahend = 15.80F;
        float expResult = 5.999999046325684F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }  
   
    @org.junit.Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 14.0F;
        float subtrahend = 3.0F;
        float expResult = 11.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    } 
    
    @org.junit.Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 13.0F;
        float subtrahend = 8.70F;
        float expResult = 4.3F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }  
    
       @org.junit.Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 45.90F;
        float subtrahend = 26.30F;
        float expResult = 19.60000228881836F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
       @org.junit.Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 7.10F;
        float subtrahend = 2.60F;
        float expResult = 4.5F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
       @org.junit.Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 35.50F;
        float subtrahend = 23.20F;
        float expResult = 12.299999237060547F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
       @org.junit.Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 27.0F;
        float subtrahend = 12.0F;
        float expResult = 15.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
       @org.junit.Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 2.20F;
        float subtrahend = 1.30F;
        float expResult = 0.9000000953674316F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
   
       @org.junit.Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 12.0F;
        float subtrahend = 4.0F;
        float expResult = 8.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
}
