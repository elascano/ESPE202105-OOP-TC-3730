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
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
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
    public void testAddPositive() {
        System.out.println("add");
        float addend1 = 3.0F;
        float addend2 = 4.0F;
        float expResult = 7.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

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

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddNegative() {
        System.out.println("add");
        float addend1 = -4.0F;
        float addend2 = -10.0F;
        float expResult = -14.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddPositiveNegative() {
        System.out.println("add");
        float addend1 = 5.0F;
        float addend2 = -4.0F;
        float expResult = 1.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddDecimals() {
        System.out.println("add");
        float addend1 = 1.3F;
        float addend2 = 3.4F;
        float expResult = 4.7F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddDecimalsNegative() {
        System.out.println("add");
        float addend1 = -3.30F;
        float addend2 = -2.0F;
        float expResult = -5.30F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddPositive2() {
        System.out.println("add");
        float addend1 = 3.0F;
        float addend2 = 4.0F;
        float expResult = 7.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddBigNum() {
        System.out.println("add");
        float addend1 = 45638.0F;
        float addend2 = 37278.0F;
        float expResult = 82916.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddBigNumNegative() {
        System.out.println("add");
        float addend1 = -345775.0F;
        float addend2 = -642847.0F;
        float expResult = -988622.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddBigNumDecimals() {
        System.out.println("add");
        float addend1 = 345775.5F;
        float addend2 = 642847.4F;
        float expResult = 988622.9F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractPositive() {
        System.out.println("subtract");
        float minuend = 5.0F;
        float subtrahend = 2.0F;
        float expResult = 3.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractZeros() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractNegative() {
        System.out.println("subtract");
        float minuend = -4.0F;
        float subtrahend = -5.0F;
        float expResult = 1.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testAddPositive3() {
        System.out.println("add");
        float addend1 = 3.0F;
        float addend2 = 4.0F;
        float expResult = 7.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractDecimalsNegative() {
        System.out.println("subtract");
        float minuend = -5.2F;
        float subtrahend = -2.1F;
        float expResult = -3.1F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractPositiveNegative() {
        System.out.println("subtract");
        float minuend = 5.0F;
        float subtrahend = -2.0F;
        float expResult = 7.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testAddPositive1() {
        System.out.println("add");
        float addend1 = 3.0F;
        float addend2 = 4.0F;
        float expResult = 7.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractBigNumPositive() {
        System.out.println("subtract");
        float minuend = 547638.0F;
        float subtrahend = 237354.0F;
        float expResult = 310284.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractBigNumNegative() {
        System.out.println("subtract");
        float minuend = -563743.0F;
        float subtrahend = -275324.0F;
        float expResult = -288419.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractBigNumPositiveDecimals() {
        System.out.println("subtract");
        float minuend = 475433.3F;
        float subtrahend = 764883.2F;
        float expResult = -289449.875F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);

    }
    
}
