/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmer.model;

import java.util.Date;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class Sheep extends FarmAnimal{
 
    private Date lastSheering;

    public Sheep(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    

    
    @Override
    public String toString() {
        return "Sheep{" + "lastSheering=" + lastSheering + '}';
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
