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
public class Invoice {

    private float cost;
    private String departureTime;
    private String checkInTime;

    public Invoice(float cost, String departureTime, String checkInTime) {
        this.cost = cost;
        this.departureTime = departureTime;
        this.checkInTime = checkInTime;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * @return the checkInTime
     */
    public String getCheckInTime() {
        return checkInTime;
    }

    /**
     * @param checkInTime the checkInTime to set
     */
    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

}
