/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

/**
 * The circle class for making circle-related calculations
 */

public class CircleClass

{

    private final double PI = 3.14159;
    private double radius;

    /**
     * Constructor (No-Arg)
     */

    public CircleClass() {

        radius = 0.0;

    }

    /**
     * Constructor (Radius Arg)
     * @param rad The radius of the circle
     */

    public CircleClass(double rad) {

        radius = rad;

    }

    /**
     * Mutator method for the radius field
     * @param rad The radius of the circle
     */

    public void setRadius(double rad) {

        radius = rad;

    }

    /**
     * Accessor method for the radius field
     * @return The radius of the circle
     */

    public double getRadius() {

        return radius;

    }

    /**
     * This method calculates the area of the circle
     * @return The area of the circle
     */

    public double getArea() {

        return (PI * radius * radius);

    }

    /**
     * This method calculates the diameter of the circle
     * @return The diameter of the circle
     */

    public double getDiameter() {

        return (2 * radius);

    }

    /**
     * This method calculates the circumference of the circle
     * @return The circumference of the circle
     */

    public double getCircumference() {

        return (2 * PI * radius);

    }

}
