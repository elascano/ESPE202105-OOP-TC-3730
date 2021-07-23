/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
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
        float addend1 = 5.0F;
        float addend2 = 3.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAddPositivos() {
        System.out.println("add");
        float addend1 = 1.20F;
        float addend2 = 3.40F;
        float expResult = 4.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 7.00F;
        float addend2 = 2.00F;
        float expResult = 9.00F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = -5.00F;
        float addend2 = 2.00F;
        float expResult = -3.00F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 7.60F;
        float addend2 = 4.00F;
        float expResult = 11.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = 0.00F;
        float addend2 = 7.00F;
        float expResult = 7.00F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = 0.00F;
        float addend2 = 7.60F;
        float expResult = 7.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd9() {
        System.out.println("add");
        float addend1 = 374.00F;
        float addend2 = 117.00F;
        float expResult = 491.00F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAdd10() {
        System.out.println("add");
        float addend1 = 125.00F;
        float addend2 = 526.60F;
        float expResult = 651.60F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of substract method, of class Operation.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubstract1() {
        System.out.println("substract");
        float minuend = 5.00F;
        float subtrahend = 2.00F;
        float expResult = 3.00F;
        float result = Operation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubstract2() {
        System.out.println("substract");
        float minuend = 10.00F;
        float subtrahend = 5.50F;
        float expResult = 4.50F;
        float result = Operation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubstract3() {
        System.out.println("substract");
        float minuend = -7.60F;
        float subtrahend = 5.60F;
        float expResult = -13.20F;
        float result = Operation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubstract4() {
        System.out.println("substract");
        float minuend = -7.90F;
        float subtrahend = 0.00F;
        float expResult = -7.90F;
        float result = Operation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubstract5() {
        System.out.println("substract");
        float minuend = 27.00F;
        float subtrahend = 25.00F;
        float expResult = 2.00F;
        float result = Operation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubstract6() {
        System.out.println("substract");
        float minuend = 10.00F;
        float subtrahend = 2.00F;
        float expResult = 8.00F;
        float result = Operation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubstract7() {
        System.out.println("substract");
        float minuend = 75.50F;
        float subtrahend = 36.00F;
        float expResult = 39.50F;
        float result = Operation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubstract8() {
        System.out.println("substract");
        float minuend = 15.50F;
        float subtrahend = 2.40F;
        float expResult = 13.10F;
        float result = Operation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubstract9() {
        System.out.println("substract");
        float minuend = 25.00F;
        float subtrahend = 10.00F;
        float expResult = 15.00F;
        float result = Operation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubstract10() {
        System.out.println("substract");
        float minuend = 41.28F;
        float subtrahend = 6.03F;
        float expResult = 35.25F;
        float result = Operation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
}
