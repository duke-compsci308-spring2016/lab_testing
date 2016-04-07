package voogasalad;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class VectorTest {
    private Vector v;

    @Before
    public void setUp () {
        v = new Vector(10, 10);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testGetCoordinate () {
        assertEquals("Get X", 10, v.getX());
        assertEquals("Get Y", 10, v.getY());
    }

}
