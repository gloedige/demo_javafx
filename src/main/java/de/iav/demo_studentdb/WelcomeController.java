package de.iav.demo_studentdb;

import de.iav.demo_scene_builder.HelloApplicationScene;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {

    private Scene scene;
    private Stage stage;
    private Parent root;
    @FXML
    private Button signUpButton;

    @FXML
    public void switchToInputScene(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/de/iav/demo_javafx/StudentDB_SceneBuilder_ChoiceBox.fxml")); // Jeweiliges FXML laden
        root = loader.load();
        //über studentInputController können Infos aus diesem hier importiert werden!
        //StudentInputController studentInputController = loader.getController(); // Jeweiligen Controller laden


        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        stage.setScene(scene); // Neue Szenen setzen
        stage.show(); // ... und einblenden
    }


}
