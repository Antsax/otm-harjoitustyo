package swervinderwin.objects;

import javafx.scene.shape.Rectangle;
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
public class PlatformCreatorTest {
    
    PlatformCreator creator;
    
    public PlatformCreatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        creator = new PlatformCreator(1200, 800);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void creatorCreated() {
        assertNotNull(creator);
    }
    
    
    @Test
    public void floorCreated() {
        assertNotNull(creator.floor());
    }
    
    @Test
    public void largePlatformCreated() {
        assertNotNull(creator.largePlatform());
    }
    
    @Test
    public void mediumPlatformCreated() {
        assertNotNull(creator.mediumPlatfrom());
    }
    
    @Test
    public void smallPlatformCreated() {
        assertNotNull(creator.smallPlatform());
    }
}
