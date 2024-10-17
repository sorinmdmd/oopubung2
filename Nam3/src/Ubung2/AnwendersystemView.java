package Ubung2;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AnwendersystemView extends AnwendersystemModel {
	private AnwendersystemControl anwControl;
	private AnwendersystemModel anwModel;
	private Stage primaryStage;
	private BorderPane root;
	private TextField textField;
	private Button button;
	private Scene scene;
	
	public AnwendersystemView(AnwendersystemControl anwControl, AnwendersystemModel anwModel, Stage primaryStage) {
		super();
		this.anwControl = anwControl;
		this.anwModel = anwModel;
		this.primaryStage = primaryStage;
		textField = new TextField();
		button = new Button("Submit");
		root = new BorderPane();
		root.setCenter(textField);
	    root.setRight(button);
		scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public TextField getTextField() {
		return textField;
	}

	public BorderPane getRoot() {
		return root;
	}

	public Button getButton() {
		return button;
	}

	public Scene getScene() {
		return scene;
	}
	
	
	
}
