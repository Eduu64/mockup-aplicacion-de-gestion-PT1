package application;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class MainController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private JFXButton homebtn;

	@FXML
	private JFXButton Dashboardbtn;

	@FXML
	private JFXButton Eventbtn;

	@FXML
	private JFXButton Membersbtn;

	@FXML
	private JFXButton Supportbtn;

	@FXML
	private AnchorPane HolderPane;

	@FXML

	void dashboardAction(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));

			// Cargar el nuevo FXML
			AnchorPane otroPane = loader.load();

			// Limpiar el AnchorPane principal
			HolderPane.getChildren().clear();

			// Agregar el nuevo FXML al AnchorPane principal
			HolderPane.getChildren().add(otroPane);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void eventosAction(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Eventos.fxml"));

			// Cargar el nuevo FXML
			AnchorPane otroPane = loader.load();

			// Limpiar el AnchorPane principal
			HolderPane.getChildren().clear();

			// Agregar el nuevo FXML al AnchorPane principal
			HolderPane.getChildren().add(otroPane);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void homeAction(ActionEvent event) {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));

			// Cargar el nuevo FXML
			AnchorPane otroPane = loader.load();

			// Limpiar el AnchorPane principal
			HolderPane.getChildren().clear();

			// Agregar el nuevo FXML al AnchorPane principal
			HolderPane.getChildren().add(otroPane);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@FXML
	void miembrosAction(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Miembros.fxml"));

			// Cargar el nuevo FXML
			AnchorPane otroPane = loader.load();

			// Limpiar el AnchorPane principal
			HolderPane.getChildren().clear();

			// Agregar el nuevo FXML al AnchorPane principal
			HolderPane.getChildren().add(otroPane);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void soporteAction(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Soporte.fxml"));

			// Cargar el nuevo FXML
			AnchorPane otroPane = loader.load();

			// Limpiar el AnchorPane principal
			HolderPane.getChildren().clear();

			// Agregar el nuevo FXML al AnchorPane principal
			HolderPane.getChildren().add(otroPane);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void initialize() {
		assert homebtn != null : "fx:id=\"homebtn\" was not injected: check your FXML file 'Main.fxml'.";
		assert Dashboardbtn != null : "fx:id=\"Dashboardbtn\" was not injected: check your FXML file 'Main.fxml'.";
		assert Eventbtn != null : "fx:id=\"Eventbtn\" was not injected: check your FXML file 'Main.fxml'.";
		assert Membersbtn != null : "fx:id=\"Membersbtn\" was not injected: check your FXML file 'Main.fxml'.";
		assert Supportbtn != null : "fx:id=\"Supportbtn\" was not injected: check your FXML file 'Main.fxml'.";
		assert HolderPane != null : "fx:id=\"HolderPane\" was not injected: check your FXML file 'Main.fxml'.";
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));

			// Cargar el nuevo FXML
			AnchorPane otroPane = loader.load();

			// Limpiar el AnchorPane principal
			HolderPane.getChildren().clear();

			// Agregar el nuevo FXML al AnchorPane principal
			HolderPane.getChildren().add(otroPane);

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}
