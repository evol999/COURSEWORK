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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author evol9
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({finalproject.TimeSlotTest.class, finalproject.UserTest.class, finalproject.TimeTableTest.class, finalproject.ClubMemberTest.class, finalproject.PhysicianTest.class, finalproject.SpecialityTest.class, finalproject.BookingSystemAppTest.class, finalproject.InitializeTest.class})
public class FinalprojectSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
