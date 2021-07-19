/*
 * This code snippet is adapted from the class book
 */

/**
* This class determines the grade for a final exam.
*/

public class FinalExam extends GradedActivity {

    // Number of questions
    private int numQuestions;

    // Points for each question
    private double pointsEach;

    // Questions missed
    private int numMissed;

    /**
     * This no-arg constructor does nothing
     */

    public FinalExam() {

    }

    /**
     * This constructor takes in a FinalExam object
     * @param f The FinalExam object
     */

    public FinalExam(FinalExam f) {

        this.pointsEach = f.getPointsEach();
        this.numMissed = f.getNumMissed();
        super.setScore(f.getScore());

    }

    /**
    * The constructor sets the number of questions on the
    * exam and the number of questions missed.
    * @param questions The number of questions.
    * @param missed The number of questions missed.
    */

    public FinalExam(int questions, int missed) {

        // To hold a numeric score
        double numericScore;

        // Set the numQuestions and numMissed fields.
        numQuestions = questions;
        numMissed = missed;

        // Calculate the points for each question and the numeric score for this exam.
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        // Call the inherited setScore method to set the numeric score.
        super.setScore(numericScore);
    }

    /**
    * The getPointsEach method returns the number of
    * points each question is worth.
    * @return The value in the pointsEach field.
    */

    public double getPointsEach() {

        return pointsEach;

    }

    /**
    * The getNumMissed method returns the number of
    * questions missed.
    * @return The value in the numMissed field.
    */

    public int getNumMissed() {

        return numMissed;

    }
}
