/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasknumthree;

/**
 *
 * @author user
 */
public class UserBankAccount {
    private double balance;
    
    public UserBankAccount(double balance){
      this.balance=balance;
    }
    
    public double getBalance(){
      return this.balance;
    }
    
    public void setBalance(double balance){
      this.balance=balance;
    }
}
