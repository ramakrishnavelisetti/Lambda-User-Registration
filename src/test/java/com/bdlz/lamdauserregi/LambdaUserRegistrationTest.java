package com.bdlz.lamdauserregi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LambdaUserRegistrationTest {
    LambdaUserRegistration lambdaUserRegistration = new LambdaUserRegistration();
    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = lambdaUserRegistration.firstName("Ramakrishna");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsNotProper_ReturnFalse() {
        boolean actualResult = lambdaUserRegistration.firstName("RamaKrishna");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = lambdaUserRegistration.lastName("Velisetti");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsNotProper_ReturnFalse() {
        boolean actualResult = lambdaUserRegistration.lastName("veliseTTi");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmailId_IsProper_ReturnTrue() {
        boolean actualResult = lambdaUserRegistration.emailId("ramakrishna96.velisetti@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = lambdaUserRegistration.emailId("ramakrishna96.velisettigmail.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenMobileNumber_IsProper_ReturnTrue() {
        boolean actualResult = lambdaUserRegistration.mobileNumber("91 9989774456");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumber_IsNotProper_ReturnFalse() {
        boolean actualResult = lambdaUserRegistration.mobileNumber("919989774456");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenPasswordRule1_IsProper_ReturnTrue() {
        boolean actualResult = lambdaUserRegistration.passwordRule1("qwgthjkdl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsNotProper_ReturnFalse() {
        boolean actualResult = lambdaUserRegistration.passwordRule1("jnsdsjRcvc");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenPasswordRule2_IsProper_ReturnTrue() {
        boolean actualResult = lambdaUserRegistration.passwordRule2("qwgthRLjkdl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule2_IsNotProper_ReturnFalse() {
        boolean actualResult = lambdaUserRegistration.passwordRule2("jnsdjcvcp");
        Assert.assertEquals(false, actualResult);
    }

}