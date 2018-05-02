package swervinderwin.objects;

import javafx.scene.layout.Pane;
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
public class EnemyCreatorTest {
    
    EnemyCreator creator;
    Pane pane;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Derwin derwin = new Derwin(600, 45);
        pane = new Pane();
        pane.setPrefSize(1200, 800);
        this.creator = new EnemyCreator(pane, derwin);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void creatorExists() {
        assertNotNull(creator);
    }
    
    @Test
    public void enemyAddedToPane() {
        for (int i = 0; i <= 100; i++) {
            creator.addEnemy();
        }
        
        assertTrue(!creator.getEnemies().isEmpty());
    }
    
    @Test
    public void enemyRemoved() {
        Enemy enemy = new Enemy(-100, 200, new Derwin(45,45));
        creator.getEnemies().add(enemy);
        creator.removeEnemy();
        assertEquals(creator.getEnemies().size(), 0);
    }
}
