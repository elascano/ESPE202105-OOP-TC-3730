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
public class Client {
    private int identification_card;
    private char name;
    private char lastName;
    
    public void use_service(){
        
    }

    /**
     * @return the identification_card
     */
    public int getIdentification_card() {
        return identification_card;
    }

    /**
     * @param identification_card the identification_card to set
     */
    public void setIdentification_card(int identification_card) {
        this.identification_card = identification_card;
    }

    /**
     * @return the name
     */
    public char getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(char name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public char getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(char lastName) {
        this.lastName = lastName;
    }
}
