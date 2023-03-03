package com.example.miniprojet3.Modele;

import javafx.scene.image.Image;

public class Card {
    private Image image;
    private Image frontImage;
    private boolean isTurn;


    public Card(Image image) {
        this.image = new Image("file:src/main/resources/fr/miniprojet3/miniprojet3/images/back.jpeg", 240,240,false, false);
        isTurn = false;
        this.frontImage = image;
    }
    public Image getFrontImage() {
        return frontImage;
    }

    public Image getImage() {
        return image;
    }

    public Image getBackImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

}
