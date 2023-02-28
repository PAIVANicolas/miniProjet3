module com.example.miniprojet3 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.miniprojet3 to javafx.fxml;
    exports com.example.miniprojet3;
}