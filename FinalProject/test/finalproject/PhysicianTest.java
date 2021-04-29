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
public class PhysicianTest {

    public PhysicianTest() {
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
     * Test of getSpecialtyList method, of class Physician.
     */
    @Test
    public void testGetSpecialtyList() {
        System.out.println("getSpecialtyList");
        Physician instance = new Physician();
        ArrayList<Expertise> expResult = null;
        ArrayList<Expertise> result = instance.getExpertiseList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecialtyList method, of class Physician.
     */
    @Test
    public void testSetSpecialtyList() {
        System.out.println("setSpecialtyList");
        ArrayList<Expertise> specialtyList = null;
        Physician instance = new Physician();
        instance.setExpertiseList(specialtyList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
