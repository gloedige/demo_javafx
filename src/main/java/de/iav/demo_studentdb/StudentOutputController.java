package de.iav.demo_studentdb;

import de.iav.demo_studentdb.model.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentOutputController {

    private Scene scene;
    private Stage stage;
    private Parent root;
    @FXML
    private Button ButtonBackToInput;
    @FXML
    private ListView<String> listView;
    private ObservableList<String> studentsToDelete;


    @FXML
    public void switchToInputScene(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/de/iav/demo_javafx/StudentRegistrationScene.fxml"));
        root = loader.load();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    public void addStudentToList(Student student){
        listView.getItems().add(student.name() + " - " + student.course());
    }

    public void deleteStudent(){
        String selectedStudent = listView.getSelectionModel().getSelectedItem();
        if(selectedStudent != null) {
            studentsToDelete.remove(selectedStudent);
            listView.refresh();
        }
    }
    @FXML
    private void initialize() {
        // Initialize the items list
        studentsToDelete = FXCollections.observableArrayList();
        listView.setItems(studentsToDelete);
    }
}
