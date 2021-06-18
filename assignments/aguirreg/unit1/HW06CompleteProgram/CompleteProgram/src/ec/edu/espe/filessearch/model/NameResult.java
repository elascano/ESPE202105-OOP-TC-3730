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
public class NameResult {
    private int numbers;
    private String letters;

    @Override
    public String toString() {
        return "NameResult{" + "numbers=" + numbers + ", letters=" + letters + '}';
    }

    /**
     * @return the numbers
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * @param numbers the numbers to set
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
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
    
}
