/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.laptop.model;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class Laptop {
   private String brand;
    private int memory;
    private String model;
    private String color;

    public Laptop() {
    }

    @Override
    public String toString() {
        return "Laptop{" + "brand=" + getBrand() + ", memory=" + getMemory() + ", model=" + getModel() + ", color=" + getColor() + '}';
    }

    public Laptop(String brand, int memory, String model,String color) {
        this.brand = brand;
        this.memory = memory;
        this.model = model;
        this.color = color;
    }

    public Laptop (String brand, String model, int memory, String color){
    this.brand=brand;
    this.memory=memory;
    this.model=model;
    this.color=color;
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
     * @return the memory
     */
    public int getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public void setMemory(int memory) {
        this.memory = memory;
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
