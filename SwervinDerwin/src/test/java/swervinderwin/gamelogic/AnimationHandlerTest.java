package swervinderwin.gamelogic;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import swervinderwin.objects.Derwin;

/**
 *
 * @author ahommy
 */
public class AnimationHandlerTest {

    AnimationHandler handler;
    Derwin derwin;
    Pane pane;
    
    public AnimationHandlerTest() {        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        derwin = new Derwin(45, 45);
        pane = new  Pane();
        pane.setPrefSize(1200, 800);
        Scene scene = new Scene(pane, 1200, 800);
        handler = new AnimationHandler(derwin, scene, pane);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void handlerExists() {
        assertNotNull(handler);
    }
    
    @Test
    public void timerWorks() {
        derwin.setImmune(true);
        int current = handler.getTimer();
        handler.startTimer();
        assertFalse(current == handler.getTimer());
    }
    
    @Test
    public void timerRefreshes() {
        derwin.setImmune(true);
        for (int i = 1; i <= 151; i++) {
            handler.startTimer();
        }
        
        assertEquals(handler.getTimer(), 0);
    }
    
    @Test
    public void initiateLives() {
        assertEquals(handler.getLives().size(), 4);
    }
    
    @Test
    public void scoresAreDrawn() {
        handler.drawScores();
        assertFalse(pane.getChildren().isEmpty());
    }
    
    @Test
    public void livesAreDrawn() {
        handler.drawLives();
        assertFalse(pane.getChildren().isEmpty());
    }
}
