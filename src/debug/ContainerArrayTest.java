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
    
    //
    @Test
    public void testObjectIsRemoved2(){
    	String dog = "Dog";
    	myContainer.add(dog);
    	String cat = "Cat";
    	myContainer.add(cat);
    	myContainer.remove(dog);
    	assertEquals("Remove should be same reference", cat, myContainer.get(0));
    }
    
    @Test
    public void testAddPastCapacity(){
    	myContainer.add("a");
    	myContainer.add("b");
    	myContainer.add("c");
    	myContainer.add("d");
    	myContainer.add("e");
    	myContainer.add("f");
    	myContainer.add("g");
    	myContainer.add("h");
    	myContainer.add("i");
    	myContainer.add("j");
    	myContainer.add("k");
    	assertEquals(myContainer.size(), myContainer.get(10));

    }
    
    @Test
    public void testSizeChange(){
    	String me = "Michelle";
    	myContainer.add(me);
    	myContainer.add("Michael");
    	//myContainer.remove("Michelle");
    	assertEquals("My size", 1, myContainer.size());
    }
    
    //also the constructor size will always be 10--that's bad design
}
