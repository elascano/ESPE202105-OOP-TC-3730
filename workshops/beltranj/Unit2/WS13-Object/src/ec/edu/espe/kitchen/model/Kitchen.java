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
    private int id;
    private String brand;
    private String color;

    public Kitchen(int id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Kitchen{" + "id=" + id + ", brand=" + brand + ", color=" + color + '}';
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
        

 

}


