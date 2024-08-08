/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.warrunnergame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jaini
 */
public class WarRunnerGameTest {
    
    public WarRunnerGameTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class WarRunnerGame.
     
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        WarRunnerGame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of checkLength method, of class WarRunnerGame.
     */
    @org.junit.jupiter.api.Test
    public void testCheckLengthGood() {
        System.out.println("checkLength");
        String password = "cardgame";
        boolean expResult = true;
        boolean result = WarRunnerGame.checkLength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testCheckLengthBad() {
        System.out.println("checkLength");
        String password = "card";
        boolean expResult = false;
        boolean result = WarRunnerGame.checkLength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testCheckLengthBoundary() {
        System.out.println("checkLength");
        String password = "";
        boolean expResult = false;
        boolean result = WarRunnerGame.checkLength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkUpper method, of class WarRunnerGame.
     */
    @org.junit.jupiter.api.Test
    public void testCheckUpperGood() {
        System.out.println("checkUpper");
        String password = "Cardgame";
        boolean expResult = true;
        boolean result = WarRunnerGame.checkUpper(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testCheckUpperBad() {
        System.out.println("checkUpper");
        String password = "cardgame";
        boolean expResult = false;
        boolean result = WarRunnerGame.checkUpper(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testCheckUpperBoundry() {
        System.out.println("checkUpper");
        String password = "";
        boolean expResult = false;
        boolean result = WarRunnerGame.checkUpper(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkSpecial method, of class WarRunnerGame.
     */
    @org.junit.jupiter.api.Test
    public void testCheckSpecialGood() {
        System.out.println("checkSpecial");
        String password = "Card@Game";
        boolean expResult = true;
        boolean result = WarRunnerGame.checkSpecial(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testCheckSpecialBad() {
        System.out.println("checkSpecial");
        String password = "cardgame";
        boolean expResult = false;
        boolean result = WarRunnerGame.checkSpecial(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testCheckSpecialBoundry() {
        System.out.println("checkSpecial");
        String password = "";
        boolean expResult = false;
        boolean result = WarRunnerGame.checkSpecial(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
