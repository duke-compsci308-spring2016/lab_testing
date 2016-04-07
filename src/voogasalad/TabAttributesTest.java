package voogasalad;

import static org.junit.Assert.*;

import org.junit.Test;


public class TabAttributesTest {
	private TabAttributes ta = null;
	private String rbValidBaseBundle;

	@Test
	public void testHandleInvalidBaseBundle() {
		rbValidBaseBundle = "validbasegiven";
	    ta = new TabAttributes("tabTest", rbValidBaseBundle);
	    assertEquals("validbasegiven", ta.getResourcesBundleBaseName());
	    ta = new TabAttributes("tabTest", "randomword");
	    assertEquals("invalidbasegiven", ta.getResourcesBundleBaseName());
	    
	}

}
