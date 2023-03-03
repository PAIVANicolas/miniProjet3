package com.example.miniprojet3.Modele;

import com.example.miniprojet3.Controleur.MemoryGameController;
import com.example.miniprojet3.View.CardView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                card = new Card(new Image("file:src/main/resources/fr/miniprojet3/miniprojet3/images/dos-carte-s10-hearthstone.jpg"));
                cardView = new CardView(card);
                gridPane.add(cardView, i, j);
            }
        }

        borderPane.setCenter(gridPane);

        // Create the scene
        Scene scene = new Scene(borderPane, 400, 400);

        // Set the stage
        stage.setScene(scene);
        stage.setTitle("Memory Game");
        stage.show();
    }
}




