package com.bdlz.lamdauserregi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LambdaUserRegistrationTest {
    LambdaUserRegistration lambdaUserRegistration = new LambdaUserRegistration();
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    @Test
    public void firstName() throws InputInvalidException {
        String firstName = "Ramakrishna";
        Assert.assertTrue(lambdaUserRegistration.testFirstName(firstName));
    }

    @Test
    public void lastName() throws InputInvalidException {
        String lastName = "Velisetti";
        Assert.assertTrue(lambdaUserRegistration.testLastName(lastName));
    }

    @Test
    public void emailId() throws InputInvalidException {
        String emailId = "ramakrishna96.velisetti@gmail.com";
        Assert.assertTrue(lambdaUserRegistration.testEmailId(emailId));
    }

    @Test
    public void mobileNumber() throws InputInvalidException {
        String mobileNumber = "91 9989774456";
        Assert.assertTrue(lambdaUserRegistration.testMobileNumber(mobileNumber));
    }

    @Test
    public void password() throws InputInvalidException{
        String password = "qw98hRL@&dl";
        Assert.assertTrue(lambdaUserRegistration.testPassword(password));
    }
    @Test
    public void givenMessage_WhenHappy_ReturnEntrySuccessful() {
        String actualResult = moodAnalyser.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", actualResult);
    }

    @Test
    public void givenEmail2_WhenNotProper_ReturnEntryFailed() {
        String actualResult = moodAnalyser.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", actualResult);
    }

}