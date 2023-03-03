module com.example.miniprojet3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.miniprojet3 to javafx.fxml;
    exports com.example.miniprojet3.Controleur;
    opens com.example.miniprojet3.Controleur to javafx.fxml;
    exports com.example.miniprojet3.View;
    opens com.example.miniprojet3.View to javafx.fxml;
}