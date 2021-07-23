/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template ile, choose Tools | Templates
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
 * @author Bryan Chiliquinga Beta_Sotware ESPE-DCCO
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
     * Test o add method, o class Operation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double addend1 = 1.2;
        double addend2 = 3.4;
        double expResult = 4.6;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd1() {
        System.out.println("add");
        double addend1 = 1.0;
        double addend2 = 3.5;
        double expResult = 4.5;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add");
        double addend1 = 12.56;
        double addend2 = 67.57;
        double expResult = 80.13;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd3() {
        System.out.println("add");
        double addend1 = 115.67;
        double addend2 = 1.0;
        double expResult = 116.67;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd4() {
        System.out.println("add");
        double addend1 = 4545664.87;
        double addend2 = 343.5;
        double expResult = 4546008.37;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd5() {
        System.out.println("add");
        double addend1 = 2223.5;
        double addend2 = 6666.07;
        double expResult = 8889.57;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd6() {
        System.out.println("add");
        double addend1 = 3535.7;
        double addend2 = -67.8;
        double expResult = 3467.9;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd7() {
        System.out.println("add");
        double addend1 = -46546.6;
        double addend2 = 333.2;
        double expResult = -46213.4;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd8() {
        System.out.println("add");
        double addend1 = -678.023;
        double addend2 = -99.9423;
        double expResult = -777.9653;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd9() {
        System.out.println("add");
        double addend1 = 34.7444;
        double addend2 = 5.02;
        double expResult = 39.7644;
        double result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test o subtract method, o class Operation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double minuend = 1.2;
        double subtrahend = 3.4;
        double expResult = -2.2;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract1() {
        System.out.println("subtract");
        double minuend = 1.0;
        double subtrahend = 3.5;
        double expResult = -2.5;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        double minuend = 12.56;
        double subtrahend = 67.57;
        double expResult = -55.01;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract3() {
        System.out.println("subtract");
        double minuend = 115.67;
        double subtrahend = 1.0;
        double expResult = 114.67;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract4() {
        System.out.println("subtract");
        double minuend = 4545664.87;
        double subtrahend = 343.5;
        double expResult = 4545321.37;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract5() {
        System.out.println("subtract");
        double minuend = 2223.5;
        double subtrahend = 6666.07;
        double expResult = -4442.57;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract6() {
        System.out.println("subtract");
        double minuend = 3535.7;
        double subtrahend = -67.8;
        double expResult = 3603.5;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract7() {
        System.out.println("subtract");
        double minuend = -46546.6;
        double subtrahend = 333.2;
        double expResult = -46879.8;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract8() {
        System.out.println("subtract");
        double minuend = -678.023;
        double subtrahend = -99.9423;
        double expResult = -578.0807;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract9() {
        System.out.println("subtract");
        double minuend = 34.7444;
        double subtrahend = 5.02;
        double expResult = 29.7244;
        double result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
}
