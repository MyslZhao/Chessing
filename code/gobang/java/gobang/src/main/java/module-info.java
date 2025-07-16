module com.gobang {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gobang to javafx.fxml;
    exports com.gobang;
}
