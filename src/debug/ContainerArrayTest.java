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
    public void testSizeLimit () {
    	myContainer = new ContainerArray<>(1);
    	myContainer.add("Alligator");
    	myContainer.add("Bear");
    }
    
    @Test
    public void testMultipleRemoves () {
    	myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        myContainer.remove("Alligator");
        assertEquals("Remove size", 1, myContainer.size());
    }
    
    @Test
    public void testRemovesAll () {
    	myContainer.add("Alligator");
    	myContainer.add("Alligator");
    	myContainer.remove("Alligator");
    	assertEquals("Removes all", 0, myContainer.size());
    }
}
