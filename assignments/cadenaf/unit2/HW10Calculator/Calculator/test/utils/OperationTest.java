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
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
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
    public void testAddChevrolet1() {
        System.out.println("add");
        float addend1 = -17490.89F;
        float addend2 = 189F;
        float expResult = -17301.890625F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddChevrolet2() {
        System.out.println("add");
        float addend1 = 16990F;
        float addend2 = 225.60F;
        float expResult = 17215.599699375F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
   
    @Test
    public void testAddHYUNDAI1() {
        System.out.println("add");
        float addend1 = 99990.79F;
        float addend2 = -615.90F;
        float expResult = 99374.890625F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAddHYUNDAI2() {
        System.out.println("add");
        float addend1 = 23990F;
        float addend2 = 250F;
        float expResult = 24240.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAddHYUNDAI3() {
        System.out.println("add");
        float addend1 = 0F;
        float addend2 = 250.50F;
        float expResult = 250.50F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAddToyota1() {
        System.out.println("add");
        float addend1 = -58900F;
        float addend2 = -500.64F;
        float expResult = -59400.640625F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAddToyota2() {
        System.out.println("add");
        float addend1 = 0F;
        float addend2 = 0F;
        float expResult = 0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAddToyota() {
        System.out.println("add");
        float addend1 = -41990F;
        float addend2 = 300F;
        float expResult = -41690.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAddNissan1() {
        System.out.println("add");
        float addend1 = -62990.45F;
        float addend2 = -525.25F;
        float expResult = -63515.69921875F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }


    @Test
    public void testAddNissan2() {
        System.out.println("add");
        float addend1 = 22990F;
        float addend2 = 0F;
        float expResult = 22990F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
     
    }
    /**
     * Test of subtract method, of class Operation.
     */
    
     @Test
    public void testSubtractChevrolet1() {
        System.out.println("subtract");
        float minuend = 0F;
        float subtrahend = 0F;
        float expResult = 0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtractChevrolet2() {
        System.out.println("subtract");
        float minuend = 0F;
        float subtrahend = 0F;
        float expResult = 0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
   
    @Test
    public void testSubtractHYUNDAI1() {
        System.out.println("subtract");
        float minuend = 0F;
        float subtrahend = 0F;
        float expResult = 0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtractHYUNDAI2() {
        System.out.println("subtract");
        float minuend = 0F;
        float subtrahend = 0F;
        float expResult = 0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSubtractHYUNDAI3() {
        System.out.println("subtract");
        float minuend = 0F;
        float subtrahend = 0F;
        float expResult = 0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSubtractToyota1() {
        System.out.println("subtract");
        float minuend = 0F;
        float subtrahend = 0F;
        float expResult = 0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSubtractToyota2() {
        System.out.println("subtract");
        float minuend = 0F;
        float subtrahend = 0F;
        float expResult = 0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSubtractToyota() {
        System.out.println("subtract");
        float minuend = 0F;
        float subtrahend = 0F;
        float expResult = 0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSubstractNissan1() {
        System.out.println("subtract");
        float minuend = 0F;
        float subtrahend = 0F;
        float expResult = 0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }


    @Test
    public void testSubstractNissan2() {
        System.out.println("subtract");
        float minuend = 0F;
        float subtrahend = 0F;
        float expResult = 0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
     
    }

}
