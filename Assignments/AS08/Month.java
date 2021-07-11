/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

/**
 * The Month class provides a framework for working an interacting with various months
 */

public class Month

{

    private int monthNumber;
    private String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /**
     * This no-arg constructor initializes the month number as 1
     */

    public Month() {

        monthNumber = 1;

    }

    /**
     * This constructor allows for a monthNumber to be set to a desired value
     * @param monthNumber The given number of the month
     */

    public Month(int monthNumber) {

        if (monthNumber < 0 || monthNumber > 12) {

            this.monthNumber = 1;

        }

        else {

            this.monthNumber = monthNumber;

        }

    }

    /**
     * This constructor takes in a month name as a String and sets monthNumber to a corresponding value
     */

    public Month(String monthName) {

        monthName = monthName.substring(0,1).toUpperCase() + monthName.substring(1,monthName.length()).toLowerCase();

        for (int i = 1; i <= monthNames.length; i++) {

            if (monthName.equals(monthNames[(i - 1)])) {

                monthNumber = i;

            }

        }

    }

    /**
     * This mutator allows changes to be made to the monthNumber
     * @param monthNumber The number of the month desired by the user
     */

    public void setMonthNumber(int monthNumber) {

        if (monthNumber < 0 || monthNumber > 12) {

            this.monthNumber = 1;

        }

        else {

            this.monthNumber = monthNumber;

        }

    }

    /**
     * This accessor returns the number of the month stored in monthNumber
     * @return The month number stored in monthNumber
     */

    public int getMonthNumber() {

        return this.monthNumber;

    }

    /**
     * This accessor returns the name of the month based on the value stored in monthNumber
     * @return The month name based on the value in monthNumber
     */

    public String getMonthName() {

        return monthNames[(monthNumber - 1)];

    }

    /**
     * This method returns the month number as a string
     * @return The month name as a string
     */

    public String toString() {

        return monthNames[(monthNumber - 1)];

    }

    /**
     * This method compares two month objects and determines whether the two are equal
     * @param m The second month object that is being compared
     * @return True if the objects are equal, false if not
     */

    public boolean equals(Month m) {

        if (this.monthNumber == m.getMonthNumber()) {

            return true;

        }

        return false;

    }

    /**
     * This method compares two month objects to determine which is greater
     * @param m The second month object that is being compared
     * @return True if the first object is greater than the second
     */

    public boolean greaterThan(Month m) {

        if (this.monthNumber > m.getMonthNumber()) {

            return true;

        }

        return false;

    }

    /**
     * This method compares two month objects to determine which is less
     * @param m The second month object that is being compared
     * @return True if the first object is less than the second
     */

    public boolean lessThan(Month m) {

        if (this.monthNumber < m.getMonthNumber()) {

            return true;

        }

        return false;

    }
}
