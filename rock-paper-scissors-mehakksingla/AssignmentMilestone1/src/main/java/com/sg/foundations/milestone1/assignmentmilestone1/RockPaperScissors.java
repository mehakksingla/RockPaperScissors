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

public class RockPaperScissors {

    public static void main(String[] args) {
        //Initialize the Scanner 
        Scanner in = new Scanner(System.in); 
       
        //declare the variables 
        int wins = 0;  // to claculate wins
        int losses = 0; // to calculate losses
        int ties = 0; // to calculate draws
        int numofRounds = 0; // to see if user has played enough rounds that he asked for
        int user_Score =0 ;
        int Comp_Score = 0;
        //print a welcome message
//        System.out.println("Welcome to Rock, Paper, Scissors!");
        do{
            System.out.println("How many rounds would you like to play?"); //prompt user to enter the input
            int numRounds = in.nextInt(); 
            in.nextLine();

            if(numRounds>10 || numRounds<1){
                System.out.println("Please enter the value within range: Minimum 1 and Maximum 10.");
                    break;
                }
                    for(int i=0; i<numRounds; i++){  //I used for loop here to repeat it for given number of times.
                        //and also I want to count that how many rounds I have played.
                        //once the value of i becomes == or >= numRounds the loop terminates. 
                        System.out.println("What is your move? To make a move, enter rock, paper, or scissors. "
                                    + "To quit the game, enter quit.");
                        String myMove = in.nextLine();

                        //Check if the user wants to quit the game
                        if(myMove.equals("quit")) {
                            break;
                            }
                        //Check if the user's move is valid (rock, paper, or scissors)
                            if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
                            System.out.println("Your move isn't valid!");
                            } else {
                               
                            //Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2
                            int rand = (int)(Math.random()*3);
                            //Convert the random number to a string using conditionals and print the opponent's move
                            String opponentMove;
                            if(rand == 0) {
                              opponentMove = "rock";
                            } else if(rand == 1) {
                              opponentMove = "paper";
                            } else {
                              opponentMove = "scissors";
                            }
                            System.out.println("Opponent move: " + opponentMove);
                            System.out.println("You chose: " + myMove);

                            //Print the results of the game: tie, lose, win
                            if(myMove.equals(opponentMove)) {
                              System.out.println("It's a tie!");
                              ties++;
                              numofRounds++;
                            } else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
                              System.out.println("You won!");
                              wins++;
                              user_Score += 1;
                              numofRounds++;
                            } else {
                              System.out.println("You lost!");
                              losses++;
                              Comp_Score += 1;
                              numofRounds++;
                            }
                        }   
                        
                          //Print wins, ties and losses & number of games played and number of rounds asked to user
                            System.out.println("Wins: " +wins +" Losses: " + losses +  " Ties: " + ties + 
                                     " Rounds Played: " + numofRounds + " Rounds Asked: " + numRounds);
                            System.out.println("User Score: " + user_Score);
                            System.out.println("Computer Score: " + Comp_Score);
                            
                            System.out.println();
                            if((numofRounds==numRounds)){
                                break;
                            }
                    }
                    
                     if(user_Score > Comp_Score){
                            System.out.println("CONGRATULATIONS! USER WINS THE GAME.");
                            System.out.println();
                        } else if(user_Score < Comp_Score){
                            System.out.println("CONGRATULATIONS! COMPUTER WINS THE GAME.");
                            System.out.println();
                        } else {
                            System.out.println("NO WINS THE GAME.");
                            System.out.println();
                        }

                    RockPaperScissors game = new RockPaperScissors();
                    Character playAgain = game.playAgain();
                            if(numofRounds==numRounds){
                                numofRounds = Reset(0,numRounds);
                                if(!playAgain.equals('y')){
                                    System.out.println();
                                    break;
                                } 
                            }                       
        }while(true);
                  //Print a final message for the users
                System.out.println("Thanks for playing Rock, Paper, Scissors!");
    }
        public Character playAgain() {
        Scanner scan = new Scanner(System.in);
        Character playAgain;
        do {
            System.out.println("Play again (y/n)?");
            playAgain = scan.next().charAt(0);
        } while(!playAgain.equals('y') && !playAgain.equals('n'));
        return playAgain;
    }
        
        public static int Reset(int numofRounds, int numRounds){
            if(numofRounds==numRounds){
                numofRounds = 0;
            } return numofRounds;
        }
}
