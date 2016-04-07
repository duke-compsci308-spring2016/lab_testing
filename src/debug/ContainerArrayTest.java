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
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals("Remove should be same reference", "Bear", myContainer.get(0));
        
    }
    
    @Test
    public void testSizeLimit(){
    	for(int i = 0; i < 10; i++){
    		myContainer.add("a");
    	}
    	myContainer.remove("a");
    	myContainer.add("a");
    	assert(myContainer.size() < 10);
    }
    
    @Test
    public void testAddAfterRemovePlacement(){
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        myContainer.add("Dog");
        assertEquals("Dog", myContainer.get(1));
    }
    
    @Test
    public void testDoubleAddAndRemove(){
    	String Alligator = "Alligator";
    	myContainer.add("Alligator");
       	myContainer.add("Alligator");
       	myContainer.add("Alligator");
       	myContainer.add("Alligator");
       	myContainer.remove(Alligator);
       	assert(myContainer.size() == 3);
       	assertEquals(myContainer.get(0), Alligator);
       	
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void testOutOfBounds(){
    	myContainer.get(10);
    }
}
