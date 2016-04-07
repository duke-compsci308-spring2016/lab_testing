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
        assertEquals("Initial Size",0,myContainer.size());
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.add("Camel");
        assertEquals("Add size", 3, myContainer.size());
        for (int i =0;i<100;i++){
            myContainer.add(Integer.toString(i));
        }
        assertEquals("Max size", 10, myContainer.size());
    }

    @Test
    public void testObjectIsStored () {
        String alligator = "Alligator";
        myContainer.add(alligator);
        assertEquals("Add should be same reference", alligator, myContainer.get(0));
    }

    @Test
    public void testSizeChangeWithRemove () {
        System.out.println("DAS"+myContainer.size());
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");

        assertEquals("Remove size", 1, myContainer.size());
    }

    @Test
    public void testObjectIsRemoved () {
        String alligator = "Alligator";
        myContainer.add(alligator);
        myContainer.add("Bear");
        myContainer.remove("Bear");
        assertEquals("Remove should be same reference", alligator, myContainer.get(0));
    }
    
    
    
}
