package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Location;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;



public class JobTest {
    Job supportEngineer;
    Job supportEngineerTwo;
    Job softwareDeveloper;
    Job roadRunner;


    @Before
    public void createJobObject() {
        supportEngineer = new Job("Support Engineer", new Employer("Avusoft"), new Location("Rampa"), new PositionType("Support"), new CoreCompetency("Patience"));
        supportEngineerTwo = new Job("Support Engineer", new Employer("Avusoft"), new Location("Rampa"), new PositionType("Support"), new CoreCompetency("Patience"));
        softwareDeveloper = new Job();
        roadRunner = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingJobId(){
        assertFalse(supportEngineer.getId() == softwareDeveloper.getId());
        assertTrue(softwareDeveloper.getId()==(supportEngineer.getId()+1));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(roadRunner.getName() == "Product tester" && (roadRunner.getName() instanceof String));
        assertTrue(roadRunner.getEmployer().getValue() == "ACME" && (roadRunner.getEmployer() instanceof Employer)== true);
        assertTrue(roadRunner.getLocation().getValue() == "Desert" && (roadRunner.getLocation() instanceof Location));
        assertTrue(roadRunner.getPositionType().getValue() == "Quality control" && (roadRunner.getPositionType() instanceof PositionType));
        assertTrue(roadRunner.getCoreCompetency().getValue() == "Persistence" && (roadRunner.getCoreCompetency() instanceof CoreCompetency));
    }

    @Test
    public void testJobsForEquality(){
      assertTrue(!supportEngineer.equals(supportEngineerTwo));
    }


}
