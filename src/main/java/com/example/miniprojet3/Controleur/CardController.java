package com.example.miniprojet3.Controleur;

import com.example.miniprojet3.Modele.Card;
import com.example.miniprojet3.View.CardView;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class CardController  {

    private Card card;
    private ImageView imageView;
    private CardView cardView;

    public CardController(Card carte, ImageView imageView, CardView cardView) {
        this.imageView = imageView;
        this.card = card;
        this.cardView = cardView;
    }

    @FXML
    public void onCarteClick() {
        if(!card.isTurn()){
            System.out.println("Carte cliquée, carte : " + card.isTurn());
            this.returnCard(cardView);
        }else {
            card.setTurn(false);
            System.out.println("Carte déjà retournée");
        }
        System.out.println("Carte cliquée, carte : " + card.isTurn());

        System.out.println("Carte cliquée, carte : " + card.isTurn());
    }


    public CardController getCarteController() {
        return this;
    }

    public void returnCard(CardView imageView) {
        imageView.setImage(card.getImage());
        card.setTurn(true);
    }


}
