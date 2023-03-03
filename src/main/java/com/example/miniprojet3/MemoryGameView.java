package com.example.miniprojet3;


import com.example.miniprojet3.Modele.Card;
import com.example.miniprojet3.View.CardView;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MemoryGameView extends Application {
    private Card card;
    private CardView cardView;
    private final int NUM_ROWS = 4;
    private final int NUM_COLS = 4;

    private BorderPane borderPane;
    private GridPane cardsPane;
    private Label scoreLabel;
    private Label timeLabel;
    private Button restartButton;

    @Override
    public void start(Stage primaryStage) {
        // Create the cards grid pane
        borderPane = new BorderPane();
        cardsPane = new GridPane();
        cardsPane.setAlignment(Pos.CENTER);
        cardsPane.setHgap(10);
        cardsPane.setVgap(10);
        cardsPane.setPadding(new Insets(10, 10, 10, 10));


        // Create the score label
        scoreLabel = new Label("Score: 0");

        // Create the time label
        timeLabel = new Label("Time: 0:00");

        // Create the restart button
        restartButton = new Button("Restart");

        // Create the bottom pane for score, time, and restart button
        HBox bottomPane = new HBox(20, scoreLabel, timeLabel, restartButton);


        // Create the root pane for the scene



        cardsPane.setPadding(new javafx.geometry.Insets(10,10,10,10));
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                card = new Card(new Image("file:src/main/resources/fr/miniprojet3/miniprojet3/images/dos-carte-s10-hearthstone.jpg"));
                cardView = new CardView(card);
                cardsPane.add(cardView, i, j);
            }
        }


        borderPane.setCenter(cardsPane);
        borderPane.setBottom(bottomPane);
        bottomPane.setAlignment(Pos.CENTER);

        StackPane rootPane = new StackPane(borderPane);

        // Create the scene and set the root pane
        Scene scene = new Scene(rootPane, 600, 600);

        // Set the title of the window
        primaryStage.setTitle("Memory Game");

        // Set the scene to the primary stage
        primaryStage.setScene(scene);

        // Show the window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }



}
