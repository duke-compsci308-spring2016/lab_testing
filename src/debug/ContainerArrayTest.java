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
    public void testObjectGoneWithRemove () {
    	 myContainer.add("Alligator");
         myContainer.add("Bear");
         myContainer.remove("Alligator");
         assertEquals("Object should be removed", null, myContainer.get(0));
    }

    @Test
    public void testObjectToRemoveExists () {
    	 myContainer.add("Alligator");
         myContainer.add("Bear");
         myContainer.remove("Cat");
         assertEquals("Size should not decrease if object does not exist", 2, myContainer.size());
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
    public void testRemoveThenAdd () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.add("Cat");
        myContainer.add("Duck");
        myContainer.remove("Bear");
        myContainer.add("Banana");
        assertEquals("Adding shouldn't overwrite", "Duck", myContainer.get(3));
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)  
    public void testOverflowCapacity () {
    	for(int i = 0; i < 11; i++) {
            myContainer.add("Alligator");
    	}
        assertEquals("Adding shouldn't overwrite", "Alligator", myContainer.get(0));
    }
    
    @Test  
    public void testLimit () {
    	myContainer = new ContainerArray<>(20);
    	for(int i = 0; i < 15; i++) {
            myContainer.add("Alligator");
    	}
        assertEquals("Custom constructor should update limit", "Alligator", myContainer.get(0));
    }
}
