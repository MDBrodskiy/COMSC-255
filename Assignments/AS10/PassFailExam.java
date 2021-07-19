/*
 * This code snippet is adapted from the class book
 */

/**
* This class determines a passing or failing grade for an exam.
*/

public class PassFailExam extends PassFailActivity

{

    // Number of questions
    private int numQuestions;
    // Points for each question
    private double pointsEach;
    // Number of questions missed
    private int numMissed;

    /**
     * This no-arg constructor does nothing
     */

    public PassFailExam() {

    }

    /**
     * This constructor accepts a PassFailExam object as an argument
     * @param p The pass fail exam
     */

    public PassFailExam(PassFailExam p) {

        this.pointsEach = p.getPointsEach();
        this.numMissed = p.getNumMissed();
        super.setScore(p.getScore());

    }

    /**
    * The constructor sets the number of questions, the
    * number of questions missed, and the minimum passing
    * score.
    * @param questions The number of questions.
    * @param missed The number of questions missed.
    * @param minPassing The minimum passing score.
    */

    public PassFailExam(int questions, int missed, double minPassing) {

        // Call the superclass constructor.
        super(minPassing);

        // Declare a local variable for the score.
        double numericScore;

        // Set the numQuestions and numMissed fields.
        numQuestions = questions;
        numMissed = missed;

        // Calculate the points for each question
        pointsEach = 100.0 / questions;

        // Calculate the numeric score for this exam.
        numericScore = 100.0 - (missed * pointsEach);

        // Call the superclass's setScore method to set the numeric score.
        super.setScore(numericScore);

    }

    /**
    * The getPointsEach method returns the number of points each question is worth.
    * @return The value in the pointsEach field.
    */

    public double getPointsEach() {

        return pointsEach;
    }

    /**
    * The getNumMissed method returns the number of questions missed.
    * @return The value in the numMissed field.
    */

    public int getNumMissed() {

        return numMissed;
    }

}
