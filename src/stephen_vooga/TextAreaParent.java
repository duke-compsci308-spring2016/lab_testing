package stephen_vooga;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 * 
 * Abstract class generating a VBox containing a Label prompting user to do something, a TextArea in which the author
 * can enter text, and a Button that can perform any defined action
 * game's description
 * 
 * @author Stephen
 *
 */

public abstract class TextAreaParent {
	
	private VBox myContainer;
	private Label myPrompt;
	private TextArea myTextArea;
	private Button myButton;
	
	public TextAreaParent(String promptText, String buttonText, int prefRows, EventHandler<ActionEvent> handler) {
		myContainer = new VBox();
		myPrompt = new Label(promptText);
		myPrompt.setWrapText(true);
		myTextArea = new TextArea();
		myTextArea.setPrefRowCount(prefRows);
		myButton = new Button(buttonText);
		myButton.setOnAction(handler);
		myButton.prefWidthProperty().bind(myContainer.widthProperty());
		myContainer.getChildren().addAll(myPrompt, myTextArea, myButton);
	}
	
	public void setContainerPadding(Insets insets) {
		myContainer.setPadding(insets);
	}
	
	public String getPromptText() {
		return myPrompt.getText();
	}
	
	protected void setTextAreaPromptText(String prompt) {
		myTextArea.setPromptText(prompt);
	}
	
	public VBox getCoupledNodes() {
		return myContainer;
	}

}
