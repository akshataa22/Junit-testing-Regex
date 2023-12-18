package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean firstName(String name){
        boolean isValidFirstName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",name);
        if(isValidFirstName == false) {
            System.out.println("Please enter valid name first name (starting with Capital letter and has minimum 3 letters).");
        }
        return true;
    }
}
