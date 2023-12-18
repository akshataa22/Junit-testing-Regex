package org.example;

import java.util.regex.Pattern;


public class UserRegistration {
    public static boolean firstName(String name){
        boolean isValidFirstName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",name);
        if(isValidFirstName == false) {
            System.out.println("Please enter valid name first name (starting with Capital letter and has minimum 3 letters).");
        }
        return true;
    }
    public static boolean lastName(String name){
    boolean isValidLastName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",name);
        if(isValidLastName == false) {
            System.out.println("Please enter valid surname (Last name should start with capital letter and has minimum 3 characters).");
        }
        return true;
    }
}
