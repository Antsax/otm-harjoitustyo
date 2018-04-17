package swervinderwin.miscellaneous;

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
}
