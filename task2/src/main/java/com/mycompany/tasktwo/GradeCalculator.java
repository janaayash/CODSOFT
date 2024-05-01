/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasktwo;

/**
 *
 * @author user
 */
public class GradeCalculator {
    private Student student;
    private GradeCalculatorAnalysis gradeCalculatorAnalysis;
    
    public GradeCalculator(Student student,GradeCalculatorAnalysis gradeCalculatorAnalysis){
      this.student=student;
      this.gradeCalculatorAnalysis=gradeCalculatorAnalysis;
    }
    
    public void runCalculator(){
      gradeCalculatorAnalysis.WelcomeStudent();
      student.enterMarks();
      displaySummary();
    }
    
    
    private void displaySummary(){
       gradeCalculatorAnalysis.displayResults(this.totalMarks(),this.calculateAveragePercentage(),this.gradeCalculation());
    }
    
    private char gradeCalculation(){
      double averagePercentage=this.calculateAveragePercentage();
      if(averagePercentage>=90){
        return 'A';
       }
      else if(averagePercentage>=80 && averagePercentage<90){
        return 'B';
       }
      else if(averagePercentage>=70 && averagePercentage<80){
        return 'C';
       }
      else if(averagePercentage>=60 && averagePercentage<70){
        return 'D';
      }
      else if(averagePercentage>=50 && averagePercentage<60){
        return 'E';
      }
      else
          return 'F';
    }
    
    private double calculateAveragePercentage(){
      return this.totalMarks()/student.getMarks().size();
    }
    
    private double totalMarks(){
      return student.getMarks().stream().mapToDouble(Double::doubleValue).sum();
    }
   
    
}
