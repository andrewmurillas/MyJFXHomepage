package application;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {

	Stage stage;
	Scene scene2, scene3;

	public void inicio(Stage stage2, Scene scene2, Scene scene3) {
		this.stage = stage2;
		this.scene2 = scene2;
		this.scene3 = scene3;
	}

	@FXML
	public void setNext() {
		stage.setScene(scene2);
	}

	@FXML
	public void setPrevious() {
		stage.setScene(scene3);
	}

}