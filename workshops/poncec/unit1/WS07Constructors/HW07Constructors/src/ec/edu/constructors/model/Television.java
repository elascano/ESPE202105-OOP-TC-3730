/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.constructors.model;

/**
 *
 * @author Camilo Ponce Program Builder ESPE-DCCO
 */
public class Television 
{
private String model;
private String color;
private int inches;


    public Television(String model, String color, int inches)
 
    {
        this.model=model;   
        this.color=color;
        this.inches=inches; 
          
    }
    
    @Override
    public String toString() {
        return "Television{" + "model=" + model + ", color=" + color + ", inches=" + inches + '}';
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
     * @return the inches
     */
    public int getInches() {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(int inches) {
        this.inches = inches;
    }



}
