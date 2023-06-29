package de.iav.demo_studentdb;

import de.iav.demo_studentdb.model.Student;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.controlsfx.control.PropertySheet;

import java.net.URL;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.ResourceBundle;

public class StudentController implements Initializable {

    @FXML
    private ChoiceBox<String> isActiveChoiceBox;

    @FXML
    private TextField studentId;
    @FXML
    private TextField studentName;
    @FXML
    private ComboBox<String> coursesComboBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        isActiveChoiceBox.getItems().add("is active");
        isActiveChoiceBox.getItems().add("is inactive");
        coursesComboBox.getItems().add("Math");
        coursesComboBox.getItems().add("Mechanical Engineer");
        coursesComboBox.getItems().add("Biologie");
        coursesComboBox.getItems().add("Physics");
        //System.out.println("element 0:" + isActiveChoiceBox.getItems().get(0));


    }
    @FXML
    protected void createStudent(){
        System.out.println("new Student is: " + new Student(
                studentId.getText(),
                studentName.getText(),
                coursesComboBox.getValue(),
                isActiveChoiceBox.getValue()));
    }
    @FXML
    protected void clearForm(){
        studentId.clear();
        studentName.clear();
        coursesComboBox.setValue("");
        isActiveChoiceBox.setValue("");
    }
}
