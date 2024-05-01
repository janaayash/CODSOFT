/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskone;

/**
 *
 * @author user
 */
public class TaskOne {

    public static void main(String[] args) {
        GuessAnalysis g=new GuessAnalysis();
        GuessNumber guessNumber=new GuessNumber(g);
        guessNumber.startGame();
    }
}
