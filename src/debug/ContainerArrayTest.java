package debug;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ContainerArrayTest {
    private ContainerArray<String> myContainer = null;

    @Before
    public void setUp () {
        myContainer = new ContainerArray<>();
    }

    @Test
    public void testSizeChangeWithAdd () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.add("Camel");
        assertEquals("Add size", 3, myContainer.size());
    }

    @Test
    public void testObjectIsStored () {
        String alligator = "Alligator";
        myContainer.add(alligator);
        assertEquals("Add should be same reference", alligator, myContainer.get(0));
    }

    @Test
    public void testSizeChangeWithRemove () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals("Remove size", 1, myContainer.size());
    }

    @Test
    public void testObjectIsRemoved () {
        String alligator = "Alligator";
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Bear");
        assertEquals("Remove should be same reference", alligator, myContainer.get(0));
    }
    
    // New Tests
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfBounds(){
        myContainer.add("Alligator");
        myContainer.get(11);
    }
    
    @Test
    public void testGetOnNull(){
        myContainer.add("Alligator");
        assertEquals(null,myContainer.get(5));
    }
    
    @Test
    public void testCorrectRemove () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals(null, myContainer.get(1));
        
    }
    
    @Test
    public void testSizeLimit () {
        myContainer.remove(" ");
        assertEquals(0, myContainer.size());
    }
    
    @Test
    public void testIfRightObjectRemoved () {
        myContainer.add("Aligator");
        myContainer.add("Bear");
        myContainer.remove("Aligator");
        assertEquals("Bear", myContainer.get(0));
    }
    
}
