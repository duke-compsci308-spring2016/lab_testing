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
    public void testArrayBounds() {
    	for (int i = 0; i < 15; i++) {
    		myContainer.add(String.valueOf(i));
    	}
    	assertEquals("Array size", 10, myContainer.size());
    }
    
    @Test
    public void testRemoveObject() {
    	myContainer.add("Alligator");
    	myContainer.add("Bear");
    	myContainer.add("Alligator");
    	myContainer.remove("Alligator");
    	assertEquals("Remove element", null, myContainer.get(0));
    	assertEquals("Remove element", null, myContainer.get(2));
    	assertEquals("Remove size", 1, myContainer.size());
    }
    
    @Test
    public void testRemoveObjectNotInContainer() {
    	myContainer.add("Alligator");
    	myContainer.remove("Nothing");
    	assertEquals("Remove size", 1, myContainer.size());
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
}
