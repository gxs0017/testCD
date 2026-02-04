/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.sampleproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jimmy
 */
public class BankAccountTest {
    
    public BankAccountTest() {
    }
    
    
    /**
     * Test of getAccountSummary method, of class BankAccount.
     */
    @Test
    public void testGetAccountSummary() {
        System.out.println("getAccountSummary");
        BankAccount instance = new BankAccount();
        assertEquals(" Your Account Summary is -110", instance.getAccountSummary());
        
    }

    /**
     * Test of getBalance method, of class BankAccount.
    
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        BankAccount instance = new BankAccount();
        assertEquals("Your Balance is $200", instance.getBalance());
        
    }
   */  
}
