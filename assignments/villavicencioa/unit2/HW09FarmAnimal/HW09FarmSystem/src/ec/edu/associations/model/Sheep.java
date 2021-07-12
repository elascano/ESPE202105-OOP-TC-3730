/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.model;

import java.util.Date;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Sheep extends FarmAnimal{
    private Date lastSheering;

    public Sheep(int id, String breed, Date bornOn, Date lastSheering) {
        super(id, breed, bornOn);
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
