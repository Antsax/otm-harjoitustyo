package swervinderwin.ui;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahommy
 */
public class HighScoresTest {
    
    HighScores scores;
    Scene scene;
    Scene testScene;
    
    public HighScoresTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        scores = new HighScores();
        scene = scores.scene();
        Pane testPane = new Pane();
        testPane.setPrefSize(scores.width, scores.height);
        testScene = new Scene(testPane, scores.width, scores.height);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void titleCreated() {
        String text = scores.generateTitle().toString();
        assertEquals("Hall of Fame", text.substring(11, 23));
    }
    
    @Test
    public void sceneIsCorrectSized() {
        assertEquals(scene.getHeight(), testScene.getHeight(), 5);
        assertEquals(scene.getWidth(), testScene.getWidth(), 5);
    }
}
