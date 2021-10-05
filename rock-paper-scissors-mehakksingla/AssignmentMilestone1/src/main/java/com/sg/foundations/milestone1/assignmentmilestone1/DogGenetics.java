/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.milestone1.assignmentmilestone1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Mehak Singla
 * email: mehakksingla@gmail.com
 * date: August 15, 2021
 * purpose: MileStone1 Assignment
 */
public class DogGenetics {
    public static void main(String[] args) {
        
        //Declaring and initializing the Scanner
        Scanner in = new Scanner(System.in);
        
        //initializing the random object
        Random rGen = new Random();
        String dogName;
        
        //to calculate random percentage of 5 dog breeds, declaring 5 percentage varibales 
        //and using do while loop to claculate it
        int percent1 = 0, percent2 = 0, percent3 = 0,percent4 = 0,percent5 = 0;
        //do{
            //generating random %ages & to get the range from 1 to 100 we added 1
            percent1 = rGen.nextInt(100); 
            percent2 = rGen.nextInt(100-percent1);
            percent3 = rGen.nextInt(100-percent1-percent2);
            percent4 = rGen.nextInt(100-percent1-percent2-percent3);
            percent5 = (100-percent1-percent2-percent3-percent4);
        //}while(percent1==0 && percent2==0 && percent3==0 && percent4 ==0 && percent5 ==0);
        //it should check the total is 100%
        
        //to prompt the user to enter the input
        System.out.println("What is your dog's name?"); 
        
        dogName = in.nextLine();  //(in.nextInt()) waits for the user to type something into the Console and hit the Enter key. 
        //When the Enter key is hit, nextLine() reads everything that the user typed on that line 
        //and stores it in the variable on the left-hand side of the = operator.

        System.out.println("\nWell then, I have this highly reliable report on "+ dogName+ "'s prestigious background right here.");
        System.out.println("");
        
        System.out.println(dogName + " is: ");
        System.out.println(""); //to create a space between lines
        
        System.out.println(percent1 + "%" +" Yellow Lab");
        System.out.println(percent2 + "%" + " Yorkie");
        System.out.println(percent3 + "%" + " Bull Dog");
        System.out.println(percent4 + "%" + " Golden Retriever");
        System.out.println(percent5 + "%" + " German Shepherd");
        
        System.out.println("\nWow, that's QUITE the dog!");
               
    }

}
