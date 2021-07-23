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
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
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
      public void testAdd1() {
        System.out.println("add");
        float addend1 = 5.3F;
        float addend2 = 4.6F;
        float expResult = 9.9F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
       @Test
    public void testAdd2() {
        System.out.println("add");
        float addend1 = 4.6F;
        float addend2 = 2.2F;
        float expResult = 6.8F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
     @Test
    public void testAdd3() {
        System.out.println("add");
        float addend1 = 6.3F;
        float addend2 = 7.6F;
        float expResult = 13.9F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
     @Test
    public void testAdd4() {
        System.out.println("add");
        float addend1 = 7.3F;
        float addend2 = 1.5F;
        float expResult = 8.8F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
     @Test
    public void testAdd5() {
        System.out.println("add");
        float addend1 = 5.5F;
        float addend2 = 3.2F;
        float expResult = 8.7F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
     @Test
    public void testAdd6() {
        System.out.println("add");
        float addend1 = 1.3F;
        float addend2 = 6.3F;
        float expResult = 7.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
     @Test
    public void testAdd7() {
        System.out.println("add");
        float addend1 = 5.5F;
        float addend2 = 7.2F;
        float expResult = 12.7F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
     @Test
    public void testAdd8() {
        System.out.println("add");
        float addend1 = 7.8F;
        float addend2 = 4.6F;
        float expResult = 12.4F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
     @Test
    public void testAdd9() {
        System.out.println("add");
        float addend1 = 4.7F;
        float addend2 = 2.9F;
        float expResult = 7.6F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
     @Test
    public void testAdd10() {
        System.out.println("add");
        float addend1 = 8.6F;
        float addend2 = 7.5F;
        float expResult = 16.1F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.1);
        
    }
    
    

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 4.8F;
        float subtranend = 2.6F;
        float expResult = 2.2F;
        float result = Operation.subtract(minuend, subtranend);
        assertEquals(expResult, result, 0.1);
        
    }
    
    
     @Test
    public void testSubtract1() {
        System.out.println("subtract");
        float minuend = 13.5F;
        float subtranend = 2.6F;
        float expResult = 10.9F;
        float result = Operation.subtract(minuend, subtranend);
        assertEquals(expResult, result, 0.1);
        
    }
    
     @Test
    public void testSubtract2() {
        System.out.println("subtract");
        float minuend = 3.2F;
        float subtranend = 1.3F;
        float expResult = 1.9F;
        float result = Operation.subtract(minuend, subtranend);
        assertEquals(expResult, result, 0.1);
        
    }
    
     @Test
    public void testSubtract4() {
        System.out.println("subtract");
        float minuend = 4.8F;
        float subtranend = 2.6F;
        float expResult = 2.2F;
        float result = Operation.subtract(minuend, subtranend);
        assertEquals(expResult, result, 0.1);
        
    }
    
     @Test
    public void testSubtract5() {
        System.out.println("subtract");
        float minuend = 8.5F;
        float subtranend = 2.6F;
        float expResult = 5.9F;
        float result = Operation.subtract(minuend, subtranend);
        assertEquals(expResult, result, 0.0);
        
    }
    
     @Test
    public void testSubtract6() {
        System.out.println("subtract");
        float minuend = 5.2F;
        float subtranend = 4.6F;
        float expResult = 0.6F;
        float result = Operation.subtract(minuend, subtranend);
        assertEquals(expResult, result, 0.1);
        
    }
    
     @Test
    public void testSubtract7() {
        System.out.println("subtract");
        float minuend = 7.3F;
        float subtranend = 4.6F;
        float expResult = 2.7F;
        float result = Operation.subtract(minuend, subtranend);
        assertEquals(expResult, result, 0.1);
        
        
    }
    
     @Test
    public void testSubtract8() {
        System.out.println("subtract");
        float minuend = 5.7F;
        float subtranend = 4.1F;
        float expResult = 1.6F;
        float result = Operation.subtract(minuend, subtranend);
        assertEquals(expResult, result, 0.1);
        
    }
    
     @Test
    public void testSubtract9() {
        System.out.println("subtract");
        float minuend = 4.5F;
        float subtranend = 2.6F;
        float expResult = 1.9F;
        float result = Operation.subtract(minuend, subtranend);
        assertEquals(expResult, result, 0.1);
        
    }
    
    
     @Test
    public void testSubtract10() {
        System.out.println("subtract");
        float minuend = 9.4F;
        float subtranend = 4.6F;
        float expResult = 4.8F;
        float result = Operation.subtract(minuend, subtranend);
        assertEquals(expResult, result, 0.1);
        
    }
    
    
    
    
}
