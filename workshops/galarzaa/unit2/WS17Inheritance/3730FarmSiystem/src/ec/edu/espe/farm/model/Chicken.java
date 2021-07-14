/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Chicken extends FarmAnimal{
    private boolean isMolthing;

    public Chicken(int id, String breed, Date bornOn, boolean isMolthing) {
        super(id, breed, bornOn);
        this.isMolthing = isMolthing;
           
    }

    @Override
    public String toString() {
        return "Chicken{" + super.toString()+"isMolthing=" + isMolthing + '}';
    }

    /**
     * @return the isMolthing
     */
    public boolean isIsMolthing() {
        return isMolthing;
    }

    /**
     * @param isMolthing the isMolthing to set
     */
    public void setIsMolthing(boolean isMolthing) {
        this.isMolthing = isMolthing;
    }
    
}
