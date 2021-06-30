/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Scanner;
import java.io.*;

/**
 * This program uses the isPrime method to find prime numbers, and then output them to a file
 * */

public class PrimeNumbers

{

    public static void main(String[] args) throws IOException
    
    {

        //Create scanner for input
        Scanner keyboard = new Scanner(System.in);

        //Create output file instance
        PrintWriter outputFile = new PrintWriter("PrimeNumbers.txt");

        //Brief the user with clarity
        System.out.println("This program finds prime numbers in a given range");

        //Receive the initial value
        System.out.print("Enter the initial value to test: ");
        int initialValue = keyboard.nextInt();

        if (initialValue <= 0) { //Invalid number test case

            System.out.println("Invalid Value");

            System.exit(0);

        }

        //Receive the final value
        System.out.print("Enter the final value to test: ");
        int finalValue = keyboard.nextInt();

        if (finalValue > 200) { //Receive a small number to prevent memory problems

            System.out.println("Please enter a number less than or equal to 200");

            System.exit(0);

        }

        for (int i = initialValue; i <= finalValue; i++) {

            if (isPrime(i)) {

                outputFile.print(i + ", ");

            }

        }

        outputFile.close();
        System.out.println("Please check PrimeNumbers.txt for the output");

    }

    /**
     * The isPrime method determines whether a number is prime or not, and returns a boolean value
     * @param num The number that is being tested
     * @return True if num is prime, and false if not
     */

    public static boolean isPrime(int num) {

        if (num < 1) {

            return false;

        }

        else if (num == 1) {

            return true;

        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            
            if (num % i == 0) {

                return false;

            }

        }

        return true;

    }

}
