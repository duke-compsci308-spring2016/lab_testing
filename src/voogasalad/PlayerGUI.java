package voogasalad;

import java.util.ResourceBundle;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class PlayerGUI{
	private static final double TABS_OFFSET = 32.5;
	private static final double NEWTAB_OFFSET = 2.5;
	private static final String GUI_RESOURCE = "GUI";
	private int windowWidth;
	private int windowHeight;
	private AnchorPane myRoot;
	private TabPane myTabs;
	private ResourceBundle myResources;
	
	public PlayerGUI(int windowWidth, int windowHeight) {
		this.windowWidth = windowWidth;
		this.windowHeight = windowHeight;
	}
	
	public int getWidth() {
		return this.windowWidth;
	}
	
	public int getHeight() {
		return this.windowHeight;
	}
}
