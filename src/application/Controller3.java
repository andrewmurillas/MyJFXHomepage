package application;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller3 {

	Stage stage;
	Scene scene1, scene2;

	public void inicio(Stage stage, Scene scene1, Scene scene2) {
		this.stage = stage;
		this.scene1 = scene1;
		this.scene2 = scene2;
	}

	@FXML
	public void setNext() {
		stage.setScene(scene1);
	}

	@FXML
	public void setPrevious() {
		stage.setScene(scene2);
	}

}
