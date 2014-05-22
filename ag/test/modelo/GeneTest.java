/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gleywson
 */
public class GeneTest {
    
    public GeneTest() {
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
     * Test of getBit method, of class Gene.
     */
    @Test
    public void testGetBit() {
        System.out.println("getBit");
        Gene instance = new Gene();
        int expResult = 1;
        instance.setBit(expResult);
        int result = instance.getBit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBit method, of class Gene.
     */
    @Test
    public void testSetBit() {
        System.out.println("setBit");
        int bit = 0;
        Gene instance = new Gene();
        instance.setBit(bit);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mutacao method, of class Gene.
     */
    @Test
    public void testMutacao() {
        System.out.println("mutacao");
        float taxa = 0.0F;
        Gene instance = new Gene();
        boolean expResult = false;
        boolean result = instance.mutacao(taxa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Gene.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Gene instance = new Gene();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Gene.
     */
//    @Test
//    public void testHashCode() {
//        System.out.println("hashCode");
//        Gene instance = new Gene();
//        int expResult = 0;
//        int result = instance.hashCode();
//        assertEquals(expResult, result);
//        assertE
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of toString method, of class Gene.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Gene instance = new Gene();
        String expResult = ""+instance.getBit();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
