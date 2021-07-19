/*
 *
 * Written by: Michael Brodskiy (adapted from class book)
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

/**
 * The Essay class extends the capabilities of GradedActivity
 */

public class Essay extends GradedActivity

{

    //Initialize necessary variables
    private double grammarScore;
    private double spellingScore;
    private double lengthScore;
    private double contentScore;
    private double totalScore;

    /**
     * With no constructor input, make all values 0
     */

    public Essay() {

        grammarScore = 0;
        spellingScore = 0;
        lengthScore = 0;
        contentScore = 0;

    }

    public Essay(Essay e) {

        this.grammarScore = e.getGrammarScore();
        this.spellingScore = e.getSpellingScore();
        this.lengthScore = e.getSpellingScore();
        this.contentScore = e.getContentScore();
        super.setScore(e.getScore());

    }

    /**
     * With four double inputs, set all respective score values
     * @param g The grammar score
     * @param s The spelling score
     * @param l The length score
     * @param c The content score
     */

    public Essay(double g, double s, double l, double c) {

        grammarScore = g;
        spellingScore = s;
        lengthScore = l;
        contentScore = c;
        setScore((g + s + l + c));

    }

    /**
     * With one constructor input, set the total score in GradedActivity to t
     * @param t The total score
     */

    public Essay(double t) {

        setScore(t);

    }

    /**
     * This method allows changes to be made to the grammar score
     * @param g The grammar score
     */

    public void setGrammarScore(double g) {

        grammarScore = g;
        setScore((grammarScore + spellingScore + lengthScore + contentScore));

    }

    /**
     * This method allows changes to be made to the spelling score
     * @param s The spelling score
     */

    public void setSpellingScore(double s) {

        spellingScore = s;
        setScore((grammarScore + spellingScore + lengthScore + contentScore));

    }

    /**
     * This method allows changes to be made to the length score
     * @param l The length score
     */

    public void setLengthScore(double l) {

        lengthScore = l;
        setScore((grammarScore + spellingScore + lengthScore + contentScore));

    }

    /**
     * This method allows changes to be made to the content score
     * @param c The content score
     */

    public void setContentScore(double c) {

        contentScore = c;
        setScore((grammarScore + spellingScore + lengthScore + contentScore));

    }

    /**
     * This method returns the grammar score
     * @return The grammar score
     */

    public double getGrammarScore() {

        return grammarScore;

    }

    /**
     * This method returns the spelling score
     * @return The spelling score
     */

    public double getSpellingScore() {

        return spellingScore;

    }

    /**
     * This method returns the length score
     * @return The length score
     */

    public double getLengthScore() {

        return lengthScore;

    }

    /**
     * This method returns the content score
     * @return The content score
     */

    public double getContentScore() {

        return contentScore;

    }

}
