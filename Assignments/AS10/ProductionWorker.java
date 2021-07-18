/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

/**
 * The ProductionWorker class stores a shift and an hourly pay rate for employees
 */

public class ProductionWorker extends Employee

{

    //Create necessary private variables
    private int shift;
    private double payRate;
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;

    /**
     * This no-arg constructor sets shift and payRate to 0 automatically, as well as calls the no-arg constructor from the Employee superclass
     */

    public ProductionWorker() {

        shift = 0;
        payRate = 0.0;

    }

    /**
     * This constructor takes five inputs and calls the Employee superclass constructor, as well as sets its own values to the inputs
     * @param n The name that will be passed to the super constructor
     * @param num The employee number that will be passed to the super constructor
     * @param date The hire date that will be passed to the super constructor
     * @param sh The shift number that will be used 
     * @param rate The payRate that will be used
     */

    public ProductionWorker(String n, String num, String date, int sh, double rate) {

        super(n, num, date);
        shift = sh;
        payRate = rate;

    }

    /**
     * The setShift method is a mutator method that sets shift to the input if the input is 1 or 2, and sets it to 0 otherwise
     * @param s The shift number that is received
     */

    public void setShift(int s) {

        if (s == 1 || s == 2) {

            shift = s;

        }

        else {

            shift = 0;

        }

    }

    /**
     * The setPayRate method is a mutator method that is used to change the payRate
     * @param p The pay rate that is received
     */

    public void setPayRate(double p) {

        payRate = p;

    }

    /**
     * The getShift method is an accessor method that returns the shift number as an int
     * @return The shift as an int
     */

    public int getShift() {

        return shift;

    }

    /**
     * The getPayRate method is an accessor method that returns the pay rate
     * @return The pay rate
     */

    public double getPayRate() {

        return payRate;

    }

    /**
     * The toString method defines the shift name as a String (not an int), and outputs worker information
     * @return Information of a production worker
     */

    public String toString() {

        String shiftName;

        if (shift == DAY_SHIFT) {

            shiftName = "Day";

        }

        else if (shift == NIGHT_SHIFT) { 

            shiftName = "Night";

        }

        else {

            shiftName = "INVALID";

        }

        return String.format("Name: %s\nEmployee Number: %s\nHire Date: %s\nShift: %s\nHourly Pay Rate: $%.2f", super.getName(), super.getEmployeeNumber(), super.getHireDate(), shiftName, payRate);

    }

}
