package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.*;

public class SampleGuiController {

	@FXML
	private Button sinisterButton;
	
	@FXML
	private Button dexterButton;
	
	@FXML
	private Button mediumButton;
	
	@FXML
	private Label translatedLabel;
	
	public void initialize(){
		
	}
	
	public void clickSinister(ActionEvent event){
		translatedLabel.setText("left");
	}
	
	public void clickDexter(ActionEvent event){
		translatedLabel.setText("right");
	}
	
	public void clickMedium(ActionEvent event){
		translatedLabel.setText("center");
	}
}
