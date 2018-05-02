package swervinderwin.objects;

import javafx.scene.paint.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antsax
 */
public class EnemyTest {

    private Enemy enemy;

    public EnemyTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Derwin derwin = new Derwin(45, 45);
        this.enemy = new Enemy(-60, 200, derwin);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void enemyCreated() {
        assertNotNull(enemy);
    }

    @Test
    public void enemyHasNoSide() {
        assertEquals(enemy.side(), "none");
    }

    @Test
    public void sideIsRight() {
        enemy.setRight();
        assertEquals(enemy.side(), "right");
    }

    @Test
    public void sideIsLeft() {
        enemy.setLeft();
        assertEquals(enemy.side(), "left");
    }
    
    @Test
    public void givesDerwin() {
        Derwin derwin = enemy.getDerwin();
        assertNotNull(derwin);
    }
    
    @Test
    public void collision() {
        Derwin collisionDerwin = new Derwin(45,45);
        Enemy collisionEnemy = new Enemy(45, 45, collisionDerwin);
        assertTrue(collisionEnemy.collision(collisionDerwin));
    }
}
