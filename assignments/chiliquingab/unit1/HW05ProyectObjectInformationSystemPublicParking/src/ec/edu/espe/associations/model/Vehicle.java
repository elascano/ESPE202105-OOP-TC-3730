/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Vehicle {
    private char licence_plate;
    private char vehicle_type;
    
    public void enter(){
        
    }

    /**
     * @return the licence_plate
     */
    public char getLicence_plate() {
        return licence_plate;
    }

    /**
     * @param licence_plate the licence_plate to set
     */
    public void setLicence_plate(char licence_plate) {
        this.licence_plate = licence_plate;
    }

    /**
     * @return the vehicle_type
     */
    public char getVehicle_type() {
        return vehicle_type;
    }

    /**
     * @param vehicle_type the vehicle_type to set
     */
    public void setVehicle_type(char vehicle_type) {
        this.vehicle_type = vehicle_type;
    }
}
