/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.unit_testing;

import java.util.*;

/**
 *
 * @author RC_Student_lab
 */
public class Unit_testing {

    public static void main(String[] args) {
        //Login instance
        Login check_all = new Login();

        //object for our sccanner
        Scanner user_input = new Scanner(System.in);

        //prompting the user 
        //declare variables
        String username = "";
        String password = "";

        do {
            //prompt
            System.out.println("Enter username");
            username = user_input.nextLine();
        } while (!check_all.Checkusename(username));

        //user do while for password 
        do {
            //prompt 
            System.out.println("Enter password: ");
            password = user_input.nextLine();

        } while (!check_all.checkPassword(password));

    }
}
