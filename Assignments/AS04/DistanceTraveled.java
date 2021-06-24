/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Scanner;

/**
 * This program asks for the speed and time a vehicle was in motion and outputs the distance traveled for each hour
 * */

public class DistanceTraveled

{

    public static void main(String[] args)
    
    {

        //Create scanner for input
        Scanner keyboard = new Scanner(System.in);

        //Ask for the speed and time
        System.out.print("Enter the vehicle's speed: ");
        double speed = keyboard.nextDouble();
        if (speed < 0) { //Verify speed is greater than or equal to 0

            System.out.println("Invalid Speed");

        }

        else { //If the speed is not less than zero, move one

            System.out.print("Enter the number of hours the vehicle was in motion: ");
            double time = keyboard.nextDouble();

            if (time < 3) { //Verify at least 3 hours are given

                System.out.println("Invalid Time, enter at least three hours");

            }

            else{ //If time is greater than or equal to 3, move on

                System.out.println("Hour\tDistance Traveled");
                System.out.println("-------------------------");

                for (int i = 1; i <= time; i++) {

                    System.out.println(i + "\t" + (i * speed));

                }

            }

        }

    }

}
