/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

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
public class UserTest {

    public UserTest() {
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
     * Test of getFullName method, of class User.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        User instance = new User();
        String expResult = "";
        String result = instance.getFullName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFullName method, of class User.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "";
        User instance = new User();
        instance.setFullName(fullName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeTable method, of class User.
     */
    @Test
    public void testGetTimeTable() {
        System.out.println("getTimeTable");
        User instance = new User();
        TimeTable expResult = null;
        TimeTable result = instance.gettTappointments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeTable method, of class User.
     */
    @Test
    public void testSetTimeTable() {
        System.out.println("setTimeTable");
        TimeTable timeTable = null;
        User instance = new User();
        instance.settTappointments(timeTable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
