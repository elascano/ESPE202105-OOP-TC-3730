/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.djcontroler.model;

/**
 *
 * @author Alexander Pachacama BUILDER ESPE-DCC0
 */
public class Controller {
    private int audiochannel;
    private String brand;
    private String model;
    private String color;

    @Override
    public String toString() {
        return "controller{" + "audiochannel=" + audiochannel + ", brand=" + brand + ", model=" + model + ", color=" + color + '}';
    }
    
 
 public Controller( int audiochannel,String brand, String model,String color) {
        this.brand = brand;
        this.audiochannel = audiochannel;
        this.model = model;
        this.color = color;
}

    /**
     * @return the audiochannel
     */
    public int getAudiochannel() {
        return audiochannel;
    }

    /**
     * @param audiochannel the audiochannel to set
     */
    public void setAudiochannel(int audiochannel) {
        this.audiochannel = audiochannel;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}

