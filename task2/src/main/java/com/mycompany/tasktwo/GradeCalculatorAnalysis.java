/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasktwo;

/**
 *
 * @author user
 */
public class GradeCalculatorAnalysis {
   public void WelcomeStudent(){
       System.out.println("Welcome dear student,This is a grade calculator system:");
       System.out.println("-------------------------------------------------------");
   }
   
   public void displayResults(double totalMarks,double averagePercentage,char gradeCalculation){
       System.out.println("The total of your marks is : "+totalMarks);
       System.out.println("The average percentage is : "+averagePercentage);
       System.out.println("The corresponding grade is : "+gradeCalculation);
   }
}
