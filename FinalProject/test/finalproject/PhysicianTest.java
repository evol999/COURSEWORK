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
        ArrayList<Expertise> result = instance.geteExpertiseList();
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
        instance.seteExpertiseList(specialtyList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoom method, of class Physician.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        Physician instance = new Physician();
        String expResult = "";
        String result = instance.getRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoom method, of class Physician.
     */
    @Test
    public void testSetRoom() {
        System.out.println("setRoom");
        String room = "";
        Physician instance = new Physician();
        instance.setRoom(room);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpertiseList method, of class Physician.
     */
    @Test
    public void testGetExpertiseList() {
        System.out.println("getExpertiseList");
        Physician instance = new Physician();
        ArrayList<Expertise> expResult = null;
        ArrayList<Expertise> result = instance.geteExpertiseList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExpertiseList method, of class Physician.
     */
    @Test
    public void testSetExpertiseList() {
        System.out.println("setExpertiseList");
        ArrayList<Expertise> expertiseList = null;
        Physician instance = new Physician();
        instance.seteExpertiseList(expertiseList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parseTimeSlots method, of class Physician.
     */
    @Test
    public void testParseTimeSlots() {
        System.out.println("parseTimeSlots");
        String property = "";
        Physician instance = new Physician();
        instance.parseTimeSlots(property);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parseExpertise method, of class Physician.
     */
    @Test
    public void testParseExpertise() {
        System.out.println("parseExpertise");
        String property = "";
        Physician instance = new Physician();
        instance.parseExpertise(property);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populateWeek method, of class Physician.
     */
    @Test
    public void testPopulateWeek() {
        System.out.println("populateWeek");
        Physician instance = new Physician();
//        instance.populateWeek("0900 1700");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConsultationHours method, of class Physician.
     */
    @Test
    public void testSetConsultationHours() {
        System.out.println("setConsultationHours");
        String property = "MON 0900 1000; TUE 1000 1100";
        Physician instance = new Physician();
//        instance.populateWeek("0900 1700");
        instance.setConsultationHours(property);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTsFreeTime method, of class Physician.
     */
    @Test
    public void testGetTsFreeTime() {
        System.out.println("getTsFreeTime");
        Physician instance = new Physician();
        ArrayList<TimeSlot> expResult = null;
        ArrayList<TimeSlot> result = instance.getTsFreeTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTsFreeTime method, of class Physician.
     */
    @Test
    public void testSetTsFreeTime() {
        System.out.println("setTsFreeTime");
        ArrayList<TimeSlot> tsFreeTime = null;
        Physician instance = new Physician();
        instance.setTsFreeTime(tsFreeTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of geteExpertiseList method, of class Physician.
     */
    @Test
    public void testGeteExpertiseList() {
        System.out.println("geteExpertiseList");
        Physician instance = new Physician();
        ArrayList<Expertise> expResult = null;
        ArrayList<Expertise> result = instance.geteExpertiseList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seteExpertiseList method, of class Physician.
     */
    @Test
    public void testSeteExpertiseList() {
        System.out.println("seteExpertiseList");
        ArrayList<Expertise> eExpertiseList = null;
        Physician instance = new Physician();
        instance.seteExpertiseList(eExpertiseList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
