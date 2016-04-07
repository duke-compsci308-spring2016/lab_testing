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
        
        myContainer.remove("Alligator");
        assertEquals("Add size", 2, myContainer.size());
    }

    @Test
    public void testObjectIsStored () {
        String alligator = "Alligator";
        myContainer.add(alligator);
        assertEquals("Add should be same reference", alligator, myContainer.get(0));
        
        String camel = "Camel";
        String elephant = "Elephant";
        myContainer.add(camel);
        myContainer.add(elephant);
        assertEquals("Add should be same reference", camel, myContainer.get(1));
    }

    @Test
    public void testSizeChangeWithRemove () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals("Remove size", 1, myContainer.size());
        
        myContainer.add("Alligator");
        myContainer.add("Elephant");
        myContainer.add("Camel");
        myContainer.add("Dog");
        myContainer.remove("Elephant");
        myContainer.remove("Alligator");
        assertEquals("Remove size", 3, myContainer.size());
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
    public void testActualRemoval(){
    	myContainer.add("A");
    	myContainer.add("B");
    	myContainer.add("C");
    	myContainer.remove("A");
    	assertEquals("Remove should be same reference", "C", myContainer.get(1));
    }
}
