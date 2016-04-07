package debug;

import static org.junit.Assert.*;

import java.util.Arrays;

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
    
    @Test // 
    public void testStoreLimit () {
    	 myContainer.addAll(Arrays.asList("aaaaaaaaaaaaaaaaaaaaaa".split("")));
         assertEquals("Add size", 10, myContainer.size());
    }

    @Test
    public void testObjectIsStored () {
        String alligator = "Alligator";
        myContainer.add(alligator);
        myContainer.add("Alligator");
        assertEquals("Add should be same reference", alligator, myContainer.get(0));
    }

    @Test 
    public void testSizeChangeWithRemove () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals("Remove size", 1, myContainer.size());
    }
    
    @Test //
    public void testRemoveNonExistentObject () {
    	myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Falafel");
        assertEquals("Remove size", 2, myContainer.size());
    }
    
    @Test // 
    public void testRemoveModifiesAndShiftsArray () {
    	myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals("Bear", myContainer.get(0));
    }

    @Test // 
    public void testGetOutOfBounds () {
    	myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.add("Loofah");
        assertEquals(null, myContainer.get(-1));
        assertEquals(null, myContainer.get(2568));
    }
    @Test
    public void testObjectIsRemoved () { 
        String alligator = "Alligator";
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Bear");
        myContainer.remove("Bear");
        assertEquals("Remove should be same reference", alligator, myContainer.get(0));
    }
}
