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
    public void testObjectAdded(){
    	myContainer.add("Element");
    	assertEquals("Element",myContainer.get(myContainer.size()-1));
    }
    
    @Test
    public void testObjectRemoved(){
    	String obj = "Element";
    	myContainer.add(obj);
    	myContainer.add(obj);
    	
    	ContainerArray newArray = new ContainerArray();
    	newArray.add(obj);
    	myContainer.remove(obj);
    	for (int i = 0; i < 2; i++){
    		assertEquals(newArray.get(i), myContainer.get(i));
    	}
    }
    
    @Test
    public void testSizeMaximum(){
    	for (int i = 0; i < 12; i++){
    		myContainer.add("Test");
    	}
    	assertEquals(10, myContainer.size());
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
