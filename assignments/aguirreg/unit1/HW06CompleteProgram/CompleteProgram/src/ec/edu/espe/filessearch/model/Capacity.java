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
public class Capacity {
    private int space;
    private char letter;

    @Override
    public String toString() {
        return "Capacity{" + "space=" + space + ", letter=" + letter + '}';
    }

    /**
     * @return the space
     */
    public int getSpace() {
        return space;
    }

    /**
     * @param space the space to set
     */
    public void setSpace(int space) {
        this.space = space;
    }

    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }
    
}
