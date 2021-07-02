/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.shoes.model;

/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class Shoes {
    private int size;
    private String brand;
    private String color;
    private float cost; 
    private String type;

    public Shoes(int size, String brand, String color, float cost, String type) {
        this.size = size;
        this.brand = brand;
        this.color = color;
        this.cost = cost;
        this.type = type;
    }

    
 

    @Override
    public String toString() {
        return "Shoes{" + "size=" + size + ", brand=" + brand + ", color=" + color + ", cost=" + cost + ", type=" + type + '}';
    }


    
    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
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
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
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
