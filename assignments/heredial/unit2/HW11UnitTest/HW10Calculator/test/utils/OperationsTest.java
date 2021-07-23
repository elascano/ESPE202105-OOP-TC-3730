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
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class OperationsTest {
    
    public OperationsTest() {
    }

    //TEST ADD
    
    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAdd0() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        float expResult = 4.6F;
        float result = Operations.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
    }
    
    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAdd1() {
        System.out.println("add");
        float addend1 = 1.8F;
        float addend2 = 2.2F;
        float expResult = 4.0F;
        float result = Operations.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = 7.0F;
        float addend2 = 2.5F;
        float expResult = 9.5F;
        float result = Operations.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAdd3() {
        System.out.println("add");
        float addend1 = 9.5F;
        float addend2 = 2.5F;
        float expResult = 12.0F;
        float result = Operations.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 5.9F;
        float addend2 = 8.2F;
        float expResult = 14.1F;
        float result = Operations.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = 3.6F;
        float addend2 = -8.3F;
        float expResult = -4.7F;
        float result = Operations.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);

    }
    
    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 8.2F;
        float addend2 = -2.5F;
        float expResult = 5.7F;
        float result = Operations.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = 1.7F;
        float addend2 = -5.9F;
        float expResult = -4.2F;
        float result = Operations.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = 7.8F;
        float addend2 = 9.0F;
        float expResult = 16.8F;
        float result = Operations.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAdd9() {
        System.out.println("add");
        float addend1 = -8.9F;
        float addend2 = -7.2F;
        float expResult = -16.1F;
        float result = Operations.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);

    }
    
    //TEST SUBSTRACT
    
    /**
     * Test of substrat method, of class Operations.
     */
    @Test
    public void testSubstrat0() {
        System.out.println("substrat");
        float minued = 1.2F;
        float subtrahend = 1.0F;
        float expResult = 0.2F;
        float result = Operations.substrat(minued, subtrahend);
        assertEquals(expResult, result, 0.1);

    }
    
    /**
     * Test of substrat method, of class Operations.
     */
    @Test
    public void testSubstrat1() {
        System.out.println("substrat");
        float minued = -0.5F;
        float subtrahend = -1.0F;
        float expResult = 0.5F;
        float result = Operations.substrat(minued, subtrahend);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of substrat method, of class Operations.
     */
    @Test
    public void testSubstrat2() {
        System.out.println("substrat");
        float minued = -7.8F;
        float subtrahend = 2.5F;
        float expResult = -10.3F;
        float result = Operations.substrat(minued, subtrahend);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of substrat method, of class Operations.
     */
    @Test
    public void testSubstrat3() {
        System.out.println("substrat");
        float minued = 1.3F;
        float subtrahend = -1.0F;
        float expResult = 2.3F;
        float result = Operations.substrat(minued, subtrahend);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of substrat method, of class Operations.
     */
    @Test
    public void testSubstrat4() {
        System.out.println("substrat");
        float minued = 9.7F;
        float subtrahend = 9.2F;
        float expResult = 0.5F;
        float result = Operations.substrat(minued, subtrahend);
        assertEquals(expResult, result, 0.1);

    }
    
     /**
     * Test of substrat method, of class Operations.
     */
    @Test
    public void testSubstrat5() {
        System.out.println("substrat");
        float minued = 2.6F;
        float subtrahend = 8.2F;
        float expResult = -5.6F;
        float result = Operations.substrat(minued, subtrahend);
        assertEquals(expResult, result, 0.0);

    }
    
     /**
     * Test of substrat method, of class Operations.
     */
    @Test
    public void testSubstrat6() {
        System.out.println("substrat");
        float minued = 9.3F;
        float subtrahend = -5.9F;
        float expResult = 15.2F;
        float result = Operations.substrat(minued, subtrahend);
        assertEquals(expResult, result, 0.1);

    }
    
     /**
     * Test of substrat method, of class Operations.
     */
    @Test
    public void testSubstrat7() {
        System.out.println("substrat");
        float minued = -8.3F;
        float subtrahend = 1.6F;
        float expResult = -9.9F;
        float result = Operations.substrat(minued, subtrahend);
        assertEquals(expResult, result, 0.1);

    }
    
     /**
     * Test of substrat method, of class Operations.
     */
    @Test
    public void testSubstrat8() {
        System.out.println("substrat");
        float minued = 5.1F;
        float subtrahend = 5.9F;
        float expResult = -0.8F;
        float result = Operations.substrat(minued, subtrahend);
        assertEquals(expResult, result, 0.1);

    }
    
     /**
     * Test of substrat method, of class Operations.
     */
    @Test
    public void testSubstrat9() {
        System.out.println("substrat");
        float minued = -6.8F;
        float subtrahend = -1.0F;
        float expResult = -5.8F;
        float result = Operations.substrat(minued, subtrahend);
        assertEquals(expResult, result, 0.0);

    }
}
