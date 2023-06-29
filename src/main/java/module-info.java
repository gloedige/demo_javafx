module de.iav.demo_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens de.iav.demo_javafx to javafx.fxml;
    opens de.iav.demo_studentdb to javafx.fxml;

    exports de.iav.demo_javafx;
    exports de.iav.demo_scene_builder;
    exports de.iav.demo_studentdb;
    exports de.iav.demo_studentdb.model;
    opens de.iav.demo_studentdb.model to javafx.fxml;

}