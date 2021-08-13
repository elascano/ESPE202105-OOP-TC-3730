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
 * @author Alexander Pachacama BUILDER ESPE-DCC0
 */
public class OperationTest {
    
    public OperationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Operation.
     */
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
    public void testAddZeroes() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expResult = 0.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
@Test
    public void testAddPositivos() {
        System.out.println("add");
        float addend1 = 1.255F;
        float addend2 = 3.46F;
        float expResult = 4.654F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    } 
  @Test
    public void testAdd1() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expResult = 0.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    } @Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = 7.0F;
        float addend2 = 6.550F;
        float expResult = 13.30F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    } @Test
    public void testAdd3() {
        System.out.println("add");
        float addend1 = 7.0F;
        float addend2 = 09.9990F;
        float expResult = 9.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    } 
    @Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 7.6F;
        float addend2 = 9.097F;
        float expResult = 16.69F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = 56.970F;
        float addend2 = 10.80F;
        float expResult = 67.77F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 78.4320F;
        float addend2 = 9.89F;
        float expResult = 88.322F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    } @Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = 54.0F;
        float addend2 = 45.87777F;
        float expResult = 99.877F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    } @Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = 24.676770F;
        float addend2 = 8.555F;
        float expResult = 33.23177F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    } @Test
    public void testAdd9() {
        System.out.println("add");
        float addend1 = 67.99F;
        float addend2 = 9.990F;
        float expResult = 144.F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    } @Test
    public void testAdd10() {
        System.out.println("add");
        float addend1 = 20.1F;
        float addend2 = 18.0F;
        float expResult = 38.1F;
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
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 2.1F;
        float subtrahend = 2.6F;
        float expResult = -0.5F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
        
    }@Test
    public void testSubtract3() {
        System.out.println("subtract");
        float minuend = 2.1F;
        float subtrahend = 2.0F;
        float expResult = 0.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
        
    }@Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 5.0F;
        float subtrahend = 3.0F;
        float expResult = 2.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
        
    }@Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 3.0F;
        float subtrahend = 1.0F;
        float expResult = 2.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
        
    }@Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 4.0F;
        float subtrahend = 2.0F;
        float expResult = 2.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
        
    }@Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 6.777F;
        float subtrahend = 5.0F;
        float expResult = 2.90889F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
        
    }@Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 7.0654F;
        float subtrahend = 4.043F;
        float expResult = 3.056F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
        
    }@Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 2.0111F;
        float subtrahend = 3.706F;
        float expResult = -1.909F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
        
    }@Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 5.0F;
        float subtrahend = 5.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);   
    }
   
}
