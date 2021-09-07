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
public class Ticket {

    private double price;
    private String code;
    private String checkInTime;
    private String departureTime;

    public Ticket(double price, String code, String checkInTime, String departureTime) {
        this.price = price;
        this.code = code;
        this.checkInTime = checkInTime;
        this.departureTime = departureTime;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
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

}
