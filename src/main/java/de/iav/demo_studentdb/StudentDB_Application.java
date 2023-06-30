package de.iav.demo_studentdb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentDB_Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(StudentDB_Application.class.getResource("/de/iav/demo_javafx/StudentWelcomeScene.fxml"));
        Scene scene = new Scene (loader.load(),300,200);

        stage.setTitle("Student DB");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}