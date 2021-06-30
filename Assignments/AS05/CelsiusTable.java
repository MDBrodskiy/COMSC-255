/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Scanner;

/**
 * This program accepts a Fahrenheit temperature as an argument and outputs a table of Celsius values
 * */

public class CelsiusTable

{

    public static void main(String[] args)
    
    {

        //Create scanner for input
        Scanner keyboard = new Scanner(System.in);

        double initialFahrenheit, finalFahrenheit, increment;

        //Ask for necessary values
        System.out.print("Enter the initial fahrenheit value: ");
        initialFahrenheit = keyboard.nextDouble();
        System.out.print("Enter the final fahrenheit value: ");
        finalFahrenheit = keyboard.nextDouble();
        System.out.print("Enter the increment value: ");
        increment = keyboard.nextDouble();

        //Begin the table
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("=======================");

        //Print out a table from the above given values
        for (double i = initialFahrenheit; i <= finalFahrenheit; i += increment) {

            System.out.printf("%.0f\t\t%.2f\n", i, celsiusConverter(i));

        }

    }

    /**
     * The celsiusConverter method takes in a fahrenheit value and converts it to celsius
     * @param fahrenheit The given fahrenheit value
     * @return A corresponding celsius value
     */

    public static double celsiusConverter(double fahrenheit) {

        //Return the converted celsius value
        return ((5*(fahrenheit - 32))/9);

    }

}
