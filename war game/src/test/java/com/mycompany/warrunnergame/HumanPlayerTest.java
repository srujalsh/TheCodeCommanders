/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.warrunnergame;

import java.util.Collection;
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
public class HumanPlayerTest {
    
    public HumanPlayerTest() {
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
     * Test of getName method, of class HumanPlayer.
    @Test
    public void testGetName() {
        System.out.println("getName");
        HumanPlayer instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of hasCards method, of class HumanPlayer.
     */
    @org.junit.jupiter.api.Test
    public void testHasCardsGood() {
        System.out.println("hasCards");
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testHasCardsBad() {
        System.out.println("hasCards");
        HumanPlayer instance = new HumanPlayer(null);
        boolean expResult = false;
        boolean result = instance.hasCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testHasCardsBoundry() {
        System.out.println("hasCards");
        HumanPlayer instance = new HumanPlayer("");
        boolean expResult = false;
        boolean result = instance.hasCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of addCard method, of class HumanPlayer.
     
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = null;
        HumanPlayer instance = null;
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flipCard method, of class HumanPlayer.
     
    @Test
    public void testFlipCard() {
        System.out.println("flipCard");
        HumanPlayer instance = null;
        Card expResult = null;
        Card result = instance.flipCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardWithRank method, of class HumanPlayer.
    
    @Test
    public void testGetCardWithRank() {
        System.out.println("getCardWithRank");
        Rank rank = null;
        HumanPlayer instance = null;
        Card expResult = null;
        Card result = instance.getCardWithRank(rank);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHandSize method, of class HumanPlayer.
    
    @Test
    public void testGetHandSize() {
        System.out.println("getHandSize");
        HumanPlayer instance = null;
        int expResult = 0;
        int result = instance.getHandSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardAtIndex method, of class HumanPlayer.
    
    @Test
    public void testGetCardAtIndex() {
        System.out.println("getCardAtIndex");
        int index = 0;
        HumanPlayer instance = null;
        Card expResult = null;
        Card result = instance.getCardAtIndex(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCards method, of class HumanPlayer.
    
    @Test
    public void testAddCards() {
        System.out.println("addCards");
        Collection<Card> cards = null;
        HumanPlayer instance = null;
        instance.addCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
}
