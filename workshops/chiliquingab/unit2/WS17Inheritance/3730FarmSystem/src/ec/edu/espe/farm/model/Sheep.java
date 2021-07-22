/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Sheep extends FarmAnimal{
    private Date lastSheering;

    @Override
    public String toString() {
        return "Sheep{" + super.toString() + ", lastSheering=" + lastSheering + '}' + "\n";
    }

    public Sheep(int id, String breed, Date bornOn, Date lastSheering) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
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

    @Override
    public void feed(int amount) {
        
    }

    @Override
    public void vaccinate(int numberOfVaccines) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
