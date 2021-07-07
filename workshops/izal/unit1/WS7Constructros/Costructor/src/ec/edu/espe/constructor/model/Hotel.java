/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.model;

/**
 *
 * @author LILIAN IZA TOUR GUEST OPP-ESPE
 */
public class Hotel {  
        private String name;
        private String location;
        private int number  ;
        
        
    public Hotel(String name, String location, int number) {
        
        this.name = name;
        this.location = location;
        this.number = number;
         
    }

    @Override
    public String toString() {
        return "Hotel{" + "name=" + name + ", location=" + location + ", number=" + number + '}';
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
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
}