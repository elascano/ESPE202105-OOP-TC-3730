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
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
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
    public void testZeroes() {
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
        float addend1 = 0.0F;
        float addend2 = 3.4F;
        float expResult = 3.4F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 7.3F;
        float expResult = 7.3F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = 4.0F;
        float addend2 = 4.0F;
        float expResult = 8.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 6.0F;
        float addend2 = 4.0F;
        float expResult = 10.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = 12.0F;
        float addend2 = 12.0F;
        float expResult = 24.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = 9.0F;
        float addend2 = 10.0F;
        float expResult = 19.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testAdd9() {
        System.out.println("add");
        float addend1 = 2.0F;
        float addend2 = 70.0F;
        float expResult = 72.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void testAdd10() {
        System.out.println("add");
        float addend1 = 7.2F;
        float addend2 = 3.4F;
        float expResult = 10.6F;
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
    
}
