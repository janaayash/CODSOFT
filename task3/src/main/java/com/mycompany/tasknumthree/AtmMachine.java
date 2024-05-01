/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasknumthree;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AtmMachine {
    private UserBankAccount userAccount;
    
    private Scanner scanner;
    private AtmMachineAnalysis analysis;
    
    public AtmMachine(UserBankAccount userAccount,AtmMachineAnalysis analysis){
      this.userAccount=userAccount;
      this.analysis=analysis;
      scanner=new Scanner(System.in);
    }
    
    public void runAtm(){
      while(true){
         this.analysis.displayOptions();
         int choice=scanner.nextInt();
         while(this.analysis.checkChoice(choice)==0){
             choice=scanner.nextInt();
         }
         if(choice==1){
           withDraw();
         }
         else if(choice==2){
           deposit();
         }
         else if(choice==3){
           checkBalance();
         }
         else if(choice==4){
           this.analysis.stopAtm();
           scanner.close();
           return ;
         }
      }
    }
    
    public void withDraw(){
       try{
          this.analysis.displayEnterAmountToWithDrawMessage();
          double amount=scanner.nextDouble();
          if(amount < 0){
            this.analysis.displayNegativeAmountErrorMessage();
          }
          else if(amount>this.userAccount.getBalance()){
            this.analysis.displayInsufficientBalanceErrorMessage();
          }
          else{
            this.userAccount.setBalance(this.userAccount.getBalance()-amount);
            this.analysis.displaySuccessfullWithdrawMessage();
         }
       }catch(InputMismatchException e){
         this.analysis.displayEnterValidAmountErrorMessage();
         scanner.next();
       }
    }
    
    public void deposit(){
     try{
         this.analysis.displayEnterAmountToDepositMessage();
         double amount=scanner.nextInt();
         if(amount < 0){
          this.analysis.displayNegativeAmountErrorMessage();
         }
         else{
          this.userAccount.setBalance(this.userAccount.getBalance()+amount);
          this.analysis.displaySuccessfullDepositMessage();
         }
      }catch(InputMismatchException e){
          this.analysis.displayEnterValidAmountErrorMessage();
          scanner.next();
       }
    }
    
    public void checkBalance(){
      this.analysis.checkBalance(this.userAccount.getBalance());
    }

}
