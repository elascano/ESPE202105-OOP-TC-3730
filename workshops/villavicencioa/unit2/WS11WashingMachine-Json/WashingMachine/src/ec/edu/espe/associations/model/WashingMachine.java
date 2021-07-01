/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class WashingMachine {
    private String color;
    private String brand;
    private int capacity;
    private float price;

    @Override
    public String toString() {
        return "WashingMachine{" + "color=" + getColor() + ", brand=" + getBrand() + ", capacity=" + getCapacity() + ", price=" + getPrice() + '}';
    }

    public WashingMachine(String color, String brand, int capacity, float price) {
        this.color = color;
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
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

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
