/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Scanner;

/**
 * This program takes in a String input and converts it to Pig Latin
 * */

public class PigLatin

{

    public static void main(String[] args)
    
    {

        //Create Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Ask for String input
        System.out.print("Enter a String and I will convert it to Pig Latin: ");
        String phrase = keyboard.nextLine();

        //Modify phrase to make it readable
        phrase = phrase.trim();
        String[] tokens = phrase.split(" ");

        //Create a loop control variable
        byte i = 0;

        while (i < tokens.length) {

            if (tokens[i].length() < 2) { //Confirm the String is longer than a character

                System.out.print(tokens[i].toUpperCase() + "ay ");

            }

            else {

                tokens[i] = tokens[i].substring(1,2).toUpperCase() + tokens[i].substring(2).toLowerCase() + tokens[i].substring(0,1).toLowerCase() + "ay ";
                System.out.print(tokens[i]);

            }

            i++;

        }

    }

}
