/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.model;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class Resistor {
    private String name;
    private String type;
    private int uno;
    
    public Resistor(String name, String type, int uno){
        this.name = name;
        this.type = type;
        this.uno = uno;
        
    }

    @Override
    public String toString() {
        return "Resistor{" + "name=" + name + ", type=" + type + ", uno=" + uno + '}';
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
     * @return the uno
     */
    public int getUno() {
        return uno;
    }

    /**
     * @param uno the uno to set
     */
    public void setUno(int uno) {
        this.uno = uno;
    }



   
    
    
    
}
