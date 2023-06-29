module de.iav.demo_javafx {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens de.iav.demo_javafx to javafx.fxml;
    exports de.iav.demo_javafx;
}