package de.iav.demo_studentdb;

import de.iav.demo_studentdb.model.Student;
import de.iav.demo_studentdb.service.Studentservice;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentInputController implements Initializable {


    private Scene scene;
    private Stage stage;
    private Parent root;
    @FXML
    private ComboBox<String> coursesComboBox;
    @FXML
    private ChoiceBox<String> isActiveChoiceBox;
    @FXML
    private TextField studentId;
    @FXML
    private TextField studentName;
    private final Studentservice studentservice = Studentservice.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        isActiveChoiceBox.getItems().add("is active");
        isActiveChoiceBox.getItems().add("is inactive");
        coursesComboBox.getItems().add("Math");
        coursesComboBox.getItems().add("Mechanical Engineer");
        coursesComboBox.getItems().add("Biology");
        coursesComboBox.getItems().add("Physics");
        //System.out.println("element 0:" + isActiveChoiceBox.getItems().get(0));


    }

    @FXML
    protected void clearForm(){
        studentId.clear();
        studentName.clear();
        coursesComboBox.setValue("");
        isActiveChoiceBox.setValue("");
    }
    @FXML
    public void switchToListScene(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/de/iav/demo_javafx/StudentListScene.fxml"));
        root = loader.load();
        Student newStudent = new Student(
                studentId.getText(),
                studentName.getText(),
                coursesComboBox.getValue(),
                isActiveChoiceBox.getValue());
        Student createdStudent = studentservice.createStudent(newStudent);


        StudentOutputController studentOutputController = loader.getController();
        //Option 1
        //studentOutputController.listView.getItems().add(createdStudent);
        //Option 2
        studentOutputController.addStudentToList(createdStudent);


        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }
    @FXML
    public void switchToWelcomeScene(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/de/iav/demo_javafx/StudentWelcomeScene.fxml"));
        root = loader.load();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);


    }
    }
