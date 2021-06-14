/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.model;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class Laptop {

    private String brand;
    private int memory;
    private String model;

    public Laptop() {
    }

    @Override
    public String toString() {
        return "Laptop{" + "brand=" + getBrand() + ", memory=" + getMemory() + ", model=" + getModel() + '}';
    }
    
   
    
    public Laptop (String brand, String model, int memory){
    this.brand=brand;
    this.memory=memory;
    this.model=model;
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

 }