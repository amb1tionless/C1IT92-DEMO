module com.amb1tionless.mavenproject2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.amb1tionless.mavenproject2 to javafx.fxml;
    exports com.amb1tionless.mavenproject2;
}
