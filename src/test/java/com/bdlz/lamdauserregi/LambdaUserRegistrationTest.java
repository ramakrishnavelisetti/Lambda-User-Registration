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
}