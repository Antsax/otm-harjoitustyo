package swervinderwin.objects;

import javafx.scene.shape.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterTest {

    Enemy enemy;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        enemy = new Enemy(50, 200, new Derwin(45, 45));
    }

    @After
    public void tearDown() {
    }

    @Test
    public void characterMovesRight() {
        double startingX = enemy.getX();
        enemy.moveRight();
        assertFalse(enemy.getX() == startingX);
    }

    @Test
    public void characterMovesLeft() {
        double startingX = enemy.getX();
        enemy.moveLeft();
        assertFalse(enemy.getX() == startingX);
    }

    @Test
    public void dropIsAbstract() {
        double startingY = enemy.getY();
        enemy.drop();
        assertTrue(enemy.getY() == startingY);
    }

    @Test
    public void crouchIsAbstract() {
        double startingY = enemy.getY();
        enemy.crouch();
        assertTrue(enemy.getY() == startingY);
    }

    @Test
    public void jumpIsAbstract() {
        double startingY = enemy.getY();
        enemy.jump();
        assertTrue(enemy.getY() == startingY);
    }

    @Test
    public void enemyMovesUp() {
        double startingY = enemy.getY();
        enemy.moveUp();
        assertFalse(enemy.getY() == startingY);
    }

    @Test
    public void enemyMovesDown() {
        double startingY = enemy.getY();
        enemy.moveDown();
        assertFalse(enemy.getY() == startingY);
    }
}
