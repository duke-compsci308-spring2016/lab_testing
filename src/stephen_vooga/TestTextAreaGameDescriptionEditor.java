package stephen_vooga;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestTextAreaGameDescriptionEditor {

	private TextAreaGameDescriptionEditor editor = null;
	
	@Before
    public void setUp () {
        editor = new TextAreaGameDescriptionEditor("Hello", "Go", 5, e -> printStuff());
    }
	
	public void printStuff() {
		System.out.println("Hello");
	}
	
	@Test
	public void testPromptText() {
		assertEquals("Paddings should match", "Hello", editor.getPromptText());
	}
}
