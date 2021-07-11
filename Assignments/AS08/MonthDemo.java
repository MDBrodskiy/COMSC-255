/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

/**
 * This program demonstrates the Month class
 * */

public class MonthDemo

{

    public static void main(String[] args)
    
    {

        Month calendar = new Month();

        System.out.println("1. The default month is " + calendar.getMonthNumber() + ", which is " + calendar.getMonthName() + "\n");

        System.out.println("2. Passing value 2 to the month object through a constructor...");
            calendar = new Month(2);
            System.out.println("The new month is " + calendar.getMonthNumber() + ", or " + calendar.getMonthName() + "\n");

            System.out.println("3. Passing value \"mArcH\" to the month object through a constructor...");
            calendar = new Month("mArcH");
            System.out.println("The new month is " + calendar.getMonthNumber() + ", or " + calendar.getMonthName() + "\n");

            System.out.println("4. Setting monthNumber to 4...");
            calendar.setMonthNumber(4);
            System.out.println("The new month is " + calendar.getMonthNumber() + ", or " + calendar.getMonthName() + "\n");

            System.out.println("5. getMonthNumber returns: " + calendar.getMonthNumber() + "\n");

            System.out.println("6. getMonthName returns: " + calendar.getMonthName() + "\n");

            System.out.println("7. toString returns: " + calendar + "\n");

            System.out.println("Creating new month and setting it to October...\n");

                Month october = new Month(10);

            System.out.println("8. " + calendar + " is equal to " + october + ": " + calendar.equals(october) + "\n");

            System.out.println("9. " + calendar + " is greater than " + october + ": " + calendar.greaterThan(october) + "\n");
            System.out.println("10. " + calendar + " is less than " + october + ": " + calendar.lessThan(october) + "\n");

    }

}
