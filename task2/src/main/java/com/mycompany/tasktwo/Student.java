/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasktwo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Student {
    public static int numberOfSubjects=4;
    public static ArrayList<String> subjects;
    private ArrayList<Double> marks;
    private Scanner scanner;
    
    public Student(){
      subjects=new ArrayList();
      marks=new ArrayList();
      scanner=new Scanner(System.in);  
    }
    
    public void enterMarks(){
       for(int i=0;i<Student.numberOfSubjects;i++){
        System.out.println("Enter the subject:");
        subjects.add(scanner.next());
        validateMarks();
       }
    } 
    
    public void validateMarks(){
        boolean isValid=false;
        while(!isValid){
         try{
            System.out.println("Enter the mark out of 100:");
            double mark=scanner.nextDouble();
            if(mark>=0 && mark<=100){
               isValid=true;
               marks.add(mark);
            }
            else{//grade is out of range [0,100]
                System.out.println("Please enter the grade between 0 and 100!");
            }
         }catch(InputMismatchException e){//user enters a number with letters
            System.out.println("please enter a valid number,"); 
            scanner.next();
           }
         }
    }
    
    public ArrayList<Double> getMarks(){
        return marks;
    }  
}
