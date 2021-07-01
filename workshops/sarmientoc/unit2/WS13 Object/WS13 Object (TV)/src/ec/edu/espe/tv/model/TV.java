/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tv.model;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class TV {
    private String color;
    private int size;
    private String brand;
    private int price;
    private String softwareType;
    
    
    
    
    
    

    @Override
    public String toString() {
        return "TV{" + "color=" + getColor() + ", size=" + getSize() + ", brand=" + getBrand() + ", price=" + getPrice() + ", softwareType=" + getSoftwareType() + '}';
    }
    
    
    
    

    public TV(String color, int size, String brand, int price, String softwareType) {
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.price = price;
        this.softwareType = softwareType;
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
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the softwareType
     */
    public String getSoftwareType() {
        return softwareType;
    }

    /**
     * @param softwareType the softwareType to set
     */
    public void setSoftwareType(String softwareType) {
        this.softwareType = softwareType;
    }
    
    
    
    
    
}

 
  
    
    
