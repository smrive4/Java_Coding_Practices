/**
 * Rule Code: OBJ01-J
 * Rule Name: Limit accessibility of fields
 * Description: Restricts access to fields to prevent unintended modifications.
 * Why is this rule important?
 * - Encourages encapsulation and prevents unauthorized modifications.
 * - Ensures that object state is only changed through controlled methods.
 * Example: Keeping `score` private and providing methods for controlled updates.
 * 
 * @author Daniel Golladay
 */
public class Main {
    public static void main(String[] args) {
        FootballScore game = new FootballScore();
        game.touchdown();
        game.fieldGoal();
        game.touchdown();

        // Output the final score
        System.out.println("Final Score: " + game.getScore()); // Should print 17
    }
}

/**
 * Demonstrates limiting field accessibility by keeping `score` private and providing a getter.
 */
class FootballScore {
    private int score; // Private field

    /**
     * Increases the score by 7 for a touchdown.
     */
    public void touchdown() {
        score += 7;
    }

    /**
     * Increases the score by 3 for a field goal.
     */
    public void fieldGoal() {
        score += 3;
    }

    /**
     * Gets the current score.
     * @return the current score
     */
    public int getScore() {
        return score;
    }
}
