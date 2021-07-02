/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JosselynSigcha.car.model;

/**
 *
 * @author Asus
 */
public class Car {
    private String color;
    private String brand;
    private int year;
    private String type;
    private String model;

    @Override
    public String toString() {
        return "Car{" + "color=" + color + ", brand=" + brand + ", year=" + year + ", type=" + type + ", model=" + model + '}';
    }

    public Car(String color, String brand, int year, String type, String model) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.type = type;
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

    public char[] toJSONString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
