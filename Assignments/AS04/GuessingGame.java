/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Scanner;

/**
 * This program generates a random integer from 0-127 and has the user guess it
 * */

public class GuessingGame

{

    public static void main(String[] args)
    
    {

        //Create scanner for input
        Scanner keyboard = new Scanner(System.in);

        //Create the number to guess
        int number = (int)(128 * Math.random());

        //Create variable for times guessed
        int guesses = 1;

        //Ask user to guess
        System.out.println("I'm thinking of a number.");
        System.out.print("Guess what it is: ");
        int guess = keyboard.nextInt();

        while (guess != number) {

            if (guess > number) {

                System.out.println("Sorry, that's too high.");

            }

            else {

                System.out.println("Sorry, that's too low.");

            }

            System.out.print("Guess again: ");
            guess = keyboard.nextInt();
            guesses++;

        }

        System.out.println("Congratulations! You guessed it!");
        System.out.println("I was thinking of the number " + number + ".");
        System.out.println("You got it right in " + guesses + " guesses.");

    }

}
