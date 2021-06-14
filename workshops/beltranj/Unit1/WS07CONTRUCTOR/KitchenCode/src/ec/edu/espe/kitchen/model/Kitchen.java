/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.kitchen.model;

/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class Kitchen {
    private String model;
    private String colour;
    private String brand; 
    
    public Kitchen(String model, String colour, String brand){
        this.model= model;
        this.colour= colour;
        this.brand= brand;
        
        
    }

    @Override
    public String toString() {
        return "Kitchen{" + "model=" + model + ", colour=" + colour + ", brand=" + brand + '}';
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
}
