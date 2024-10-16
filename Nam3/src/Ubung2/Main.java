package Ubung2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AnwendersystemControl anwControl = new AnwendersystemControl(primaryStage);

		Scene scene = new Scene(anwControl.anwView.getRoot(), 300, 300);
		primaryStage.setTitle(anwControl.anwModel.getUeberschrift());

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
