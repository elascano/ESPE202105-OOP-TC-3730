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
public class Direction {
    
    private String tex;
    private int number;

    @Override
    public String toString() {
        return "Direction{" + "tex=" + tex + ", number=" + number + '}';
    }
 
    
    /**
     * @return the tex
     */
    public String getTex() {
        return tex;
    }

    /**
     * @param tex the tex to set
     */
    public void setTex(String tex) {
        this.tex = tex;
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
    
    
}
