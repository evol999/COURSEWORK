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
public class TimeTableTest {

    public TimeTableTest() {
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
     * Test of getTsList method, of class TimeTable.
     */
    @Test
    public void testGetTsList() {
        System.out.println("getTsList");
        TimeTable instance = new TimeTable();
        ArrayList<TimeSlot> expResult = null;
        ArrayList<TimeSlot> result = instance.getTsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTsList method, of class TimeTable.
     */
    @Test
    public void testSetTsList() {
        System.out.println("setTsList");
        ArrayList<TimeSlot> tsList = null;
        TimeTable instance = new TimeTable();
        instance.setTsList(tsList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
