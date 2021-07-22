/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;

    public Chicken(int id, String breed, Date bornOn, boolean isMolting) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        
    }
    
    

    @Override
    public String toString() {
        return "Chicken{" + super.toString() + "isMolting=" + isMolting + '}';
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    @Override
    public void feed(int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       // System.out.println("feeding the chicken ->")
    }
    
    
    
}
