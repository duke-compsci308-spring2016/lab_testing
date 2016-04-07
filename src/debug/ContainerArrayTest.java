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

    @Test
    public void testIfRemoveTwiceFails(){
        myContainer.add("Alligator");
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals("Size should be 1", 1, myContainer.size());
    }
    @Test
    public void testIfAllObjectsAreRemoved(){
        myContainer.add("Alligator");
        myContainer.add("Alligator");
        myContainer.remove("Alligator");
        assertEquals("Array should have no elements", 0, myContainer.size());
    }
    @Test
    public void testIfObjectIsRemoved(){
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals("Remove element", "Bear", myContainer.get(0));
    }
}
