package com.example.miniprojet3.View;


import com.example.miniprojet3.Controleur.CardController;
import com.example.miniprojet3.Modele.Card;
import com.example.miniprojet3.View.CardView;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * Cette classe représente la vue du jeu Memory Game.
 * Elle gère l'affichage des cartes, le score, le temps et le bouton de redémarrage.
 * @author Nicolas Paiva
 */

public class MemoryGameView extends Application {
    private Card card;
    private CardView cardView;

    /**
     * Retourne la map associant chaque carte à son contrôleur.
     * @return La map associant chaque carte à son contrôleur.
     */
    public Map<Card, CardController> getCardControllerMap() {
        return cardControllerMap;
    }
    /**
     * Définit la map associant chaque carte à son contrôleur.
     * @param cardControllerMap La map associant chaque carte à son contrôleur.
     */
    public void setCardControllerMap(Map<Card, CardController> cardControllerMap) {
        this.cardControllerMap = cardControllerMap;
    }

    private Map<Card, CardController> cardControllerMap = new HashMap<>();

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


        ObservableList<Card> cardClick = FXCollections.observableArrayList(new ArrayList<Card>());



        cardsPane.setPadding(new javafx.geometry.Insets(10,10,10,10));

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if((i+j)%2==0){
                    card = new Card(new Image("file:src/main/resources/images/frontCard1.jpeg"));
                }else{
                    card = new Card(new Image("file:src/main/resources/images/frontCard2.jpeg"));
                }

                cardView = new CardView(card);

                cardsPane.add(cardView, i, j);
                cardView = new CardView(card);
                CardController cardController = new CardController(card,cardView);
                cardView.setOnMouseClicked(event -> {
                    cardController.onCarteClick();
                });
                cardControllerMap.put(card, cardController);
                cardsPane.add(cardView, i, j);
            }
        }
        EventHandler<MouseEvent> eventHandler = event -> {
            CardView carteCliquee = (CardView) event.getSource();
            System.out.println("Etape1");
            cardClick.add(carteCliquee.getCard());
        };
        for (int i = 0; i < cardsPane.getChildren().size(); i++) {
            CardView carteVue = (CardView) cardsPane.getChildren().get(i);
            Card card = carteVue.getCard();
            carteVue.addEventHandler(MouseEvent.MOUSE_PRESSED, eventHandler);
        }
        cardClick.addListener((ListChangeListener<? super Card>) change -> {
            System.out.println(cardClick.get(0).getBackImage().getUrl());
        });




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
