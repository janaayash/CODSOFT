/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskone;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class GuessNumber {
    public static final int MAX_ATTEMPTS=5;
    public static final int MIN=0;
    public static final int MAX=100; 
    
    private boolean playing;
    private int numberOfRoundsWon;
    private Random random;
    
    private Scanner scanner;
    private GuessAnalysis guessAnalysis;
    
    public GuessNumber(GuessAnalysis guessAnalysis){
      this.guessAnalysis=guessAnalysis;
      scanner=new Scanner(System.in);
    }
    
    public void startGame(){
      WelcomeUser();
      initGame();
      runGame();
      endGame();
    }
       
    private void WelcomeUser(){
      guessAnalysis.WelcomeUser();
    }
    
    private void initGame(){
      playing=true;
      numberOfRoundsWon=0;
      random=new Random();
    }
    
    private void runGame(){
      while(playing){
         int randomNumber=generateRandomNumber();
         playRound(randomNumber);
         guessAnalysis.askPlayingAgain();
         checkPlayingAgain();
      }
    }
    
    private int generateRandomNumber(){
       return this.random.nextInt(MAX+1)+1;
    }
    
    private void playRound(int randomNumber){
      for(int attempt=1;attempt<=MAX_ATTEMPTS;attempt++){
          guessAnalysis.writeAttemptNumberMessage(attempt, MAX_ATTEMPTS);
          guessAnalysis.makeGuessMessage(MIN, MAX);
          if(userGuessCheck(randomNumber)) break;
          if(attempt==MAX_ATTEMPTS){
            guessAnalysis.reachedMaxAttempts();
          }
      }
    }
    
    
    private boolean userGuessCheck(int randomNumber){
      try{
       int userGuess=scanner.nextInt();
       if(userGuess<MIN || userGuess>MAX){
         guessAnalysis.userGuessOutOfRange(MIN, MAX);
       }
       else if(userGuess==randomNumber){
         guessAnalysis.correctGuess();
         numberOfRoundsWon++;
         return true;
       }
       else if(userGuess>randomNumber){
         guessAnalysis.wrongGuess("Too High!");
       }
       else{
         guessAnalysis.wrongGuess("Too Low!");

       }
       return false;
      }
      catch(InputMismatchException e){
          guessAnalysis.invalidUserGuess();
          scanner.next();
          return false;
      }
    }
    
    private void checkPlayingAgain(){
      playing=scanner.next().equalsIgnoreCase("yes");
    }
    
    private void endGame(){
      guessAnalysis.end(numberOfRoundsWon);
      scanner.close();
    }
}
