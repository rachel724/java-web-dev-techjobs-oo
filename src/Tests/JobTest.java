package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.PositionType;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();

        assertFalse(job1.equals(job2));
        assertTrue(job1.getId() + 1 == job2.getId());
    }

    @Test
    public void testJobConstructorSetAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Employer emp = new Employer("Test Employer");
        Location loc = new Location("Test Location");
        PositionType pT = new PositionType("Test PositionType");
        CoreCompetency cC = new CoreCompetency("Test CoreCompetency");
        Job job1 = new Job();
        Job job2 = new Job();

        assertFalse(job1.equals(job2));
    }
}
