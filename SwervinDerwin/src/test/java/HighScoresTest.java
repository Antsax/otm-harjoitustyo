import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import swervinderwin.ui.HighScores;

/**
 *
 * @author antsax
 */
public class HighScoresTest {
    
    @Test
    public void titleIsProduced() {
        HighScores scores = new HighScores();
        String text = scores.generateTitle().toString();
        assertEquals("High Scores", text.substring(11, 22));
    }
}
