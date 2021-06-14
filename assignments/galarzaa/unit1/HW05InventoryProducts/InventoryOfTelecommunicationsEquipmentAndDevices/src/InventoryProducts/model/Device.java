/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventoryProducts.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Device {
   private String name;
   private String type;
   private String model;
   private float price;
   
   public void searchType(ArrayList<Device> devices){
        
    }
   public void searchName(ArrayList<Device> devices){
        
    }
    public void searchModel(ArrayList<Device> devices){
        
    }
    
    @Override
    public String toString() {
        return "Device{" + "name=" + name + ", type=" + type + ", model=" + model + ", price=" + price + '}';
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
}
