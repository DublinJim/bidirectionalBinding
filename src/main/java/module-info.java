module com.example.bidirectionalbinding {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.bidirectionalbinding to javafx.fxml;
    exports com.example.bidirectionalbinding;
}