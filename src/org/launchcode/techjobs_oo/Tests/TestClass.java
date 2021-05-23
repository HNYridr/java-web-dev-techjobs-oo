package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class TestClass {
    private Job test_jobOne;
    private Job test_jobTwo;
    private Job test_jobThree;
    private Job test_jobFour;
    private Job test_jobFive;


    @Before
    public void createJobObject() { test_jobOne = new Job();
                                    test_jobTwo = new Job(); }


    @Test
    public void testSettingJobId() {
        assertEquals(1, test_jobTwo.getId() - test_jobOne.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        test_jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            assertTrue(test_jobThree.getName() instanceof String);
            assertTrue(test_jobThree.getEmployer() instanceof Employer);
            assertTrue(test_jobThree.getLocation() instanceof Location);
            assertTrue(test_jobThree.getPositionType() instanceof PositionType);
            assertTrue(test_jobThree.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        test_jobFour = new Job("BB", new Employer("BB"), new Location("BB"), new PositionType("BB"), new CoreCompetency("BB"));
        test_jobFive = new Job("BB", new Employer("BB"), new Location("BB"), new PositionType("BB"), new CoreCompetency("BB"));
            assertEquals(test_jobFour.getId(), test_jobFive.getId());
    }
}
