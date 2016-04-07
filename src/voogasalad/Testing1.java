package voogasalad;


import static org.junit.Assert.*;

import org.junit.Test;


import java.lang.reflect.InvocationTargetException;

import org.junit.Before;

import gameplayer.view.SplashScreen;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


/*
 * This class does not compile because we had issues with testing in the lab_testing package
 * so we decided to create a package within our voogasalad project called lab_testing
 * that implements JUnit tests and we worked on that side.
 */

public class Testing1 {

	private SplashScreen mySplash = null;
	
	public Testing1() {
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void setUP(){
		mySplash = new SplashScreen(new Stage());
	}
	
	@Test
	public void testElement(){
		try {
			mySplash.setButtonsUp(new HBox());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Adding buttons", mySplash.getRoot().getChildren().contains(new Button()));
	}
	
	@Test
	public void testSwitch(){
		mySplash.edit();
		assertEquals("Screen switch", "GUIMain", mySplash.getClass());
	}

}

