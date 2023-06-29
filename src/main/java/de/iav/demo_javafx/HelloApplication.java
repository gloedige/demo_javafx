package de.iav.demo_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.BLANCHEDALMOND);
        Text sample = new Text("Hallo JavaFX");
        sample.setFont(new Font(30));
        sample.setFill(Paint.valueOf("#5b2cbf"));
        sample.translateXProperty() //hier wird der Text an einem sich in der Größe ändernden Fenster angepasst
                .bind(scene.widthProperty()
                .divide(2)
                .subtract(sample.layoutBoundsProperty()
                .get().getWidth()/2));
        sample.translateYProperty()
                .bind(scene.heightProperty()
                .divide(2));
        Circle Kreis = new Circle(100,100, 30);
        Circle Kreis2 = new Circle(400,100, 30);
        Kreis.setFill(Paint.valueOf("#5b2cbf"));
        Kreis2.setFill(Paint.valueOf("#5b2cbf"));

        root.getChildren().add(sample);
        root.getChildren().add(Kreis);
        root.getChildren().add(Kreis2);

        stage.setTitle("Hello without FXML!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}