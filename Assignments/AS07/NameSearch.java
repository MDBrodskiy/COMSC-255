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
 * This program parses files for the most popular boys and girls names, and compares those to the user-entered names
 * */

public class NameSearch

{

    public static final int NAME_COUNT = 200;

    public static void main(String[] args) throws IOException
    
    {

        //Create Scanner object to read keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Create two input files to be read by scanners
        File boysNames = new File("BoysNames.txt");
        File girlsNames = new File("GirlsNames.txt");

        //Create two Scanner objects to read file input
        Scanner boyNameReader = new Scanner(boysNames);
        Scanner girlNameReader = new Scanner(girlsNames);

        //Create String containers for boy and girl names
        String[] boys = new String[NAME_COUNT];
        String[] girls = new String[NAME_COUNT];

        //Copy file contents to name arrays
        for (int i = 0; i < NAME_COUNT; i++) {

            boys[i] = boyNameReader.nextLine();
            girls[i] = girlNameReader.nextLine();

        }

        //Request name input from the user
        System.out.print("Enter a boy's name, or N if you do not wish to enter a boy's name: "); 
        String boyNameEntered = keyboard.nextLine();
        System.out.print("Enter a girl's name, or N if you do not wish to enter a girl's name: ");
        String girlNameEntered = keyboard.nextLine();

        if (boyNameEntered.equals("N") && girlNameEntered.equals("N")) {

            System.out.println("You chose not to enter a boy's name.");
            System.out.println("You chose not to enter a girl's name.");

        }

        else if (boyNameEntered.equals("N") && !girlNameEntered.equals("N")) {

            System.out.println("You chose not to enter a boy's name.");
            
            if (findGirl(girlNameEntered, girls)) {

                System.out.println(girlNameEntered + " is one of the most popular girl's names.");

            }

            else {

                System.out.println(girlNameEntered + " is not one of the most popular girl's names.");

            }

        }

        else if (!boyNameEntered.equals("N") && girlNameEntered.equals("N")) {

            if (findBoy(boyNameEntered, boys)) {

                System.out.println(boyNameEntered + " is one of the most popular boy's names.");

            }

            else {

                System.out.println(boyNameEntered + " is not one of the most popular boy's names.");

            }

            System.out.println("You chose not to enter a girl's name.");

        }

        else {

            if (findBoy(boyNameEntered, boys)) {

                System.out.println(boyNameEntered + " is one of the most popular boy's names.");

            }

            else {

                System.out.println(boyNameEntered + " is not one of the most popular boy's names.");

            }

            if (findGirl(girlNameEntered, girls)) {

                System.out.println(girlNameEntered + " is one of the most popular girl's names.");

            }

            else {

                System.out.println(girlNameEntered + " is not one of the most popular girl's names.");

            }
        }

    }

    public static boolean findBoy(String str, String[] array) { 

        boolean popularBoy = false;

        for (int i = 0; i < NAME_COUNT; i++) {

            if (str.equals(array[i])) {

                popularBoy = true;

            }

        }

        return popularBoy;

    }

    public static boolean findGirl(String str, String[] array) { 

        boolean popularGirl = false;

        for (int i = 0; i < NAME_COUNT; i++) {

            if (str.equals(array[i])) {

                popularGirl = true;

            }

        }

        return popularGirl;

    }

}
