/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.model;


/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class Accessory {
    private int seat;
    private int mirror; 
    private int airconditioning;

    /**
     * @return the seat
     */
    public int getSeat() {
        return seat;
    }

    @Override
    public String toString() {
        return "Accessory{" + "seat=" + seat + ", mirror=" + mirror + ", airconditioning=" + airconditioning + '}';
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(int seat) {
        this.seat = seat;
    }

    /**
     * @return the mirror
     */
    public int getMirror() {
        return mirror;
    }

    /**
     * @param mirror the mirror to set
     */
    public void setMirror(int mirror) {
        this.mirror = mirror;
    }

    /**
     * @return the airconditioning
     */
    public int getAirconditioning() {
        return airconditioning;
    }

    /**
     * @param airconditioning the airconditioning to set
     */
    public void setAirconditioning(int airconditioning) {
        this.airconditioning = airconditioning;
    }


}
