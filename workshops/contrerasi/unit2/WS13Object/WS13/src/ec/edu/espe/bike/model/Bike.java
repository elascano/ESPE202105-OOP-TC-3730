/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bike.model;

/**
 *
 * @author Ian Contreras LAMES ESPE-DCCO
 */
public class Bike {
    private String size;
    private String colour;
    private String type;

    public Bike(String size, String colour, String type) {
        this.size = size;
        this.colour = colour;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bike{" + "size=" + size + ", colour=" + colour + ", type=" + type + '}';
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
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

    
}
