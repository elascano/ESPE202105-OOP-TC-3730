/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.model;

import java.util.Date;



/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Sheep extends FarmAnimal {
    private Date lastSheering;

    public Sheep( int id, String breed, int year, int month, int day , Date lastSheering) {
        super(id, breed, year, month, day);
        this.lastSheering = lastSheering;
    }
  

    @Override
    public String toString() {
        return "Sheep{" + super.toString() + "lastSheering=" + lastSheering + '}';
    }

    /**
     * @return the lastSheering
     */
    public Date getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(Date lastSheering) {
        this.lastSheering = lastSheering;
    }
}
