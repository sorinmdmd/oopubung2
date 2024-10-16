package Ubung2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AnwendersystemControl anwControl = new AnwendersystemControl(primaryStage);
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,300,300);
		primaryStage.setTitle(anwControl.anwModel.getUeberschrift());
		
        Button submitButton = new Button("Submit");

				
		HBox topSection = new HBox(10, anwControl.anwView.textField, submitButton);
		
        root.setCenter(topSection);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
 