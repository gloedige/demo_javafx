package de.iav.demo_studentdb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentDB_Scene extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(StudentDB_Scene.class.getResource("/de/iav/demo_javafx/StudentDB_SceneBuilder_ChoiceBox.fxml"));
        Scene scene = new Scene (loader.load(),500,500);

        stage.setTitle("Student DB");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}