/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tasktwo;

/**
 *
 * @author user
 */
public class TaskTwo {

    public static void main(String[] args) {
        GradeCalculatorAnalysis g=new GradeCalculatorAnalysis();
        Student s=new Student();
        GradeCalculator c=new GradeCalculator(s,g);
        c.runCalculator();
    }
}
