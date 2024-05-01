/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskone;

/**
 *
 * @author user
 */
public class GuessAnalysis {
    public void WelcomeUser(){
        System.out.println("Welcome to the guessing game!");
    }
    
    public void writeAttemptNumberMessage(int attempt,int maxAttempts){
       System.out.println("This attempt is your "+attempt+" /"+maxAttempts);
    }
    
    public void makeGuessMessage(int min,int max){
        System.out.println("Enter a number between "+min+" and "+max+": ");
    }
    
    public void userGuessOutOfRange(int min,int max){
        System.out.println("Please enter a number between "+min+" and "+max);
    }
    
    public void correctGuess(){
        System.out.println("Your guess is correct!");
    }
    
    public void wrongGuess(String result){
        System.out.println("Your guess is "+result+" try again");
    }
    
    public void reachedMaxAttempts(){
        System.out.println("Sorry,you have reached the maximum number of tries!!");
    }
    
    public void invalidUserGuess(){
        System.out.println("Please enter a valid number:");
    }
    
    public void askPlayingAgain(){
        System.out.println("Do you want to play again?(yes/no)");
    }
    
    public void end(int numberOfRoundsWon){
        System.out.println("Total number of rounds won: "+numberOfRoundsWon);
    }
}
