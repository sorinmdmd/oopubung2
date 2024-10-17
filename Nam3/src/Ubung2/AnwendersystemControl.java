package Ubung2;

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
			anwView.showAlert("Meldung", "Der Text wurde in die Datei geschrieben.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			anwView.showAlert("Fehler", "Beim Schreiben der Datei ist ein Fehler aufgetreten.");
		}
	}
}
