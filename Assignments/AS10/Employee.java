/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

/**
 * The Employee class contains information regarding employees, such as name, number, and hire date
 */

public class Employee

{

    //Create necessary private variables
    private String name;
    private String employeeNumber;
    private String hireDate;

    /**
     * This no-arg constructor sets all fields to "Undetermined"
     */

    public Employee() {

        name = "Undetermined";
        employeeNumber = "Undetermined";
        hireDate = "Undetermined";

    }

    /**
     * This constructor assigns the entered values to name, employeeNumber, and hireDate, respectively
     */

    public Employee(String n, String num, String date) {

        name = n;

        if (isValidEmpNum(num)) {

            employeeNumber = num;

        }

        else {

            employeeNumber = "INVALID";

        }

        hireDate = date;

    }

    /**
     * The setName method is a mutator that changes the value of name
     * @param n The value that name will be set to
     */

    public void setName(String n) {

        name = n;

    }

    /**
     * The setEmployeeNumber method is a mutator that changes the value of employeeNumber
     * @param e The value that employeeNumber will be set to
     */

    public void setEmployeeNumber(String e) {


        if (isValidEmpNum(e)) {

            employeeNumber = e;

        }

        else {

            employeeNumber = "INVALID";

        }

    }

    /**
     * The setHireDate method is a mutator that changes the value of hireDate
     * @param e The value that hireDate will be set to
     */

    public void setHireDate(String h) {

        hireDate = h;

    }

    /**
     * The getName method is an accessor that returns the value of name
     * @return The name being stored in name
     */

    public String getName() {

        return name;

    }

    /**
     * The getEmployeeNumber method is an accessor that returns the value of employeeNumber
     * @return The value being stored in employeeNumber
     */

    public String getEmployeeNumber() {

        return employeeNumber;

    }

    /**
     * The getHireDate method is an accessor that returns the value of hireDate
     * @return The value being stored in hireDate
     */

    public String getHireDate() {

        return hireDate;

    }

    /**
     * The private isValidEmpNum method verifies that an entered employee number is valid
     * @param e The employee number to check for validity
     * @return True if the number is valid, false if not
     */

    private boolean isValidEmpNum(String e) {

        final byte DIGIT_COUNT = 3;
        boolean isValid = true;
        char[] nameAsArray = e.toCharArray();

        for (int i = 0; i < DIGIT_COUNT; i++) {

            if (!Character.isDigit(nameAsArray[i])) {

                isValid = false;

            }

        }

        if (!String.valueOf(nameAsArray[nameAsArray.length - 2]).equals("-")) {

            isValid = false;

        }

        if (!Character.isLetter(nameAsArray[nameAsArray.length - 1]) || String.valueOf(nameAsArray[nameAsArray.length - 1]).compareTo("M") > 0) {

            isValid = false;

        }

        return isValid;

    }

    /**
     * The toString method converts values present in Employee to a String output
     * @return A string consisting of Employee values
     */

    public String toString() {

        return String.format("Name: %s\nEmployee Number: %s\nHire Date: %s", name, employeeNumber, hireDate);

    }

}
