package com.example.miniprojet3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MemoriseController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}