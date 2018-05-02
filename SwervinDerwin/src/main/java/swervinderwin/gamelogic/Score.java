package swervinderwin.gamelogic;

/**
 * A class which gives the current score of the game
 *
 */
public class Score {
    private Integer score;
    
    public Score() {
        this.score = 0;
    }
    
    /**
     * Raises score by one point
     */
    public void raiseScore() {
        score++;
    }
    
    /**
     * Returns current score
     * 
     * @return current score
     */
    public int getScore() {
        return score;
    }
    
    /**
     * Returns the current score as a String
     * 
     * @return score as String
     */
    @Override
    public String toString() {
        return score.toString();
    }
}
