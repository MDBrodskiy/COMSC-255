/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Scanner;

/**
 * This program demonstrates the abilities of the CircleClass class
 * */

public class CircleDemo

{

    public static void main(String[] args)
    
    {

        //Create scanner for input
        Scanner keyboard = new Scanner(System.in);

        //Receive the radius from the user
        System.out.print("Enter the radius of a circle: ");
        double radius = keyboard.nextDouble();

        //Create an object with the given radius
        CircleClass circ = new CircleClass(radius);

        //Print out circle information
        System.out.printf("The circle's area is %.2f\n", circ.getArea());
        System.out.printf("The circle's diameter is %.2f\n", circ.getDiameter());
        System.out.printf("The circle's circumference is %.2f\n", circ.getCircumference());

    }

}
