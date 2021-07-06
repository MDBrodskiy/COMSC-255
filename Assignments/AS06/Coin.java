/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

import java.util.Random;

/**
 * The coin class creates a virtual coin that is tossed for a game
 */

public class Coin

{

    //sideUp variable to save the side in a string
    private String sideUp;
    
    //sideFinder variable to determine which side is up
    private int sideFinder;

    Random rand = new Random();

    /**
     * Constructor (No-Arg)
     */

    public Coin() {

        sideFinder = rand.nextInt(2);

        if (sideFinder == 0) {

            sideUp = "Heads";

        }

        else if (sideFinder == 1) {

            sideUp = "Tails";

        }

        else {

            sideUp = "ERROR";

        }

    }

    /**
     * The tossCoin method simulates an additional coin toss
     */

    public void tossCoin() {

        sideFinder = rand.nextInt(2);

        if (sideFinder == 0) {

            sideUp = "Heads";

        }

        else if (sideFinder == 1) {

            sideUp = "Tails";

        }

        else {

            sideUp = "ERROR";

        }

    }

    /**
     * Accessor method for the sideUp field
     * @return The side of the coin
     */

    public String getSideUp() {

        return sideUp;

    }

}
