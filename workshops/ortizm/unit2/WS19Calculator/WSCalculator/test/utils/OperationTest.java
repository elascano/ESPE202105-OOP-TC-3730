/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class OperationTest {
    
    public OperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class Operation.
     */
   @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        float expResult = 4.6F;
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
        float subrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    
}