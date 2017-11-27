

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtonDemo extends Application {
	
	//To get text to show up in a GUI
	private static final Text text = new Text(50,50, "Wake Tech");

	private Pane getPane() {
		
		//Makes a Horizontal box 
		//Creating a button that will say Left inside the button
		HBox paneForButtons = new HBox();
		Button btLeft = new Button("Left");
		//Creating what the button will do and how to handle events
		btLeft.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event){
				System.out.println("Kilroy was here");
			}
		});
		//Adding the button to the pane
		paneForButtons.getChildren().addAll(btLeft);
		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);
		
		//Creating a button that will say Right inside it
		Button btRight = new Button("Right");
		//Once again this is how the button will handle the button
		btRight.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event){
				System.out.println("Omar was here");
			}
		});
		
		//When doing the paneForButtons you can do panesForButton.getChildren().addAll(btLeft, btRight)
		//To add both of them at once without having to create two different times. 
		paneForButtons.getChildren().addAll(btRight);
		pane.setBottom(paneForButtons);
		
		//This is how you will add the text to the pane 
		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		//Puts the text into the middle of the GUI
		pane.setCenter(paneForText);
		
		Button btUp = new Button("UP");
		btUp.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event){
				text.setX(text.getX() + 10);;
			}
		});
		paneForButtons.getChildren().addAll(btUp);
		pane.setBottom(paneForButtons);
		
		Button btDown = new Button("DOWN");
		btDown.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event){
				text.setX(text.getX() - 10);;
			}
		});
		paneForButtons.getChildren().addAll(btDown);
		pane.setBottom(paneForButtons);
		
		
		return pane;
		
		
	}
	
	@Override
	//This create how big the GUI will start at
	public void start(Stage primaryStage) throws Exception{
		Scene scene = new Scene(getPane(), 450, 250);
		primaryStage.setTitle("ButtonDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	//Launches the GUI
	public static void main(String[] args){
		launch(args);
	}

}
