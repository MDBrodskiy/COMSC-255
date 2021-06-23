/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Scanner;

/**
 * This program calculates the total fees for depositing a certain quantity of checks
 * */

public class BankCharge

{

    public static void main(String[] args)
    
    {

        final double BASE_FEE = 10;

        //Create scanner for inputs
        Scanner keyboard = new Scanner(System.in);

        //Define the variable for check deposit charge
        double rate;

        //Ask for check quantity
        System.out.print("Enter the number of checks written this month: ");
        int checks = keyboard.nextInt();

        if (checks < 0) { //Test for negative numbers

            System.out.println("This is not a valid number");

        }

        else if (checks == 0) { //Test for no checks

            System.out.println("There total fees are $" + BASE_FEE);
 
        }

        else if (checks > 0 && checks < 5) { //Case for between 1 and 4 checks

            rate = .5;
            System.out.println("The total fees are $" + (BASE_FEE + (rate * checks)));

        }

        else if (checks >= 5 && checks < 20) { //Case for between 5 and 19 checks

            rate = .1;
            System.out.println("The total fees are $" + (BASE_FEE + (rate * checks)));

        }

        else if (checks >= 20 && checks < 40) { //Case for between 20 and 39 checks

            rate = .08;
            System.out.println("The total fees are $" + (BASE_FEE + (rate * checks)));

        }

        else if (checks >= 40 && checks < 60) { //Case for between 40 and 59 checks

            rate = .06;
            System.out.println("The total fees are $" + (BASE_FEE + (rate * checks)));

        }

        else {

            rate = .04;
            System.out.println("The total fees are $" + (BASE_FEE + (rate * checks)));

        }

    }

}
