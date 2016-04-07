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
    public void testCantRemoveFromEmpty ()
    {
    	myContainer.remove("Hello");
        assertEquals("Remove size", 0, myContainer.size());
    }
    
    @Test
    public void testCantAddMoreThanLimit()
    {
    	for ( int i = 0; i < 12; i++ )
    		myContainer.add("HELLO");
    	
        assertEquals("Size should be Limit", 10, myContainer.size());
    }
    
    @Test
    public void testThatRemoveWorks(){
    	myContainer.add("Camel");
    	myContainer.add("Giraffe");
    	myContainer.remove("Camel");
    	System.out.println("Test1");
    	assertEquals(myContainer.get(0), "Giraffe");
    	assertEquals(myContainer.size(), 1);
    }
    
    @Test
    public void testThatCantGetOutOfBoundIndices(){
    	myContainer.add("Camel");
    	myContainer.add("Giraffe");
    	assertEquals(myContainer.get(-1), null);
    	assertEquals(myContainer.get(5),null);
    	}

}
