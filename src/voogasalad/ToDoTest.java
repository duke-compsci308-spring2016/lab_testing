package voogasalad;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToDoTest {
	private ToDo td = null;
	private String rbValidBaseBundle;

	@Test
	public void testHandleInvalidBaseBundle() {
		rbValidBaseBundle = "validbasegiven";
	    td = new ToDo(rbValidBaseBundle);
	    assertEquals("validbasegiven", td.getResourcesBundleBaseName());
	    td = new ToDo("randomword");
	    assertEquals("invalidbasegiven", td.getResourcesBundleBaseName());
	    
	}

}
