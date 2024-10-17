package Ubung2;

import java.io.IOException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class AnwendersystemControl {
	AnwendersystemModel anwModel;
	AnwendersystemView anwView;
	private Stage primaryStage;

	public AnwendersystemControl(Stage primaryStage) {
		super();
		this.primaryStage = primaryStage;
		this.anwModel = new AnwendersystemModel();
		this.anwView = new AnwendersystemView(this, anwModel, primaryStage);
		anwView.getButton().setOnAction(e -> handleButtonClick());
	}

	private void handleButtonClick() {
		
		String text = anwView.getTextField().getText();
		
		try {
			anwModel.WriteText(text);
			showAlert(AlertType.INFORMATION, "Meldung", "Der Text wurde in die Datei geschrieben.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			showAlert(AlertType.ERROR, "Fehler", "Beim Schreiben der Datei ist ein Fehler aufgetreten.");
		}
	}

	private void showAlert(AlertType alertType, String title, String message) {
		Alert alert = new Alert(alertType);
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}

}
