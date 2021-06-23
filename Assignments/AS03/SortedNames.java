/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Scanner;

/**
 * This program asks for three names, capitalizes the first letters, and then sorts in alphabetical order
 * */

public class SortedNames

{

    public static void main(String[] args)
    
    {

        //Create scanner for inputs
        Scanner keyboard = new Scanner(System.in);

        //Define strings for storing names and transition characters
        String name1Initial, name2Initial, name3Initial, name1, name2, name3, char1, char2, char3;

        //Receive name input
        System.out.print("Enter the first name: ");
        name1Initial = keyboard.nextLine();
        System.out.print("Enter the second name: ");
        name2Initial = keyboard.nextLine();
        System.out.print("Enter the third name: ");
        name3Initial = keyboard.nextLine();

        //Create characters to capitalize
        char1 = name1Initial.substring(0,1);
        char2 = name2Initial.substring(0,1);
        char3 = name3Initial.substring(0,1);

        //Create capitalized names and make all other characters lowercase
        name1 = char1.toUpperCase() + name1Initial.substring(1,name1Initial.length()).toLowerCase();
        name2 = char2.toUpperCase() + name2Initial.substring(1,name2Initial.length()).toLowerCase();
        name3 = char3.toUpperCase() + name3Initial.substring(1,name3Initial.length()).toLowerCase();

        //State that this is the insensitive case
        System.out.println("\nCase Insensitive:");

        if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0 && name2.compareTo(name3) < 0) { // Case if the order is already correct

            System.out.println(name1 + "\n" + name2 + "\n" + name3);

        }

        else if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0 && name2.compareTo(name3) >= 0) { // Case if name3 comes before name2, both of which are after name1

            System.out.println(name1 + "\n" + name3 + "\n" + name2);

        }

        else if (name1.compareTo(name2) < 0 && name1.compareTo(name3) >= 0 && name2.compareTo(name3) >= 0) { // Case if name3 comes before name1, which comes before name2

            System.out.println(name3 + "\n" + name1 + "\n" + name2);

        }

        else if (name1.compareTo(name2) >= 0 && name1.compareTo(name3) >= 0 && name2.compareTo(name3) >= 0) { // Case if name3 comes before name2, which comes before name1

            System.out.println(name3 + "\n" + name2 + "\n" + name1);

        }

        else if (name1.compareTo(name2) >= 0 && name1.compareTo(name3) < 0 && name2.compareTo(name3) < 0) { // Case if name2 comes before name1, which comes before name3

            System.out.println(name2 + "\n" + name1 + "\n" + name3);

        }

        else { //If all above cases fail, print only option left

            System.out.println(name2 + "\n" + name3 + "\n" + name1);

        }

        //State that this is the sensitive case
        System.out.println("\nCase Sensitive:");

        if (name1Initial.compareToIgnoreCase(name2Initial) < 0 && name1Initial.compareToIgnoreCase(name3Initial) < 0 && name2Initial.compareToIgnoreCase(name3Initial) < 0) { // Case if the order is already correct

            System.out.println(name1Initial + "\n" + name2Initial + "\n" + name3Initial);

        }

        else if (name1Initial.compareToIgnoreCase(name2Initial) < 0 && name1Initial.compareToIgnoreCase(name3Initial) < 0 && name2Initial.compareToIgnoreCase(name3Initial) >= 0) { // Case if name3 comes before name2, both of which are after name1

            System.out.println(name1Initial + "\n" + name3Initial + "\n" + name2Initial);

        }

        else if (name1Initial.compareToIgnoreCase(name2Initial) < 0 && name1Initial.compareToIgnoreCase(name3Initial) >= 0 && name2Initial.compareToIgnoreCase(name3Initial) >= 0) { // Case if name3 comes before name1, which comes before name2

            System.out.println(name3Initial + "\n" + name1Initial + "\n" + name2Initial);

        }

        else if (name1Initial.compareToIgnoreCase(name2Initial) >= 0 && name1Initial.compareToIgnoreCase(name3Initial) >= 0 && name2Initial.compareToIgnoreCase(name3Initial) >= 0) { // Case if name3 comes before name2, which comes before name1

            System.out.println(name3Initial + "\n" + name2Initial + "\n" + name1Initial);

        }

        else if (name1Initial.compareToIgnoreCase(name2Initial) >= 0 && name1Initial.compareToIgnoreCase(name3Initial) < 0 && name2Initial.compareToIgnoreCase(name3Initial) < 0) { // Case if name2 comes before name1, which comes before name3

            System.out.println(name2Initial + "\n" + name1Initial + "\n" + name3Initial);

        }

        else { //If all above cases fail, print only option left

            System.out.println(name2Initial + "\n" + name3Initial + "\n" + name1Initial);

        }

    }

}
