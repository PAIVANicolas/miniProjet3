package com.example.miniprojet3.View;

import com.example.miniprojet3.Modele.Card;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CardView extends ImageView {

    private Card card;

    public CardView(Card card){
        this.card = card;
        this.card.setImage(new Image("file:src/main/resources/images/th.jpeg"));
        this.setFitWidth(90);
        this.setFitHeight(150);

        this.setImage(this.card.getImage());

    }

}
