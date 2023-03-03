package com.example.miniprojet3.View;

import com.example.miniprojet3.Modele.Card;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CardView extends ImageView {

    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public CardView(Card card) {
        super(card.getImage());
        this.card = card;
        this.card.setImage(new Image("file:src/main/resources/images/back.jpeg"));
        this.setFitWidth(90);
        this.setFitHeight(150);
        this.setImage(this.card.getImage());

    }

    public void showFront(){
        System.out.println(card.getFrontImage().getUrl());
        this.setImage(card.getFrontImage());
    }

    public void showBack(){
        System.out.println(card.getBackImage().getUrl());
        this.setImage(card.getBackImage());
    }

}