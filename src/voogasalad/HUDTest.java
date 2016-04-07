package voogasalad;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class HUDTest {

	public class ContainerArrayTest {
	    private HUDScreen;

	    @Before
	    public void setUp () {
	        myHUD = new HUDScreen();
	    }

	    @Test
	    public void testAdd() {
	    	myHUD.add("Health", 100);
	    	assertequals(myHUD.get("Health"), 100);
	    }
	    
	    @Test
	    public void testRemove() {
	    	myHUD.remove("Health", 100);
	    	assertnull(myHUD.get("Health"));
	    }
	    
	    @Test
	    public void testMiss() {
	    	assertnull(myHUD.get("example"));
	    }
	    
	    
	    

}