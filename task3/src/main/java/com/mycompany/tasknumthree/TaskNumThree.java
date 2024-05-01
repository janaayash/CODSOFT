/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tasknumthree;

/**
 *
 * @author user
 */
public class TaskNumThree {

    public static void main(String[] args) {
        UserBankAccount userAccount=new UserBankAccount(20000);
        AtmMachineAnalysis analysis=new AtmMachineAnalysis();
        AtmMachine atm= new AtmMachine(userAccount,analysis);
        atm.runAtm();
    }
}
