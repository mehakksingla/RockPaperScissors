/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.milestone1.assignmentmilestone1;

import java.util.Scanner;

/**
 * @author Mehak Singla
 * email: mehakksingla@gmail.com
 * date: August 15, 2021
 * purpose: Milestone1 Assignment
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        //declare the variable for user age
        int age;  
        //declare and initialize the scanner(Data type) and variable is "in"
        Scanner in = new Scanner(System.in);   // (new Scanner(System.in)) this is how we initialize the non-primitve data types in Java
        System.out.println("What is your age?");  //to prompt the user for the input
        age = in.nextInt();  // (in.nextInt()) waits for the user to type something into the Console and hit the Enter key. 
        //When the Enter key is hit, nextLine() reads everything that the user typed on that line 
        //and stores it in the variable on the left-hand side of the = operator.
        
        //calculate the healthy heart range 
        int maxRate = 220-age;
        float startingHRZone = maxRate*0.50f;
        float endingHRZone = maxRate*.85f;
        
        //Dispaying the result for Healthy heart range
        System.out.println("Your maximum heart rate should be " + maxRate+ " beats per minute");
        System.out.println("Your target HR Zone is "+ startingHRZone +" - " + endingHRZone + " beats per minute");
    }

}
