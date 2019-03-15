package application;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller2 {

	Stage stage;
	Scene scene1, scene3;

	public void inicio(Stage stage, Scene scene1, Scene scene3) {
		this.stage = stage;
		this.scene1 = scene1;
		this.scene3 = scene3;
	}

	@FXML
	public void setNext() {
		stage.setScene(scene3);
	}

	@FXML
	public void setPrevious() {
		stage.setScene(scene1);
	}

}