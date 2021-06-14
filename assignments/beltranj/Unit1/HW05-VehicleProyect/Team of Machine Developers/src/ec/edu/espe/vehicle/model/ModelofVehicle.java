/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.model;
import java.util.ArrayList; 
/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class ModelofVehicle {
    private String name;
    private String color;
    private String shape;
    private ArrayList<Brand> brand = new ArrayList<>();

    @Override
    public String toString() {
        return "ModelofVehicle{" + "name=" + name + ", color=" + color + ", shape=" + shape + ", brand=" + brand + '}';
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
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * @param shape the shape to set
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * @return the brand
     */
    public ArrayList<Brand> getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(ArrayList<Brand> brand) {
        this.brand = brand;
    }
    
    
}
