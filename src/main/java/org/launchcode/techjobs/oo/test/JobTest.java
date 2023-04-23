package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1,job2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(productTester instanceof Job);
        assertEquals(productTester.getName(),"Product tester");

        assertTrue(productTester.getEmployer() instanceof Employer);
        assertEquals(productTester.getEmployer().getValue(), "ACME");

        assertTrue(productTester.getLocation() instanceof Location);
        assertEquals(productTester.getLocation().getValue(), "Desert");

        assertTrue(productTester.getPositionType() instanceof PositionType);
        assertEquals(productTester.getPositionType().getValue(), "Quality control");

        assertTrue(productTester.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(productTester.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job productTester1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job productTester2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(productTester2.equals(productTester1));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String productTesterToString = productTester.toString();
        int productTesterToStringLastCharacter = productTesterToString.length()-1;
        assertEquals(productTesterToString.charAt(0),'\n');
        assertEquals(productTesterToString.charAt(productTesterToStringLastCharacter),'\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String productTesterToString = productTester.toString();
        String testStringExpectedOutput = "\n" +
                "ID: " + productTester.getId() +"\n" +
                "Name: " + productTester.getName() + "\n" +
                "Employer: " + productTester.getEmployer().getValue() + "\n" +
                "Location: " + productTester.getLocation().getValue() + "\n" +
                "Position Type: " + productTester.getPositionType().getValue() + "\n" +
                "Core Competency: " + productTester.getCoreCompetency().getValue() + "\n";
        assertEquals(testStringExpectedOutput, productTesterToString);
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency(""));
        String productTesterToString = productTester.toString();
        String testStringExpectedOutput = "\n" +
                "ID: " + productTester.getId() +"\n" +
                "Name: " + productTester.getName() + "\n" +
                "Employer: " + productTester.getEmployer().getValue() + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: " + productTester.getPositionType().getValue() + "\n" +
                "Core Competency: Data not available" + "\n";
        assertEquals(testStringExpectedOutput, productTesterToString);
    }

}
