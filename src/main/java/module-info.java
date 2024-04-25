module com.lunon {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lunon to javafx.fxml;
    exports com.lunon;
}
