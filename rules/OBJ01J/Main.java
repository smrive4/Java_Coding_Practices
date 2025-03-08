/**
 * Rule Code: OBJ01-J
 * Rule Name: Limit accessibility of fields
 * Description: Ensures fields are private and updated through controlled methods.
 *
 * @author Daniel Golladay
 */
public class Main {
    public static void main(String[] args) {
        FootballScore game = new FootballScore();
        game.touchdown();
        game.fieldGoal();
        game.touchdown();

        System.out.println("Final Score: " + game.getScore()); // Should print 17
    }
}

/**
 * Encapsulation - keeps the score field private
 */
class FootballScore {
    
    // Ensures controll access by keeping the score private
    private int score;

    /**
     * Adds 7 points to the score when a touchdown is made.
     */
    public void touchdown() {
        score += 7; 
    }

    /**
     * Adds 3 points to the score when a field goal is made.
     */
    public void fieldGoal() {
        score += 3; 
    }

    /**
     * Retrieves the current score of the game.
     * 
     * @return the current score.
     */
    public int getScore() {
        return score; 
    }
}
