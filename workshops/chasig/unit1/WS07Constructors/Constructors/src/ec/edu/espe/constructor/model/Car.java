/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.model;
/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Car {
  private String name; 
  private String model;
  private String colour; 


    public Car(String name, String model ,String colour) {
      this. name  = name;
      this .model = model;      
      this .colour = colour;
  
    }
    
    @Override 
    
    public String toString(){
        return "Car("+ ", name=" + name +  ", model=" + model + ", colour=" +colour +')';
        
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
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
     
    }