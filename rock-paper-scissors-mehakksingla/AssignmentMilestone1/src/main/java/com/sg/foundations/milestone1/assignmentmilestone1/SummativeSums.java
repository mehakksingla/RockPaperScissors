/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.milestone1.assignmentmilestone1;

import java.util.Arrays;

/**
 * @author Mehak Singla
 * email: mehakksingla@gmail.com
 * date: August 15, 2021
 * purpose: Milestone1 Assignment
 */
public class SummativeSums {
    public static void main(String[] args) {
       
        int[]arr = { 1, 90, -33, -55, 67, -16, 28, -55, 15}; 
        int[]arr2 = { 999, -60, -77, 14, 160, 301 };
        int[]arr3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
                     140, 150, 160, 170, 180, 190, 200, -99};
            
        //calling the mehods in main method and print the result
         System.out.println("Sum of First Array is: " + addArray(arr));
         System.out.println("Sum of Second Array is: " + addArray(arr2));
         System.out.println("Sum of Third Array is: " + addArray(arr3));

    }
    
        public static void Add(int[]array){ //int[]arr, int[]arr2, int[]arr3
            System.out.println("{");
            System.out.println(", ");
          for (int i=0; i<array.length-1;i++){
              System.out.println(array[i] + ",");   
          }
        }
        
         static int addArray(int[]array) {
             int sum = 0;
             for(int i=0; i<array.length;i++){
              sum += array[i];
         }
             return sum;
}
}