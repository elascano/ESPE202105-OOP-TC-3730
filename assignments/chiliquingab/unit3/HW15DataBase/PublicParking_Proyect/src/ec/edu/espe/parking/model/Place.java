/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.parking.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Place {

    private double position;
    private String street;
    private double distance;

    public Place(double position, String street, double distance) {
        this.position = position;
        this.street = street;
        this.distance = distance;
    }

    /**
     * @return the position
     */
    public double getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(double position) {
        this.position = position;
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
