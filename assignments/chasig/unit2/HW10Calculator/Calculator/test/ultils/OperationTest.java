/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
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
    @org.junit.Test
    public void testAddZeroesNissankicks1() {
        System.out.println("add");
        float addend1 = 0.000F;
        float addend2 = 0.000F;
        float expResult = 0.000F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
@org.junit.Test
    public void testAddSpark1() {
        System.out.println("add");
        float addend1 = 14000F;
        float addend2 = 200F;
        float expResult = 14200F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @org.junit.Test
    public void testAddCruzeSpark2() {
        System.out.println("add");
        float addend1 = 33420F;
        float addend2 = 350F;
        float expResult = 33770F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @org.junit.Test
    public void testAddVernaHyundai1() {
        System.out.println("add");
        float addend1 = -15490F;
        float addend2 = 475.30F;
        float expResult = -15014.7001953125F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @org.junit.Test
    public void testAddCretaHyundai2() {
        System.out.println("add");
        float addend1 = 26490F;
        float addend2 = 42560F;
        float expResult = 69050.0F;


        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @org.junit.Test
    public void testAddTucsonHyundai3() {
        System.out.println("add");
        float addend1 = -29990F;
        float addend2 = -227F;
        float expResult = -30217F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @org.junit.Test
    public void testAddYarisToyota1() {
        System.out.println("add");
        float addend1 = 0F;
        float addend2 = 15420F;
        float expResult = 15420F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @org.junit.Test
    public void testAddCorollaToyota2() {
        System.out.println("add");
        float addend1 = 27900F;
        float addend2 = 164.15F;
        float expResult = 28064.150390625F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @org.junit.Test
    public void testAddGeatNissan2() {
        System.out.println("add");
        float addend1 = 19900F;
        float addend2 = 270F;
        float expResult = 20170.0F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    @org.junit.Test
    public void testAddQashquiNissan3() {
        System.out.println("add");
        float addend1 = 15500F;
        float addend2 = 265F;
        float expResult = 15765F;
        float result = Operation.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    /**}
     * Test of subtract method, of class Operation.
     */
    @org.junit.Test
    public void testSubtractPositivos() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.200000047683716F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
  @org.junit.Test
    public void testSubtractZeroesNissankicks1() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.200000047683716F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @org.junit.Test
    public void testSubtractAddSpark1() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.200000047683716F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @org.junit.Test
    public void testSubtractAddCruzeSpark2() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.200000047683716F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @org.junit.Test
    public void testSubtractAddVernaHyundai1() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.200000047683716F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @org.junit.Test
    public void testSubtractAddCretaHyundai2() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.200000047683716F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @org.junit.Test
    public void testSubtractTucsonHyundai3() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.200000047683716F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @org.junit.Test
    public void testSubtractAddYarisToyota1() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.200000047683716F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @org.junit.Test
    public void testSubtractAddCorollaToyota2() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.200000047683716F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @org.junit.Test
    public void testSubtractAddGeatNissan2() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.200000047683716F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    @org.junit.Test
    public void testSubtractAddQashquiNissan3() {
        System.out.println("subtract");
        float minuend = 1.2F;
        float subtrahend = 3.4F;
        float expResult = -2.200000047683716F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
        
    }
    
}


    
    

