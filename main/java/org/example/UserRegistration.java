package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
    public static boolean firstName(String name){
        boolean isValidFirstName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",name);

        return isValidFirstName;
    }
    public static boolean lastName(String name){
    boolean isValidLastName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",name);

        return isValidLastName;
    }

    public static boolean emailID(String emailid) {
        boolean isValidEmailId = Pattern.matches("^[a-z]{0,40}[0-9]{2}[@]{1}[a-z]{0,15}[.]{1}[a-z]{3}", emailid);

        return isValidEmailId;
    }

    public boolean mobileNumber(String number) {
        boolean isValidMobileNumber = Pattern.matches("^[0-9]{2}\s[0-9]{10}", number);

        return isValidMobileNumber;
    }

    public boolean password(String password) {
        boolean isValidPassword = Pattern.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?!.*\\s).{8,}$", password);

        return isValidPassword;
    }
}