package com.testCases;

import org.example.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestCasesForUserRegistration {
    UserRegistration user = new UserRegistration();
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
}
