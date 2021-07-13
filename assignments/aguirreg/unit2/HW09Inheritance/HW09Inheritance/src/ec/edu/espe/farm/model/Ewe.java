/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Ewe extends FarmAnimal{
    
    private Date lastSheering;

    public Ewe(int id, String breed, int day, int month, int year,Date lastSheering) {
        super(id, breed, day, month, year);
        this.lastSheering = lastSheering;
    }

     

    @Override
    public String toString() {
        return "Sheep{" + super.toString() +"lastSheering=" + lastSheering + '}';
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
