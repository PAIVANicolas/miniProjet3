package com.example.miniprojet3.Modele;

import javafx.scene.image.Image;

/**
 * Classe représentant une carte de jeu.
 * Cette classe contient une image de la face cachée et de la face visible de la carte,
 * ainsi qu'un booléen indiquant si la carte est retournée ou non.
 * @author Nicolas Paiva
 */
public class Card {
    private Image image;
    private Image frontImage;
    private boolean isTurn;


    /**
     * Constructeur de la classe Card.
     * Crée une nouvelle instance de la classe Card avec une image de la face cachée par défaut et une image de la face visible passée en paramètre.
     * @param image Image de la face visible de la carte.
     * @author Nicolas Paiva
     */
    public Card(Image image) {
        this.image = new Image("file:src/main/resources/fr/miniprojet3/miniprojet3/images/back.jpeg", 240,240,false, false);
        isTurn = false;
        this.frontImage = image;
    }

    /**
     * Getter pour l'image de la face visible de la carte.
     * @return Image de la face visible de la carte.
     * @author Nicolas Paiva
     */
    public Image getFrontImage() {
        return frontImage;
    }

    /**
     * Getter pour l'image de la carte.
     * @return Image de la carte.
     * @author Nicolas Paiva
     */
    public Image getImage() {
        return image;
    }

    /**
     * Getter pour l'image de la face cachée de la carte.
     * @return Image de la face cachée de la carte.
     * @author Nicolas Paiva
     * */
    public Image getBackImage() {
        return image;
    }

    /**
     * Setter pour l'image de la carte.
     * @param image Image à utiliser pour la carte.
     * @author Nicolas Paiva
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * Getter pour le booléen indiquant si la carte est retournée ou non.
     * @return true si la carte est retournée, false sinon.
     * @author Nicolas Paiva
     */
    public boolean isTurn() {
        return isTurn;
    }

    /**
     * Setter pour le booléen indiquant si la carte est retournée ou non.
     * @param turn true si la carte est retournée, false sinon.
     * @author Nicolas Paiva
     */
    public void setTurn(boolean turn) {
        isTurn = turn;
    }

}
