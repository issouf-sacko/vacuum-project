package application;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import bo.Aspirateur;
import bo.Grille;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			// Crée un chargeur pour le fichier fxml.
			FXMLLoader loader = new FXMLLoader();
			 
			/**
			 * Main.class.getResource("../vue.VueRendezVous.fxml") retourne l'URL du fichier
			 * fxml à charger Indique ainsi au chargeur l'emplacement du fichier à charger
			 */
			loader.setLocation(Main.class.getResource("../vue/Ihm.fxml"));
			// Charge l'objet correspondant au fichier comme objet racine
			GridPane rootLayout = (GridPane) loader.load();
			
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Aspirateur");
			// Insertion d'une image à gauche dans la barre de titre de la fenêtre
			primaryStage.getIcons().add(new Image("file:resources/images/agenda2.png"));
			primaryStage.show();
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public static void main(String[] args) {
		launch(args);

		}
}
