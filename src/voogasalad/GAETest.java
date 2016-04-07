package voogasalad;

import static org.junit.Assert.*;

import org.junit.Test;

import backend.FrontEndGameAuthoringEnvironment;

public class GAETest {

	/**
	 *//////////////////////////////////////////////////////////////////////////////
	 *///////////////////GameAuthoringEnvirornment Tester//////////////////////////////////////////
	 *//////////////////////////////////////////////////////////////////////////////
	 */
	
	@Test
	public void testCreateGameObject() {
		GameAuthoringEnvironment gae = new GameAuthoringEnvironment();
		GameObject trump = new GameObject();
		assertEquals("is game object created", trump, gae.createGameObject());
	}
	
	@Test
	public void testSetGameObjectWithMockData(){
		FrontEndGameAuthoringEnvironment mockData = FrontEndGameAuthoringEnvironment();
		mockData.createModes( new {
				levels = 5,
				levels = 4,
				levels = 2,
		});
		GameAuthoringEnvironment gae = new GameAuthoringEnvironment();
		GameObject trump = new GameObject(mockData);
		assertEquals("is game object created", trump, gae.createGameObject(mockData));
	}
	
	/**
	 *//////////////////////////////////////////////////////////////////////////////
	 *///////////////////GameObject Tester//////////////////////////////////////////
	 *//////////////////////////////////////////////////////////////////////////////
	 */
	 
	 @Test
		public void testInitGameObject() {
			GameObject trump = new GameObject();
			int numModes = 1;
			int numLevels = 3;
			trump.initializeGameObject(numModes, numLevels)
			assertEquals("is game object created with right num of modes", numModes, trump.getModes());
			assertEquals("is game object created with right num of levels", numLevels, trump.getLevelsForMode(trump.getModes().get(0)));
		}
	 
	 @Test
		public void testNewLevelToCurrentMode() {
			GameObject trump = new GameObject();
			int numModes = 1;
			int numLevels = 3;
			trump.initializeGameObject(numModes, numLevels);
			trump.addNewLevelToCurrentMode(trump.getModes().get(0));
			
			assertEquals("did the game object add another level to current mode",  numLevels + 1, trump.getLevelsForMode(trump.getModes().get(0)));
			

		}
	
}
