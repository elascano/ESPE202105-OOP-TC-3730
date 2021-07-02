/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructors.model;

/**
 *
 * @author Ian Contreras LAMES ESPE-DCCO
 */

public class Cup {
    private String colour;
    private String shape;
    private String size;
    
    public Cup(String colour, String shape, String size) {
        this.colour = colour;
        this.shape = shape;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Cup(" + "colour=" + colour + ", shape=" + shape + ", size" + size + ")";
    }
    
    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }
    
    /**
     * @return the shape
     */
    public String getShape() {
        return shape;
    }
    
    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }
    }