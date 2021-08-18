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
public class Car {

    private String mark;
    private String licensePlate;
    private String color;
    private Observation observation;

    public Car(String mark, String licensePlate, String color, Observation observation) {
        this.mark = mark;
        this.licensePlate = licensePlate;
        this.color = color;
        this.observation = observation;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
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
     * @return the observation
     */
    public Observation getObservation() {
        return observation;
    }

    /**
     * @param observation the observation to set
     */
    public void setObservation(Observation observation) {
        this.observation = observation;
    }

}
