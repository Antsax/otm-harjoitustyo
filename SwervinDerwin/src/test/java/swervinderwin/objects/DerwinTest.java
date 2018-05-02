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
        assertEquals(derwin.getX(), xStart + 4.5, 0);
    }
    
    @Test
    public void moveLeft() {
        derwin.moveLeft();
        assertEquals(derwin.getX(), xStart - 4.5, 0);
    }
    
    @Test
    public void crouch() {
        derwin.crouch();
        assertFalse(derwin.getY() == yStart);
    }
    
    @Test
    public void doesntDropOnStart() {
        derwin.drop();
        assertEquals(derwin.getY(), yStart, 0);
    }
    
    @Test
    public void correctSize() {
        assertEquals(derwin.getCharacter().getWidth(), 45, 0);
        assertEquals(derwin.getCharacter().getHeight(), 45, 0);
    }
    
    @Test
    public void threeLivesAtStart() {
        assertEquals(derwin.getLives(), 3);
    }
    
    @Test
    public void notImmuneAtStart() {
        assertFalse(derwin.isImmune());
    }
    
    @Test
    public void immunityChanges() {
        derwin.setImmune(true);
        assertTrue(derwin.isImmune());
    }
    
    @Test
    public void healthDoesntExceedThree() {
        derwin.addHealth();
        assertEquals(derwin.getLives(), 3);
    }
    
    @Test
    public void healthAddedWhenDamaged() {
        derwin.removeHealth();
        derwin.removeHealth();
        derwin.addHealth();
        assertEquals(derwin.getLives(), 2);
    }
    
    @Test
    public void healthRemoved() {
        derwin.removeHealth();
        assertEquals(derwin.getLives(), 2);
    }
    
    @Test
    public void dropsWhenNotOnPlatform() {
        Derwin derwinTest = new Derwin(100, 800);
        double startingY = derwinTest.getY();
        derwinTest.drop();
        assertFalse(derwinTest.getY() == startingY);
    }
    
    @Test
    public void derwinJumps() {
        Derwin derwinTest = new  Derwin(500, 735);
        double startingY = derwinTest.getY();
        derwinTest.jump();
        assertTrue(derwinTest.getY() == startingY);
    }
}
