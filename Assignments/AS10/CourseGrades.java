/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

/**
 * The CourseGrades class provides a framework for working with class grades
 */

public class CourseGrades implements Analyzable

{

    //Create basic values
    private final int NUM_GRADES = 4;
    private GradedActivity[] grades = new GradedActivity[NUM_GRADES];

    /**
     * The CourseGrades constructor creates objects for each element in the array
     */

    public CourseGrades() {

    }

    public void setLab(GradedActivity aLab) {

        grades[0] = new GradedActivity(aLab);

    }

    public void setPassFailExam(PassFailExam aPassFailExam) {

        grades[1] = new PassFailExam(aPassFailExam);

    }

    public void setEssay(Essay anEssay) {

        grades[2] = new Essay(anEssay);

    }

    public void setFinalExam(FinalExam aFinalExam) {

        grades[3] = new FinalExam(aFinalExam);

    }

    public String toString() {

        GradedActivity high = new GradedActivity(getHighest());
        GradedActivity low = new GradedActivity(getLowest());

        return String.format("Lab Score: %.1f\tGrade: %c\nPass/Fail Exam Score: %.1f\tGrade: %c\nEssay Score: %.1f\tGrade: %c\nFinal Exam Score: %.1f\tGrade: %c\nAverage score: %.1f\nHighest score: %.1f\nLowest score: %.1f\n", grades[0].getScore(), grades[0].getGrade(), grades[1].getScore(), grades[1].getGrade(), grades[2].getScore(), grades[2].getGrade(), grades[3].getScore(), grades[3].getGrade(), getAverage(), high.getScore(), low.getScore());

    }

    public double getAverage() {

        double accumulator = 0;

        for (int i = 0; i < grades.length; i++) {

            accumulator += grades[i].getScore();

        }

        return (accumulator / 4);

    }

    public GradedActivity getHighest() {

        GradedActivity highestScore = new GradedActivity(grades[0]);

        for (int i = 1; i < grades.length; i++) {

            if (grades[i].getScore() > highestScore.getScore()) {

                highestScore = new GradedActivity(grades[i]);

            }

        }

        return highestScore;

    }

    public GradedActivity getLowest() {

        GradedActivity lowestScore = new GradedActivity(grades[0]);

        for (int i = 1; i < grades.length; i++) {

            if (grades[i].getScore() < lowestScore.getScore()) {

                lowestScore = new GradedActivity(grades[i]);

            }

        }

        return lowestScore;

    }

}
