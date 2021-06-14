/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filessearch.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Filter {
       private String word;
       private float number;

    @Override
    public String toString() {
        return "Filter{" + "word=" + word + ", number=" + number + '}';
    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return the number
     */
    public float getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(float number) {
        this.number = number;
    }
}
