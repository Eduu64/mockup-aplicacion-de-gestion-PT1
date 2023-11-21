package application;

/**
 * Sample Skeleton for 'GUI.fxml' Controller Class
 */

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControllerLogin {

	private Stage stage;
	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="user"
	private JFXTextField user; // Value injected by FXMLLoader

	@FXML // fx:id="password"
	private JFXPasswordField password; // Value injected by FXMLLoader

	@FXML // fx:id="forget"
	private Label forget; // Value injected by FXMLLoader

	@FXML // fx:id="loginbtn"
	private JFXButton loginbtn; // Value injected by FXMLLoader

	@FXML
	void login(ActionEvent event) throws IOException{
		//String Usuario = user.getText();
		//String Contraseña = password.getText();

		FXMLLoader Mainloader = new FXMLLoader(getClass().getResource("/application/Main.fxml"));
		MainController control1 = new MainController();
		Mainloader.setController(control1);
		Parent root = Mainloader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		this.stage.close();


	}


	public void setStage(Stage primaryStage) {
		stage = primaryStage;
	}


}
