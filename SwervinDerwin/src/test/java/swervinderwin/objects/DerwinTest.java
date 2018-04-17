package swervinderwin.objects;

import javafx.scene.Scene;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import swervinderwin.ui.Map;

/**
 *
 * @author ahommy
 */
public class DerwinTest {
    
    Derwin derwin;
    double xStart;
    double yStart;
    
    public DerwinTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        derwin = new Derwin(1200 / 2 - 22 - 5, 800 - 195);
        xStart = derwin.getCharacter().getTranslateX();
        yStart = derwin.getCharacter().getTranslateY();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void derwinCreated() {
        assertNotNull(derwin);
    }
    
    @Test
    public void moveRight() {
        derwin.moveRight();
        assertEquals(derwin.x(), xStart + 1.5, 0);
    }
    
    @Test
    public void moveLeft() {
        derwin.moveLeft();
        assertEquals(derwin.x(), xStart - 1.5, 0);
    }
    
    @Test
    public void crouch() {
        derwin.crouch();
        assertFalse(derwin.y() == yStart);
    }
    
    @Test
    public void doesntDropOnStart() {
        derwin.drop();
        assertEquals(derwin.y(), yStart, 0);
    }
    
    @Test
    public void correctSize() {
        assertEquals(derwin.getCharacter().getWidth(), 45, 0);
        assertEquals(derwin.getCharacter().getHeight(), 45, 0);
    }
}
