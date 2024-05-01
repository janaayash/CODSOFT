/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasknumthree;

/**
 *
 * @author user
 */
public class AtmMachineAnalysis {
    public void displayOptions(){
        System.out.println("Enter 1:withdraw, 2:deposit, 3:check balance. 4:exit");
    }
    
    public int checkChoice(int choice){
       if(choice!=1 && choice !=2 && choice !=3 && choice !=4){
           System.out.println("Please enter a number from 1 to 4");
           return 0;
       }
       return 1;
    }
    
    public void displayEnterAmountToWithDrawMessage(){
        System.out.println("Enter an amount to withdraw:");
    }
    
    public void displayNegativeAmountErrorMessage(){
        System.out.println("Please enter a positive amount");
    }
    
    public void displayInsufficientBalanceErrorMessage(){
        System.out.println("You can't withdraw such an amount.Check your balance"); 
    }
    
    
    
    public void displayEnterValidAmountErrorMessage(){
        System.out.println("Invalid number");
    }
    
    public void displaySuccessfullWithdrawMessage(){
        System.out.println("Your amount is withdrawed successfully");
    }
    
    public void displayEnterAmountToDepositMessage(){
        System.out.println("Enter an amount to deposit:");
    }
    
    public void displaySuccessfullDepositMessage(){
        System.out.println("Your amount is deposited successfully");
    }
    
    public void checkBalance(double amount){
        System.out.println("Your current balance is "+amount);
    }
    
    public void stopAtm(){
        System.out.println("Thanks for using the machine");
    }
}
