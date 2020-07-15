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
    Job supportEngineerThree;
    Job softwareDeveloper;
    Job roadRunner;


    @Before
    public void createJobObject() {
        supportEngineer = new Job("Support Engineer", new Employer("Avusoft"), new Location("Rampa"), new PositionType("Support"), new CoreCompetency("Patience"));
        supportEngineerTwo = new Job("Support Engineer", new Employer("Avusoft"), new Location("Rampa"), new PositionType("Support"), new CoreCompetency("Patience"));
        supportEngineerThree = new Job("Support Engineer", new Employer("Avusoft"), new Location("Rampa"), new PositionType("Support"), new CoreCompetency(null));
        softwareDeveloper = new Job();
        roadRunner = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingJobId(){
        assertFalse(supportEngineer.getId() == softwareDeveloper.getId());
        //assertTrue(softwareDeveloper.getId()==(supportEngineer.getId()+1));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(roadRunner.getName() == "Product tester" && (roadRunner.getName() instanceof String));
        assertTrue(roadRunner.getEmployer().getValue() == "ACME" && (roadRunner.getEmployer() instanceof Employer));
        assertTrue(roadRunner.getLocation().getValue() == "Desert" && (roadRunner.getLocation() instanceof Location));
        assertTrue(roadRunner.getPositionType().getValue() == "Quality control" && (roadRunner.getPositionType() instanceof PositionType));
        assertTrue(roadRunner.getCoreCompetency().getValue() == "Persistence" && (roadRunner.getCoreCompetency() instanceof CoreCompetency));
    }

    @Test
    public void testJobsForEquality(){
      assertFalse(supportEngineer.equals(supportEngineerTwo));
    }

    @Test
    public void testJobsToStringFirstTest(){
        assertTrue(supportEngineer.toString().startsWith("\n") && supportEngineer.toString().endsWith("\n"));
    }

    @Test
    public void testJobsToStringSecondTest(){
        assertEquals(true, supportEngineer.toString().contains("\n ID: " + supportEngineer.getId() + "\n Name: " + supportEngineer.getName() + "\n Employer: " + supportEngineer.getEmployer().getValue() + "\n Location: " + supportEngineer.getLocation().getValue() + "\n Position Type: " + supportEngineer.getPositionType().getValue() + "\n Core Competency: " + supportEngineer.getCoreCompetency().getValue() + "\n"));
    }

    @Test
    public void testJobsToStringThirdTest(){
         assertEquals("\n ID: " + supportEngineerThree.getId()+ "\n Name: " + supportEngineerThree.getName() + "\n Employer: "+ supportEngineerThree.getEmployer().getValue() +
                 "\n Location: " + supportEngineerThree.getLocation().getValue()
                 +"\n Position Type: " + supportEngineerThree.getPositionType().getValue()
                 +"\n Core Competency: " + "Data not available" + "\n",
                 supportEngineerThree.toString());
    }

    


}
