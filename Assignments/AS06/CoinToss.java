/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Scanner;

/**
 * This program simulates a coin tossing game involving money
 * */

public class CoinToss

{

    public static void main(String[] args)
    
    {

        //Create scanner for input
        Scanner keyboard = new Scanner(System.in);

        //Create a variable to store the balance
        double balance = 0.0;

        //Create three coin objects
        Coin quarter = new Coin();
        Coin dime = new Coin();
        Coin nickel = new Coin();

        //Create a loop that shows game output
        while (balance != 1) {

            //Print quarter status
            System.out.print("\nQuarter: " + quarter.getSideUp() + "    ");

            //Add balance if quarter shows heads
            if (quarter.getSideUp() == "Heads") {

                balance += .25;

            }

            quarter.tossCoin();

            //Print dime status
            System.out.print("Dime: " + dime.getSideUp() + "    ");

            //Add balance if dime shows heads
            if (dime.getSideUp() == "Heads") {

                balance += .1;

            }

            dime.tossCoin();

            //Print nickel status
            System.out.print("Nickel: " + nickel.getSideUp() + "\n");

            //Add balance if nickel shows heads
            if (nickel.getSideUp() == "Heads") {

                balance += .05;

            }

            nickel.tossCoin();

            System.out.printf("Balance: $%.2f\n", balance);

            if (balance > 1) {

                System.out.println("\nBalance is greater than one, you lose!");
                System.exit(0);

            }

        }

        System.out.println("\nBalance is $1, you win!");

    }

}
