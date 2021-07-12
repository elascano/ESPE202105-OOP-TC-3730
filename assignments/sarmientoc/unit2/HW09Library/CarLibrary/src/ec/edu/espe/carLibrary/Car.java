/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.carLibrary;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class Car {
    
    private String color;
    private String type;
    private String brand;
    private String model;
    private int year;
    
    
    
  

    @Override
    public String toString() {
        return "Car{" + "color=" + getColor() + ", type=" + getType() + ", brand=" + getBrand() + ", model=" + getModel() + ", year=" + getYear() + '}';
    }

    
    
    
    public Car(String color, String type, String brand, String model, int year) {
        this.color = color;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.year = year;
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

 
    
}
