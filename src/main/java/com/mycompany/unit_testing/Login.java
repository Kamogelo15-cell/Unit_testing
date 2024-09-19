/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit_testing;

import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
class Login {

    // check username
    public boolean Checkusename(String username) {
        // temp  variable for checking 
        boolean Found = false;
        // CharSequence s;

        // check the username
        if (username.contains("_") && username.length() <= 5) {

            // then assign to true
            Found = true;
            System.out.println("username is captured!");
        } else {
            // assign to false 
            Found = false;
            System.out.println("username is not captured!");
        }
        return Found;

    }

    // check  the pasword
    public boolean checkPassword(String password) {

//pattern check
        Pattern check_num = Pattern.compile("[012345678]");
        Pattern check_specials = Pattern.compile("[!@#$%^&*]");
        Pattern check_uppercase = Pattern.compile("[ABCEFGHIJKLMNOPQRSTUVWXYZ]");

        // temp variable 
        boolean Found = false;
        //check all here 
        if (password.length() >= 8 && check_num.matcher(password).find() && check_specials.matcher(password).find() && check_uppercase.matcher(password).find()) {

            // assign true
            Found = true;
            //message
            System.out.println("Password is captured");
        } else {

            //assign to false
            Found = false;
            System.out.println("Password is not captured");
        }
        return Found;
    }
}
