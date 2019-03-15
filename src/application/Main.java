package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {

	Stage stage;
	FXMLLoader loader1, loader2, loader3;
	Scene scene1, scene2, scene3;

	@Override
	public void start(Stage primaryStage) throws IOException {
		try {
			stage = primaryStage;
			loader1 = new FXMLLoader(getClass().getResource("layout.fxml"));
			loader2 = new FXMLLoader(getClass().getResource("layout2.fxml"));
			loader3 = new FXMLLoader(getClass().getResource("layout3.fxml"));
			mainWindow();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mainWindow() throws Exception {

		AnchorPane pane1 = loader1.load();
		scene1 = new Scene(pane1);

		AnchorPane pane2 = loader2.load();
		scene2 = new Scene(pane2);

		AnchorPane pane3 = loader3.load();
		scene3 = new Scene(pane3);

		Controller controller1 = loader1.getController();
		controller1.inicio(stage, scene2, scene3);

		Controller2 controller2 = loader2.getController();
		controller2.inicio(stage, scene1, scene3);

		Controller3 controller3 = loader3.getController();
		controller3.inicio(stage, scene1, scene2);

		stage.setScene(scene1);
		stage.initStyle(StageStyle.UNDECORATED);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
