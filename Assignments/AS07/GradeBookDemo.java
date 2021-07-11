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
 * This program demonstrates the GradeBook class
 * */

public class GradeBookDemo 

{

    public static void main(String[] args) throws IOException
    
    {

        //Create a GradeBook object
        GradeBook grades = new GradeBook();

        for (int i = 0; i <= 4; i++) {

            System.out.printf("Name: %s \t Average Score: %.2f \t Grade: %s \n", grades.getName(i), grades.getAverage(i), grades.getLetterGrade(i));

        }

    }

}
