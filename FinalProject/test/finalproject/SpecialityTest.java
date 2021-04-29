/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;
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
public class SpecialityTest {

    public SpecialityTest() {
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
     * Test of getSpecialityName method, of class Expertise.
     */
    @Test
    public void testGetSpecialityName() {
        System.out.println("getSpecialityName");
        Expertise instance = new Expertise();
        String expResult = "";
        String result = instance.getSpecialityName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecialityName method, of class Expertise.
     */
    @Test
    public void testSetSpecialityName() {
        System.out.println("setSpecialityName");
        String specialityName = "";
        Expertise instance = new Expertise();
        instance.setSpecialityName(specialityName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTreatments method, of class Expertise.
     */
    @Test
    public void testGetTreatments() {
        System.out.println("getTreatments");
        Expertise instance = new Expertise();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getTreatments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTreatments method, of class Expertise.
     */
    @Test
    public void testSetTreatments() {
        System.out.println("setTreatments");
        ArrayList<String> treatments = null;
        Expertise instance = new Expertise();
        instance.setTreatments(treatments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
