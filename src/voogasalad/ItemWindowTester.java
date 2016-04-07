package voogasalad;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemWindowTester {
	
	PlayerSpritesTab myTab = new PlayerSpritesTab();
	
	@Test
	public void testSetTitle(){
		myTab.setTabTitle("");
		assertEquals("", myTab.getTab().getText());
		myTab.setTabTitle(" ");
		assertEquals(" ", myTab.getTab().getText());
		myTab.setTabTitle(" Title ");
		assertEquals("Title", myTab.getTab().getText());
	}

}