/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.productos.model;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Code {
    
    private String letters;
    private int numbre;

    @Override
    public String toString() {
        return "Code{" + "letters=" + letters + ", numbre=" + numbre + '}';
    }

    
    /**
     * @return the letters
     */
    public String getLetters() {
        return letters;
    }

    /**
     * @param letters the letters to set
     */
    public void setLetters(String letters) {
        this.letters = letters;
    }

    /**
     * @return the numbre
     */
    public int getNumbre() {
        return numbre;
    }

    /**
     * @param numbre the numbre to set
     */
    public void setNumbre(int numbre) {
        this.numbre = numbre;
    }
        
}
