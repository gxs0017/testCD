/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sampleproject;

/**
 *
 * @author Jimmy
 */

public class BankAccount {
  
    public String accountHolderName;
    public int totalBalance;

   
    

 
    public String getAccountSummary() {
        return " Your Account Summary is -110";
    }
    
    
    public String getBalance() {
        return "You are owed a balance of $110";
    }
    
    
    public String takenote(){
         return "You are owed a balance of $33330"; 
    }
    // Nested Class for additional testing purposes
    // Added after Video Making
    public class NestedAccount {
    
    public String NestedAccName;
    public String NestedAccBalance;
    
    }
}