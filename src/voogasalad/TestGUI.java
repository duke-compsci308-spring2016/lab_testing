package voogasalad;

import static org.junit.Assert.*;

import org.junit.Test;
import javafx.scene.control.Button;

public class TestGUI {

	@Test
	public void testWidth() {
		PlayerGUI gui = new PlayerGUI(500, 500);
		assertEquals("Check Width", 500, gui.getWidth());
	}
	
	@Test
	public void testHeight() {
		PlayerGUI gui = new PlayerGUI(500, 500);
		assertEquals("Check Width", 500, gui.getHeight());
	}

}
