/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mouse.model;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class Mouse {
    private String modelOfMouse;
    private int dpi;
    private int numberOfKeys;
    private String leds;
    private String fabricator;



    @Override
    public String toString() {
        return "Mouse{" + "modelOfMouse=" + modelOfMouse + ", dpi=" + dpi + ", numberOfKeys=" + numberOfKeys + ", leds=" + leds + ", fabricator=" + fabricator + '}';
    }

    public Mouse(String modelOfMouse, int dpi, int numberOfKeys, String leds, String fabricator) {
        this.modelOfMouse = modelOfMouse;
        this.dpi = dpi;
        this.numberOfKeys = numberOfKeys;
        this.leds = leds;
        this.fabricator = fabricator;
    }

    
    
    
    /**
     * @return the modelOfMouse
     */
    public String getModelOfMouse() {
        return modelOfMouse;
    }

    /**
     * @param modelOfMouse the modelOfMouse to set
     */
    public void setModelOfMouse(String modelOfMouse) {
        this.modelOfMouse = modelOfMouse;
    }

    /**
     * @return the dpi
     */
    public int getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    /**
     * @return the numberOfKeys
     */
    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    /**
     * @param numberOfKeys the numberOfKeys to set
     */
    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    /**
     * @return the leds
     */
    public String getLeds() {
        return leds;
    }

    /**
     * @param leds the leds to set
     */
    public void setLeds(String leds) {
        this.leds = leds;
    }

    /**
     * @return the fabricator
     */
    public String getFabricator() {
        return fabricator;
    }

    /**
     * @param fabricator the fabricator to set
     */
    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }
    
    
    
    
}
