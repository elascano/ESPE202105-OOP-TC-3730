/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.headphones.model;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Headphones {
    private String brand;
    private String color;
    private String type;

    public Headphones(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "headphones{" + "brand=" + brand + ", color=" + color + ", type=" + type + '}';
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
