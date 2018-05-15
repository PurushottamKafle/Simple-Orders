package pksoftFX;
import javafx.event.ActionEvent;

import java.util.EventListener;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class first extends Application { // inherits from Application
	
	
	Stage window;
	public static void main(String[]args) {
		launch(args);
		
	}
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Orders - PKSoft");
        
		Label label = new Label("What you want ?");
		CheckBox ch1 = new CheckBox("IceCream");
		CheckBox ch2 = new CheckBox("Chamcham");
		CheckBox ch3 = new CheckBox("Cake");
		ch3.setSelected(true);
		CheckBox ch4 = new CheckBox("Chocolates");
		ch4.setSelected(true);
		Button subButton = new Button("Order Now");
		// handeling orders
		subButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				handleOrder(ch1, ch2, ch3, ch4);
			}

		
		});
		
		// making HBox
		VBox layoutH = new VBox();
		layoutH.getChildren().addAll(label,ch1,ch2,ch3,ch4,subButton );
		layoutH.setSpacing(8.1);
		
		// making scene
		Scene scene = new Scene(layoutH, 390, 290);
		window.setScene(scene);
		window.show();
	}
	private void handleOrder(CheckBox ox1, CheckBox ox2, CheckBox ox3, CheckBox ox4) {
       String message ="Orders: \n";
       if(ox1.isSelected()) 
    	   message +="IceCream\n";
       
       if(ox2.isSelected()) 
    	   message +="ChamCham\n";
       
       if(ox3.isSelected()) 
    	   message +="Cake\n";
       
       if(ox4.isSelected()) 
    	   message +="Chocolates\n";
   
       System.out.println(message);
	}
	
}
