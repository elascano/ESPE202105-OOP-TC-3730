/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.washingmachine;

/**
 *
 * @author Estefania
 */
public class Features {
    
    private String color;
    private String brand;
    private String size;
    private int capacity;
    private int cycles;

    @Override
    public String toString() {
        return "Features{" + "color=" + color + ", brand=" + brand + ", size=" + size + ", capacity=" + capacity + ", cycles=" + cycles + '}';
    }

    public Features(String color, String brand, String size, int capacity, int cycles) {
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.capacity = capacity;
        this.cycles = cycles;
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
     * @return the cycles
     */
    public int getCycles() {
        return cycles;
    }

    /**
     * @param cycles the cycles to set
     */
    public void setCycles(int cycles) {
        this.cycles = cycles;
    }

    
}
