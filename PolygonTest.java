

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PolygonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PolygonTest
{
    /**
     * Default constructor for test class PolygonTest
     */
    public PolygonTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetPerimeter()
    {
        Polygon polygon1 = new Polygon(3, 5);
        assertEquals(0.0, polygon1.getPerimeter(), 0.1);
    }

    @Test
    public void testGetArea()
    {
        Polygon polygon1 = new Polygon(5, 3);
        assertEquals(0, polygon1.getArea(), 0.1);
    }
}


