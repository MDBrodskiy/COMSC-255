/*
 *
 * Written by: Michael Brodskiy (adapted from class book)
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

/**
 * The GradedActivity class holds a grade for a graded activity
 */

public class GradedActivity

{

    //A numeric score holder
    private double score; 

    /**
     * This no-arg constructor does nothing
     */

    public GradedActivity() {

    }

    /**
    * This constructor may be called with a GradedActivity input
    * @param g The complementary GradedActivity
    */

    public GradedActivity(GradedActivity g) {

        this.score = g.getScore();

    }

    /**
     * The setScore method is a mutator that allows changes to be made to score
     * @param s The score to be set to
     */

    public void setScore(double s) {

        score = s;

    }

    /**
     * The getScore method is an accessor method that gives access to the score
     * @return The current value of score
     */

    public double getScore() {

        return score;

    }

    /**
     * The getGrade method returns a letter grade based on the score value
     * @return A letter grade corresponding to score
     */

    public char getGrade() {

        char letterGrade;

        if (score >= 90) letterGrade = 'A';
        else if (score >= 80 && score < 90) letterGrade = 'B';
        else if (score >= 70 && score < 80) letterGrade = 'C';
        else if (score >= 60 && score < 70) letterGrade = 'D';
        else letterGrade = 'F';

        return letterGrade;

    }

}
