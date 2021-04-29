/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Timestamp;
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
public class TimeSlotTest {

    public TimeSlotTest() {
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
     * Test of getTimeStampStart method, of class TimeSlot.
     */
    @Test
    public void testGetTimeStampStart() {
        System.out.println("getTimeStampStart");
        TimeSlot instance = null;
        Timestamp expResult = null;
        Timestamp result = instance.getTimeStampStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeStampStart method, of class TimeSlot.
     */
    @Test
    public void testSetTimeStampStart() {
        System.out.println("setTimeStampStart");
        Timestamp timeStampStart = null;
        TimeSlot instance = null;
        instance.setTimeStampStart(timeStampStart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeStampEnd method, of class TimeSlot.
     */
    @Test
    public void testGetTimeStampEnd() {
        System.out.println("getTimeStampEnd");
        TimeSlot instance = null;
        Timestamp expResult = null;
        Timestamp result = instance.getTimeStampEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeStampEnd method, of class TimeSlot.
     */
    @Test
    public void testSetTimeStampEnd() {
        System.out.println("setTimeStampEnd");
        Timestamp timeStampEnd = null;
        TimeSlot instance = null;
        instance.setTimeStampEnd(timeStampEnd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsAvailable method, of class TimeSlot.
     */
    @Test
    public void testGetIsAvailable() {
        System.out.println("getIsAvailable");
        TimeSlot instance = null;
        Boolean expResult = null;
        Boolean result = instance.getIsAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsAvailable method, of class TimeSlot.
     */
    @Test
    public void testSetIsAvailable() {
        System.out.println("setIsAvailable");
        Boolean isAvailable = null;
        TimeSlot instance = null;
        instance.setIsAvailable(isAvailable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewTimestamp method, of class TimeSlot.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
//        Timestamp baseTimeStamp = null;
        TimeTable table = new TimeTable();
        int daysToAdd = 2;
        int hour = 7;
        int minute = 15;
        TimeSlot instance = new TimeSlot(table.getBaseTimeStamp(), "MON 0700 0800");
//        Timestamp expResult = null;
//        Timestamp result = instance.getNewTimestamp(table.getBaseTimeStamp(), daysToAdd, hour, minute);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Base date: " + table.getBaseTimeStamp().toString());
//        System.out.println("result: " + result.toString());
        fail("The test case is a prototype.");
    }

}
