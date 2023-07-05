package de.iav.demo_studentdb.service;

import de.iav.demo_studentdb.model.Student;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.List;

public class Studentservice {
    private static Studentservice instance;
    private List<Student> students;

    public static synchronized Studentservice getInstance() {
        if (instance == null) {
            instance = new Studentservice();
        }
        return instance;
    }
    @FXML
    public Student createStudent(Student student) {
        Student createdStudent = new Student(
                student.id(),
                student.name(),
                student.course(),
                student.isActive()
                );
        System.out.println("new Student is: " + createdStudent);
        students.add(createdStudent);
        return createdStudent;

    }
}
