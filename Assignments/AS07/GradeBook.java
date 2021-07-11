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
 * The GradeBook class parses the StudentInfo.txt file and organizes student test information
 */

public class GradeBook

{

    //Create array size variables
    private final int STUDENT_COUNT = 5;
    private final int TEST_COUNT = 4;

    //Create array to store names
    private String[] names = new String[STUDENT_COUNT];

    //Create array to store scores
    private double[][] scores = new double[STUDENT_COUNT][TEST_COUNT];

    //Create array for average scores
    private double[] average = new double[STUDENT_COUNT];

    /**
     * This constructor method retrieves names and grades from the StudentInfo.txt file
     */

    public GradeBook() throws IOException {

        //Create a file object to read from
        File file = new File("StudentInfo.txt");

        //Check for file existence
        if (!file.exists()) {

            System.out.println("The file \"StudentInfo.txt\" can not be found");
            System.exit(0);

        }


        //Create a scanner object to read the file
        Scanner inputFile = new Scanner(file);

        //Create a loop control variable
        int index = 0;

        //Place the file contents in two arrays
        while (inputFile.hasNext()){

            names[index] = inputFile.nextLine();

            for (int row = 0; row < TEST_COUNT; row++) {

                String swap = inputFile.nextLine();
                scores[index][row] = Double.parseDouble(swap);

            }

            index++;
        }

        //Create a value to act as an accumulator
        double value = 0;

        for (int i = 0; i < STUDENT_COUNT; i++) {

            for (int j = 0; j < TEST_COUNT; j++) {

                value += scores[i][j];

            }

            average[i] = (value / 4);
            value = 0;
        
        }
    }

    /**
     * This method retrieves a specific name from the names array
     * @param i The index in the names array
     * @return The name at the given index
     */

    public String getName(int i) {

        return names[i];

    } 

    /**
     * This method retrieves a specific average score from the average array
     * @param i The index in the average array
     * @return The average score at the given index
     */

    public double getAverage(int i) {

        return average[i];

    }

    /**
     * This method retrieves a letter grade based on the average score of a given index
     * @param i The index used for the average array
     * @return The letter grade for an average score at the given index
     */

    public char getLetterGrade(int i) {

        if (average[i] >= 0 && average[i] < 60) {

            return 'F';

        }

        else if (average[i] >= 60 && average[i] < 70) {

            return 'D';

        }

        else if (average[i] >= 70 && average[i] < 80) {

            return 'C';

        }

        else if (average[i] >= 80 && average[i] < 90) {

            return 'B';

        }

        else if (average[i] >= 90 && average[i] <= 100) {

            return 'A';

        }

        else {

            return 'E';

        }

    }

}
