package swervinderwin.miscellaneous;

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
public class MapCreatorTest {
    
    MapCreator creator;
    
    public MapCreatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        creator = new MapCreator(1200, 800);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void creatorCreated() {
        assertNotNull(creator);
    }
    
    @Test
    public void platformsAddedToPane() {
        Pane pane = new Pane();
        pane.setPrefSize(1200, 800);
        creator.originalMap(pane);
        assertFalse(pane.getChildren().isEmpty());
    }
}
