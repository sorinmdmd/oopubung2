package Ubung2;

import javafx.stage.Stage;

public class AnwendersystemView extends AnwendersystemModel {
	AnwendersystemControl anwControl;
	AnwendersystemModel anwModel;
	Stage primaryStage;
	
	public AnwendersystemView(AnwendersystemControl anwControl, AnwendersystemModel anwModel, Stage primaryStage) {
		super();
		this.anwControl = anwControl;
		this.anwModel = anwModel;
		this.primaryStage = primaryStage;
	}
	
	
	
}
