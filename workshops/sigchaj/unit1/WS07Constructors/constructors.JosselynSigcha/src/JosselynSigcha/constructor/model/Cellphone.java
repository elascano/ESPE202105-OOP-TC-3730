/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JosselynSigcha.constructor.model;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class Cellphone {
    private String model;
    private String color;
    private String brand;

    public Cellphone(String model, String color, String brand) {
        this.model = model;
        this.color = color;
        this.brand = brand;
    }


    
    

    @Override
    public String toString() {
        return "Cellphone{" + "model=" + model + ", color=" + color + ", brand=" + brand + '}';
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
