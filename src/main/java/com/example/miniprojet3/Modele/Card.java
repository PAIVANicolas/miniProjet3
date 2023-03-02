package com.example.miniprojet3.Modele;

import javafx.scene.image.Image;

public class Card {

    private Image image;
    private Image backImage;
    private boolean isTurn;
    private boolean isMatch;


    public Card(Image image) {
        this.image = image;
        this.backImage = new Image("file:", 240,240,false, false);

        isTurn = false;
        isMatch = false;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image getBackImage() {
        return backImage;
    }

    public void setBackImage(Image backImage) {
        this.backImage = backImage;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

    public boolean isMatch() {
        return isMatch;
    }

    public void setMatch(boolean match) {
        isMatch = match;
    }
}
