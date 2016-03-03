package application;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.*;


public class DistanceController {

	private double totalDistance=0;
	
	@FXML
	private Button fiveHours;
	
	@FXML
	private Button eightHours;
	
	@FXML
	private Button twelveHours;
	
	@FXML
	private TextField carSpeed;
	
	@FXML
	private Label outputSpeed;

	
	public void initialize(){
		
	}
	
	public void clickFive(ActionEvent event){
		totalDistance = Double.parseDouble(carSpeed.getText())*5;
		outputSpeed.setText("After Five hours of going "+carSpeed.getText()+"MPH you went "+totalDistance+" Miles");
	}
	
	public void clickEight(ActionEvent event){
		totalDistance = Double.parseDouble(carSpeed.getText())*8;
		outputSpeed.setText("After Eight hours of going "+carSpeed.getText()+"MPH you went "+totalDistance+" Miles");
	}
	
	public void clickTwelve(ActionEvent event){
		totalDistance = Double.parseDouble(carSpeed.getText())*12;
		outputSpeed.setText("After Twelve hours of going "+carSpeed.getText()+"MPH you went "+totalDistance+" Miles");
	}
		
}
