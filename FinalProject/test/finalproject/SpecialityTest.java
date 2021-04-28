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
     * Test of getSpecialityName method, of class Speciality.
     */
    @Test
    public void testGetSpecialityName() {
        System.out.println("getSpecialityName");
        Speciality instance = new Speciality();
        String expResult = "";
        String result = instance.getSpecialityName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecialityName method, of class Speciality.
     */
    @Test
    public void testSetSpecialityName() {
        System.out.println("setSpecialityName");
        String specialityName = "";
        Speciality instance = new Speciality();
        instance.setSpecialityName(specialityName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTreatments method, of class Speciality.
     */
    @Test
    public void testGetTreatments() {
        System.out.println("getTreatments");
        Speciality instance = new Speciality();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getTreatments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTreatments method, of class Speciality.
     */
    @Test
    public void testSetTreatments() {
        System.out.println("setTreatments");
        ArrayList<String> treatments = null;
        Speciality instance = new Speciality();
        instance.setTreatments(treatments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
