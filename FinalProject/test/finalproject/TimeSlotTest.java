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
     * Test of compareTo method, of class TimeSlot.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        TimeSlot o = null;
        TimeSlot instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcTimestamp method, of class TimeSlot.
     */
    @Test
    public void testCalcTimestamp() {
        System.out.println("calcTimestamp");
        Timestamp baseTimeStamp = null;
        String property = "";
        TimeSlot instance = null;
        Timestamp expResult = null;
        Timestamp result = instance.calcTimestamp(baseTimeStamp, property);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
