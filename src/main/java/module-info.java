module com.org.raphaelprojects.passwordgenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.org.raphaelprojects.passwordgenerator to javafx.fxml;
    exports com.org.raphaelprojects.passwordgenerator;
}