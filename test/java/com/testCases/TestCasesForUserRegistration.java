package com.testCases;

import org.example.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestCasesForUserRegistration {
    UserRegistration user = new UserRegistration();

    // Happy Test Cases
    @Test
    public void firstNameCheck() {
        boolean result = user.firstName("Akshata");
        Assert.assertEquals(true, result);
    }

    @Test
    public void lastNameCheck() {
        boolean result = user.lastName("Dhanawade");
        Assert.assertEquals(true, result);
    }

    @Test
    public void emailIdCheck() {
        boolean result = user.emailID("dhanawadeakshata53@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void mobileNoCheck() {
        boolean result = user.mobileNumber("91 1234567890");
        Assert.assertEquals(true, result);
    }

    @Test
    public void password() {
        boolean result = user.password("Admin@123");
        Assert.assertEquals(true, result);
    }

    // Sad Test cases
    @Test(expected = InvalidFirstNameException.class)
    public void testInvalidFirstName() {
        user.firstName("akshata");
    }

    @Test(expected = InvalidLastNameException.class)
    public void testInvalidLastName() {
        user.lastName("d");
    }

    @Test(expected = InvalidEmailIdException.class)
    public void testInvalidEmailId() {
        user.emailID("dgmail.com");
    }

    @Test(expected = InvalidMobileNumberException.class)
    public void testInvalidMobileNumber() {
        user.mobileNumber("91 98765");
    }

    @Test(expected = InvalidPasswordException.class)
    public void testInvalidPassword() {
        user.password("abc@123");
    }

    // Custom Exception classes
    public static class InvalidFirstNameException extends Exception {
        public InvalidFirstNameException(String message) {
            super(message);
        }
    }

    public static class InvalidLastNameException extends Exception {
        public InvalidLastNameException(String message) {
            super(message);
        }
    }

    public static class InvalidEmailIdException extends Exception {
        public InvalidEmailIdException(String message) {
            super(message);
        }
    }

    public static class InvalidMobileNumberException extends Exception {
        public InvalidMobileNumberException(String message) {
            super(message);
        }
    }

    public static class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }
}