/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LizethTaco.constructor.model;

/**
 *
 * @author user
 */
public class Calculator {
    
    private String model;
    private String functions;
    private String color;

    public Calculator(String model, String functions, String color) {
        this.model = model;
        this.functions = functions;
        this.color = color;
    }
    
    

    @Override
    public String toString() {
        return "Calculator{" + "model=" + model + ", functions=" + functions + ", color=" + color + '}';
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
     * @return the functions
     */
    public String getFunctions() {
        return functions;
    }

    /**
     * @param functions the functions to set
     */
    public void setFunctions(String functions) {
        this.functions = functions;
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
