/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import javax.swing.JOptionPane;

/**
 * This program asks the user for the number of miles driven and the gallons of gas used to calculate the miles per gallon, which is displayed on-screen
 * */

public class MilesPerGallon

{

    public static void main(String[] args)
    
    {

        //Define string and double counterparts
        double miles;
        double gallons;
        String transition;

        //Save string input and convert to double
        transition = JOptionPane.showInputDialog("Enter the miles driven:");
        miles = Double.parseDouble(transition); 
        transition = JOptionPane.showInputDialog("Enter the gallons of fuel used:");
        gallons = Double.parseDouble(transition); 

        //Calculate mile-per-gallon value
        double mpg = miles / gallons;

        //Display calculated value
        JOptionPane.showMessageDialog(null, "The miles-per-gallon is " + mpg);

        //Exit program after displaying
        System.exit(0);

    }

}
