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
public class ClubMemberTest {

    public ClubMemberTest() {
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
     * Test of getIdNumber method, of class ClubMember.
     */
    @Test
    public void testGetIdNumber() {
        System.out.println("getIdNumber");
        ClubMember instance = new ClubMember();
        int expResult = 0;
        int result = instance.getIdNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdNumber method, of class ClubMember.
     */
    @Test
    public void testSetIdNumber() {
        System.out.println("setIdNumber");
        int idNumber = 0;
        ClubMember instance = new ClubMember();
        instance.setIdNumber(idNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class ClubMember.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        ClubMember instance = new ClubMember();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class ClubMember.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        ClubMember instance = new ClubMember();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelephoneNumber method, of class ClubMember.
     */
    @Test
    public void testGetTelephoneNumber() {
        System.out.println("getTelephoneNumber");
        ClubMember instance = new ClubMember();
        String expResult = "";
        String result = instance.getTelephoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class ClubMember.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String telephoneNumber = "";
        ClubMember instance = new ClubMember();
        instance.setPhoneNumber(telephoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
