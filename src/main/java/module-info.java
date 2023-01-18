module com.mycompany.mavenproject3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.mavenproject3 to javafx.fxml;
    exports com.mycompany.mavenproject3;
}
