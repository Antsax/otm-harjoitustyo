package swervinderwin.gamelogic;

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
public class ScoreTest {
    
    Score score;
    
    public ScoreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        score = new Score();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void scoreExists() {
        assertNotNull(score);
    }
    
    @Test
    public void scoreRises() {
        score.raiseScore();
        assertEquals(score.getScore(), 1);
    }
}
