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
    
    @Test // 
    public void testStoreLimit () {
    	 myContainer.add("Alligator");
         myContainer.add("Bear");
         myContainer.add("Camel");
         assertEquals("Add size", 3, myContainer.size());
         myContainer.add("4");
         myContainer.add("5");
         myContainer.add("6");
         myContainer.add("7");
         myContainer.add("8");
         myContainer.add("9");
         myContainer.add("10");
         myContainer.add("11");
         myContainer.add("12");
         myContainer.add("13");
         myContainer.add("14");
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
