package com.testCases;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class TestCasesForUserRegistration {

    private static final Predicate<String> isValidFirstName = firstName ->
            Pattern.matches("^[A-Z]{1}[a-z]{0,20}", firstName);

    private static final Predicate<String> isValidLastName = lastName ->
            Pattern.matches("^[A-Z]{1}[a-z]{0,20}", lastName);

    private static final Predicate<String> isValidEmail = email ->
            Pattern.matches("^[a-z]{0,40}[0-9]{2}[@]{1}[a-z]{0,15}[.]{1}[a-z]{3}", email);

    private static final Predicate<String> isValidMobileNumber = mobileNumber ->
            Pattern.matches("^[0-9]{2}\\s[0-9]{10}", mobileNumber);

    private static final Predicate<String> isValidPassword = password ->
            Pattern.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?!.*\\s).{8,}$", password);

    // Happy test cases
    @Test
    public void testValidFirstName() {
        Assert.assertTrue(isValidFirstName.test("Akshata"));
    }

    @Test
    public void testValidLastName() {
        Assert.assertTrue(isValidLastName.test("Dhanawade"));
    }

    @Test
    public void testValidEmailId() {
        Assert.assertTrue(isValidEmail.test("dhanawadeakshata53@gmail.com"));
    }

    @Test
    public void testValidMobileNumber() {
        Assert.assertTrue(isValidMobileNumber.test("91 1234567890"));
    }

    @Test
    public void testValidPassword() {
        Assert.assertTrue(isValidPassword.test("Pass@123"));
    }

    // Sad test cases
    @Test
    public void testInvalidFirstName() {
        Assert.assertTrue(isValidFirstName.test("akshata"));
    }

    @Test
    public void testInvalidLastName() {
        Assert.assertTrue(isValidLastName.test("dhanawade"));
    }

    @Test
    public void testInvalidEmailId() {
        Assert.assertTrue(isValidEmail.test("akshata@gmail.com"));
    }

    @Test
    public void testInvalidMobileNumber() {
        Assert.assertTrue(isValidMobileNumber.test("8010399471"));
    }

    @Test
    public void testInvalidPassword() {
        Assert.assertTrue(isValidPassword.test("hello"));
    }
}