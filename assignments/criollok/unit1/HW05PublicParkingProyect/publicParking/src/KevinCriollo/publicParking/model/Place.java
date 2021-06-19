/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinCriollo.publicParking.model;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class Place {
    private double area;
    private String street;
    private double distance;

    @Override
    public String toString() {
        return "\n area=" + getArea() + "\n  street=" +
                getStreet() + "\n  distance=" + getDistance() ;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    
    
  
        
    
}
