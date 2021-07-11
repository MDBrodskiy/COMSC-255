/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

/**
 * The Geometry class provides three basic calculator functions to find the area of: a circle, a rectangle, or a triangle
 */

public class Geometry

{

    /**
     * The circle method takes in a radius value and calculates the area of a circle with said radius
     * @param rad The radius of the circle
     * @return The area of a circle with the given radius
     */

    public static double circle(double rad) {

        if (rad < 0) {

            System.out.println("ERROR... Exiting!");
            System.exit(0);

        }

            return (Math.PI * rad * rad);

    }

    /**
     * The rectangle method takes in a length and width value and calculates the area of a rectangle with the given parameters
     * @param l The length of the rectangle
     * @param w The width of the rectangle
     * @return The area of a rectangle with given values
     */

    public static double rectangle(double l, double w) {

        if (l < 0 || w < 0) {

            System.out.println("ERROR... Exiting!");
            System.exit(0);

        }

            return (l * w);

    }

    /**
     * The triangle method takes in a base and height value and calculates the area of a triangle with the given parameters
     * @param b The base of the triangle
     * @param h The height of the triangle
     * @return The area of a triangle with given values
     */

    public static double triangle(double b, double h) {

        if (b < 0 || h < 0) {

            System.out.println("ERROR... Exiting!");
            System.exit(0);

        }

            return (.5 * b * h);

    }

}
