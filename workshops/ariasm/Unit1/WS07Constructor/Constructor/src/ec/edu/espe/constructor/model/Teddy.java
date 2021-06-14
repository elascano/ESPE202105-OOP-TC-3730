/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.model;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class Teddy {
    private String name;
    private String colour;
    private String size;

    public Teddy(String name, String colour, String size) {
        this.name = name;
        this.colour = colour;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Teddy{" + "name=" + name + ", colour=" + colour + ", size=" + size + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
   
}
