package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.PositionType;
import static org.junit.Assert.*;

public class JobTests {

    @Test
    public void testJobsForToString(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob1.toString(), "ID: " + testJob1.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence");
        assertEquals(testJob2.toString(), "ID: " + testJob2.getId() + "\nName: Product tester\nEmployer: Data not available\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence");


    }

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertTrue(job2.getId() == (job1.getId() + 1));

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob.getName(),"Product tester");
        assertEquals(testJob.getEmployer().getValue(), "ACME");
        assertEquals(testJob.getLocation().getValue(), "Desert");
        assertEquals(testJob.getPositionType().getValue(), "Quality control");
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob1.equals(testJob2));
    }


}

