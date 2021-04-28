/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;
import java.util.Properties;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evol9
 */
public class InitializeTest {

    public InitializeTest() {
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
     * Test of printProperties method, of class Initialize.
     */
    @Test
    public void testPrintProperties() {
        System.out.println("printProperties");
        Properties prop = null;
        Initialize.printProperties(prop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhysicians method, of class Initialize.
     */
    @Test
    public void testGetPhysicians() {
        System.out.println("getPhysicians");
        Initialize instance = new Initialize();
        ArrayList<Physician> expResult = null;
        ArrayList<Physician> result = instance.getPhysicians();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhysicians method, of class Initialize.
     */
    @Test
    public void testSetPhysicians() {
        System.out.println("setPhysicians");
        ArrayList<Physician> physicians = null;
        Initialize instance = new Initialize();
        instance.setPhysicians(physicians);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOK method, of class Initialize.
     */
    @Test
    public void testIsOK() {
        System.out.println("isOK");
        Initialize instance = new Initialize();
        boolean expResult = false;
        boolean result = instance.isOK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProp method, of class Initialize.
     */
    @Test
    public void testGetProp() {
        System.out.println("getProp");
        Initialize instance = new Initialize();
        Properties expResult = null;
        Properties result = instance.getProp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
