package Ubung2;

import javafx.stage.Stage;

public class AnwendersystemControl {
	AnwendersystemModel anwModel;
	AnwendersystemView anwView;
	Stage primaryStage;

	public AnwendersystemControl(Stage primaryStage) {
		super();
		this.primaryStage = primaryStage;
		this.anwModel = new AnwendersystemModel();
		this.anwView = new AnwendersystemView(this, anwModel, primaryStage);
	}
	
	
}
