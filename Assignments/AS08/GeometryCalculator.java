/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Scanner;

/**
 * This program demonstrates the Month class
 * */

public class GeometryCalculator

{

    public static void main(String[] args)
    
    {

        //Create Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Initialize a loop control variable
        byte number = 0;

        while (number != 4) {//Exit if 4 is selected

            System.out.println("\nGeometry Calculator\n");
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Quit\n");
            System.out.print("Enter your choice (1-4): ");
            number = keyboard.nextByte();

            if (number == 1) {//If one is entered, go to circle

                System.out.print("What is the circle's radius? ");
                double radius = keyboard.nextDouble();
                System.out.printf("The circle's area is %.2f", Geometry.circle(radius));

            }

            else if (number == 2) {//If two is entered, go to rectangle

                System.out.print("What is the rectangle's length? ");
                double length = keyboard.nextDouble();
                System.out.print("What is the rectangle's width? ");
                double width = keyboard.nextDouble();
                System.out.printf("The rectangle's area is %.2f", Geometry.rectangle(length, width));

            }

            else if (number == 3) {//If three is entered, go to triangle

                System.out.print("What is the length of the triangle's base? ");
                double base = keyboard.nextDouble();
                System.out.print("What is the triangle's height? ");
                double height = keyboard.nextDouble();
                System.out.printf("The triangle's area is %.2f", Geometry.triangle(base, height));

            }

            else if (number == 4) {

                continue;

            }

            else {

                System.out.println("Invalid number, try again!");

            }

        }

        System.out.println("Goodbye!");

    }

}
