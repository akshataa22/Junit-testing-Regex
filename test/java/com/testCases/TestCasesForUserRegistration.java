package com.testCases;

import org.example.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestCasesForUserRegistration {
    @Test
    public void firstNameCheck() {
        UserRegistration user = new UserRegistration();
        boolean result = user.firstName("Akshata");
        Assert.assertEquals(true,result);
    }
}
