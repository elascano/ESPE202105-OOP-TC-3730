/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ObjectSneaker.model;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class Sneakers {
    private String color;
    private String type;
    private String model;
    private String made;
    private String destination;
    private int size;
    private String quality;

    public Sneakers(String color, String type, String model, String made, String destination, int size, String quality) {
        this.color = color;
        this.type = type;
        this.model = model;
        this.made = made;
        this.destination = destination;
        this.size = size;
        this.quality = quality;
    }

    

    
    @Override
    public String toString() {
        return "Sneakers{" + "color=" + color + ", type=" + type + ", model=" + model + ", made=" + made + ", destination=" + destination + ", size=" + size + ", quality=" + quality + '}';
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

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
     * @return the made
     */
    public String getMade() {
        return made;
    }

    /**
     * @param made the made to set
     */
    public void setMade(String made) {
        this.made = made;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the quality
     */
    public String getQuality() {
        return quality;
    }

    /**
     * @param quality the quality to set
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }
    
}
