package com.example.miniprojet3.Modele;

import javafx.scene.image.Image;

public class Card {
    private Image image;
    private boolean isTurn;


    public Card(Image image) {
        this.image = new Image("file:", 240,240,false, false);
        isTurn = false;
    }

    public Image getImage() {
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
