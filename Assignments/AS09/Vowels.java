/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Scanner;

/**
 * This program utilizes the organizer class to count the amount of vowels, consonants, or both
 * */

public class Vowels

{

    public static void main(String[] args)
    
    {

        String choice = "a";

        //Create Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Ask the user for the initial phrase
        System.out.print("Enter a String: ");
        String phrase = keyboard.nextLine();

        //Create an Organizer object to find vowel counts
        Organizer charTypes = new Organizer(phrase);

        while (!choice.toLowerCase().equals("e")) {

            System.out.println("a) Count the number of vowels in the string");
            System.out.println("b) Count the number of consonants in the string");
            System.out.println("c) Count both the vowels and consonants in the string");
            System.out.println("d) Enter another string");
            System.out.println("e) Exit the program");
            choice = keyboard.nextLine();

            if (choice.toLowerCase().equals("a")) {

                System.out.println("\nNumber of vowels: " + charTypes.vowelCount());

            }

            else if (choice.toLowerCase().equals("b")) {

                System.out.println("\nNumber of consonants: " + charTypes.consCount());

            }

            else if (choice.toLowerCase().equals("c")) {

                System.out.println("\nNumber of vowels: " + charTypes.vowelCount());
                System.out.println("\nNumber of consonants: " + charTypes.consCount());

            }

            else if (choice.toLowerCase().equals("d")) {

                System.out.print("Enter a String: ");
                phrase = keyboard.nextLine();
                charTypes.setPhrase(phrase);

            }

            else if (choice.toLowerCase().equals("e")) {

                System.out.println("Goodbye!");
                System.exit(0);

            }

            else {

                System.out.println("Invalid choice! Try again.");

            }

        }

    }

}
