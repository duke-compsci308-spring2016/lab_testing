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
    public void testObjectInBounds(){
    	 String alligator = "Alligator";
         myContainer.add("Alligator");
         myContainer.add("Bear");
         assertEquals("Array out of bounds ", "out of bounds", myContainer.get(11));
    }
    
    @Test
    public void testObjectWithinBounds(){
    	 String alligator = "Alligator";
         myContainer.add("Alligator");
         myContainer.add("Bear");
         assertEquals("Array in of bounds ", "empty", myContainer.get(2));
    }
    
    @Test
    public void testObjectRemoved(){
    	 String alligator = "Alligator";
         myContainer.add("Alligator");
         myContainer.add("Bear");
         myContainer.add("Deer");
         myContainer.remove(alligator);
         assertEquals("Is the object removed ", "empty", myContainer.get(0));
    }
    
    @Test
    public void testContainerFull(){
    	 String alligator = "Alligator";
         myContainer.add("Alligator");
         myContainer.add("Bear");
         myContainer.add("Deer");
         myContainer.add("Alligator");
         myContainer.add("Bear");
         myContainer.add("Deer");
         myContainer.add("Alligator");
         myContainer.add("Bear");
         myContainer.add("Deer"); 
         myContainer.add("Alligator");
         assertEquals("Is container full", "is full", myContainer.add("To many"));
    }
    
    @Test
    public void testSizeGreaterThanLimit(){
         myContainer.add("Alligator");
         myContainer.add("Bear");
         myContainer.add("Deer");
         myContainer.add("Alligator");
         myContainer.add("Bear");
         myContainer.add("Deer");
         myContainer.add("Alligator");
         myContainer.add("Bear");
         myContainer.add("Deer");
         myContainer.add("Alligator");
         myContainer.add("Bear");
         myContainer.add("Deer"); 
         myContainer.add("Alligator");
         assertEquals("is the size increasing if full", 10, myContainer.size());
    }
    
    
}
