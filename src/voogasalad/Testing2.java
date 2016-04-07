package voogasalad;

import static org.junit.Assert.*;

import org.junit.Test;

import javafx.stage.Stage;
/*
 * This class does not compile because we had issues with testing in the lab_testing package
 * so we decided to create a package within our voogasalad project called lab_testing
 * that implements JUnit tests and we worked on that side.
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import gamedata.controller.CreatorController;
import gamedata.controller.ParserController;
import gameengine.controller.Game;
import gameengine.controller.GameInfo;
import gameengine.controller.Level;

public class Testing2 {

	Game myGame;
	CreatorController myCreatorController;
	ParserController myParserController;
	
	
	public Testing2() {
		// TODO Auto-generated constructor stub
	}

	@Before 
	public void initialize() {
		List<Level> levels = new ArrayList<>();
		levels.add(new Level());
		myGame = new Game(null, new GameInfo(), levels);
	}
	
	@Test
	public void testCreationandParsingWorks() throws ParserConfigurationException, SAXException, IOException, TransformerException {
		File f = new File("src/resources/test.xml");
		myCreatorController.saveForPlaying(f);
		Game g = myParserController.loadforPlaying(f);
		assertEquals("Testing parser produces game from created XML", myGame, g);
	}
}

