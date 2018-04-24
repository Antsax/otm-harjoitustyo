package swervinderwin.gamelogic;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import swervinderwin.objects.Derwin;
import swervinderwin.ui.Map;

/**
 *
 * @author ahommy
 */
public class MovementHandlerTest {
    
    MovementHandler handler;
    
    public MovementHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Derwin derwin = new Derwin(1200 / 2 - 22 - 5, 800 - 195);
        Map map = new Map();
        Pane pane = new Pane();
        handler = new MovementHandler(derwin, map.scene(), pane);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void handlerExists() {
        assertNotNull(handler);
    }
}
