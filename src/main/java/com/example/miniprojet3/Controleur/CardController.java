package com.example.miniprojet3.Controleur;

import com.example.miniprojet3.Modele.Card;
import com.example.miniprojet3.View.CardView;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;


/**
 * Cette classe est responsable de contrôler la carte dans la vue.
 * Elle contient des méthodes pour retourner la carte et gérer les événements de clic sur la carte.
 * @author Nicolas Paiva
 */
public class CardController {

    private Card card;
    private ImageView imageView;
    private CardView cardView;

    /**
     * Constructeur de CardController
     * @param card objet carte
     * @param cardView vue carte
     */
    public CardController(Card card, CardView cardView) {
        this.card = card;
        this.cardView = cardView;
    }

    /**
     * Méthode qui gère l'événement de clic sur la carte
     */
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

     /** Renvoie le contrôleur de carte
      * @return contrôleur de carte
      */
    public CardController getCardController() {
        return this;
    }

    /**
     * Méthode qui retourne la carte
     * @param imageView vue de l'image de la carte
     */
    public void returnCard(CardView imageView) {
        if(card.isTurn()){
            imageView.showBack();
        }else if(!card.isTurn()){
            imageView.showFront();
        }
    }



}
