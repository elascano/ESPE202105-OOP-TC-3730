/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructors.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Model {
    private int number;
    private String letter;

    @Override
    public String toString() {
        return "Model{" + "number=" + number + ", letter=" + letter + '}';
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the letter
     */
    public String getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(String letter) {
        this.letter = letter;
    }
    
    
}
