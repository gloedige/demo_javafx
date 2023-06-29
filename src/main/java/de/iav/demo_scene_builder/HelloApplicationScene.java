package de.iav.demo_scene_builder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplicationScene extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(HelloApplicationScene.class.getResource("/de/iav/demo_javafx/First_Scene_Builder.fxml"));
        FXMLLoader loader = new FXMLLoader(HelloApplicationScene.class.getResource("/de/iav/demo_javafx/First_Scene_Builder.fxml"));
        Scene scene = new Scene (loader.load(),500,500, Color.AQUA);

        stage.setTitle("Hello with FXML!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}