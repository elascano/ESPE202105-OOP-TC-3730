/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package units;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
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
     * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
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
    public void testAddIntegers() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = 3.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }   
    @Test
    public void testAddIntegerNegativeAndPositive() {
        System.out.println("add");
        float addend1 = -5.0F;
        float addend2 = 2.0F;
        float expResult = -3.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddIntengerPositiveAndNegative() {
        System.out.println("add");
        float addend1 = 10.0F;
        float addend2 = -5.5F;
        float expResult = 4.5F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddFloatAndIntenger() {
        System.out.println("add");
        float addend1 = 7.6F;
        float addend2 = 4.F;
        float expResult = 11.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddFloats() {
        System.out.println("add");
        float addend1 = -7.6F;
        float addend2 = -5.6F;
        float expResult = -13.2F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddZeroAndIntenger() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 7.0F;
        float expResult = 7.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddZeroAndFoat() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 7.6F;
        float expResult = 7.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddFloatNegativeAndZero() {
        System.out.println("add");
        float addend1 = -7.9F;
        float addend2 = 0.0F;
        float expResult = -7.90F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddIntengerAndFloatsLarge() {
        System.out.println("add");
        float addend1 = 8765.23F;
        float addend2 = 8907676.45F;
        float expResult = 8916441.00F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }


    /**
     * Test of substract method, of class Operation.
     * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
     */
    @Test
    public void testSubstractZeroes() {
        System.out.println("substract");
        float minuend = 0.0F;
        float subrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractIntegers() {
        System.out.println("substract");
        float minuend = 5.0F;
        float subrahend = 3.0F;
        float expResult = 2.0F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractIntegerNegativeAndPositive() {
        System.out.println("substract");
        float minuend = -5.0F;
        float subrahend = 2.0F;
        float expResult = -7.0F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractIntengerPositiveAndNegative() {
        System.out.println("substract");
        float minuend = 10.0F;
        float subrahend = -5.5F;
        float expResult = 15.5F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractFloatAndIntenger() {
        System.out.println("substract");
        float minuend = 7.6F;
        float subrahend = 4.0F;
        float expResult = 3.6F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractFloats() {
        System.out.println("substract");
        float minuend = -7.6F;
        float subrahend = -5.6F;
        float expResult = -2.0F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractZeroAndIntenger() {
        System.out.println("substract");
        float minuend = 0.0F;
        float subrahend = 7.0F;
        float expResult = -7.0F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractZeroAndFoat() {
        System.out.println("substract");
        float minuend = 0.0F;
        float subrahend = 7.6F;
        float expResult = -7.6F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractFloatNegativeAndZero() {
        System.out.println("substract");
        float minuend = -7.9F;
        float subrahend = 0.0F;
        float expResult = -7.9F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractIntengerAndFloatsLarge() {
        System.out.println("substract");
        float minuend = 8765.0F;
        float subrahend = 8909676.45F;
        float expResult = -8900911.45F;
        float result = Operation.substract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
}