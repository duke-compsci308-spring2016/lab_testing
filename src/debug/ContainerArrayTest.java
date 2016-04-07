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
    public void testAddTooMany(){
    	for(int i=0; i<12; i++){
    		myContainer.add("a" + i);
    	}
    	assertEquals(myContainer.get(11), null);
    }
    
    @Test 
    public void testRemove(){
    	myContainer.add("bear");
    	System.out.print(myContainer.get(0));
    	myContainer.remove("bear");
    	assertNotEquals(myContainer.get(0), "bear");
    }
    
    @Test
    public void testGet(){
    	assertEquals(myContainer.get(12), null);
    }
    
    @Test 
    public void testRemoveNotThere(){
    	int initialSize = myContainer.size();
    	myContainer.remove("bear");
    	assertEquals(initialSize, myContainer.size());
    }
    
    @Test 
    public void testCapacity(){
    	for(int i=0; i<12; i++){
    		myContainer.add("a" + i);
    	}
    	assertEquals(myContainer.size(), 10);
    }
}

