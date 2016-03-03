package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.*;

public class GUIController {

	@FXML
	private Button formatName;
	
	@FXML
	private TextField firstName;
	
	@FXML
	private TextField middleName;
	
	@FXML
	private TextField lastName;
	
	@FXML
	private TextField title;
	
	@FXML
	private Label formattedName;

	
	public void initialize(){
		
	}
	
	public void clickFormat(ActionEvent event){
		formattedName.setText(title.getText()+". "+firstName.getText()+" "+middleName.getText()+" "+lastName.getText()
							+"\n"+firstName.getText()+" "+middleName.getText()+" "+lastName.getText()
							+"\n"+firstName.getText()+" "+lastName.getText()
							+"\n"+lastName.getText()+", "+firstName.getText()+" "+middleName.getText()+", "+title.getText()+"."
							+"\n"+lastName.getText()+", "+firstName.getText()+" "+middleName.getText()
							+"\n"+lastName.getText()+", "+firstName.getText()
							);
	}

	
}
