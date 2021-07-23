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
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class OperationTest {
    
    public OperationTest() {
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
        
        fail("The test case is a prototype.");
    }
    
}
