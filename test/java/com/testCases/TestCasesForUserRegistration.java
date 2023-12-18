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
}
