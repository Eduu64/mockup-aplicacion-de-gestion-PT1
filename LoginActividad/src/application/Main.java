package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loadermain = new FXMLLoader(getClass().getResource("/application/GUI.fxml"));

			ControllerLogin control = new ControllerLogin();

			loadermain.setController(control);

			Parent root = loadermain.load();
			control.setStage(primaryStage);
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
