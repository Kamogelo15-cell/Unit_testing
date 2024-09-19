/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.unit_testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {

    
   

    /**
     * Test of Checkusename method, of class Login.
     */
    @Test
    public void testCheckusename() {
        System.out.println("Checkusename");
        String username = "kamo";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.Checkusename(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of checkPassword method, of class Login.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "dfgfd";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
