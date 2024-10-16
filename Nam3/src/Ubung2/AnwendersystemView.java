package Ubung2;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AnwendersystemView extends AnwendersystemModel {
	private AnwendersystemControl anwControl;
	private AnwendersystemModel anwModel;
	private Stage primaryStage;
	TextField textField = new TextField();
	
	public AnwendersystemView(AnwendersystemControl anwControl, AnwendersystemModel anwModel, Stage primaryStage) {
		super();
		this.anwControl = anwControl;
		this.anwModel = anwModel;
		this.primaryStage = primaryStage;
	}
	
	
	
}
