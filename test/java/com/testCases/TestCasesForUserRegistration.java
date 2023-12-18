package com.testCases;

import org.example.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestCasesForUserRegistration {
    UserRegistration user = new UserRegistration();

    //Happy Test Cases
    @Test
    public void firstNameCheck() {
        boolean result = user.firstName("Akshata");
        Assert.assertEquals(true,result);
    }

    @Test
    public void lastNameCheck() {
        boolean result = user.lastName("Dhanawade");
        Assert.assertEquals(true,result);
    }

    @Test
    public void EmailIdCheck()
    {
        boolean result = user.emailID("dhanawadeakshata53@gmail.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void MobileNoCheck()
    {
        boolean result = user.mobileNumber("91 1234567890");
        Assert.assertEquals(true,result);
    }

    @Test
    public void password()
    {
        boolean result = user.password("Admin@123");
        Assert.assertEquals(true,result);
    }

    //Sad Test cases
    @Test
    public void testInvalidFirstName()
    {
        boolean result = user.firstName("akshata");
        Assert.assertEquals(true,result);
    }
    @Test
    public void testInvalidLastName()
    {
        boolean result = user.lastName("d");
        Assert.assertEquals(true,result);
    }
    @Test
    public void testInvalidEmailId()
    {
        boolean result = user.emailID("dgmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void testInvalidMobileNumber()
    {
        boolean result = user.mobileNumber("91 98765");
        Assert.assertEquals(true,result);
    }

    @Test
    public void testInvalidPassword()
    {
        boolean result = user.password("abc@123");
        Assert.assertEquals(true,result);
    }
}