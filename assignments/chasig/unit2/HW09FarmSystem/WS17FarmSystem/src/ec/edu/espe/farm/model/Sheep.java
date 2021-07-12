/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Sheep extends FarmAnimal{
    private Date lastSheering;

    
    

    @Override
    public String toString() {
        return "Sheep{"+ super.toString() + "lastSheering=" + getLastSheering() + '}';
    }

    public Sheep(Date lastSheering, int id, String breed, Date bornOn) {
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
}
