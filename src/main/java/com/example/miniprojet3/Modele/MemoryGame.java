package com.example.miniprojet3.Modele;

import com.example.miniprojet3.View.CardView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;


public class MemoryGame extends Application {
    private Card card;
    private CardView cardView;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MemoryGameController.class.getResource("testd.fxml"));
        fxmlLoader.setControllerFactory(controlleur->{
            return new MemoryGameController();
        });

        BorderPane borderPane = fxmlLoader.load();
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new javafx.geometry.Insets(10,10,10,10));

        borderPane.setCenter(gridPane);

        // Create the scene
        Scene scene = new Scene(borderPane, 400, 400);

        // Set the stage
        stage.setScene(scene);
        stage.setTitle("Memory Game");
        stage.show();
    }

}




