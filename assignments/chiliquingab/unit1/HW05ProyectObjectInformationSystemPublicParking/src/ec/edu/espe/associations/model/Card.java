/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Card {
    private float value;
    private float balance;
    private char Id_card;
    
    public void pay(){
        
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * @return the balance
     */
    public float getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * @return the Id_card
     */
    public char getId_card() {
        return Id_card;
    }

    /**
     * @param Id_card the Id_card to set
     */
    public void setId_card(char Id_card) {
        this.Id_card = Id_card;
    }
}
