package Ubung2;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
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

		root = new BorderPane();

		button = new Button("Submit");
		textField = new TextField();
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(textField, button);

		root.setCenter(hbox);
		scene = new Scene(root, 400, 400);
		primaryStage.setTitle(anwModel.getUeberschrift());
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

	public void showAlert(String title, String message) {
		Stage st = new Stage();
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 400, 200);

		Text text = new Text(message);
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(text);

		root.setCenter(hbox);
		st.setTitle(title);
		st.setScene(scene);
		st.show();
	}

}
