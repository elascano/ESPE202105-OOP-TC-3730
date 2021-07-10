/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Farm.model;

import java.util.Date;

/**
 *
 * @author user
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;
  

    public Chicken(int id, String breed, Date bornOn, boolean isMolting) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        
        
    }

    public Chicken(boolean isNolting, boolean isMolting, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isNolting;
        this.isMolting = isMolting;
        
        
    }

    @Override
    public String toString() {
        return "Chicken{" + "isMolting=" + isMolting + ", isMolting=" + isMolting + '}';
    }

    /**
     * @return the isNolting
     */
    public boolean isIsNolting() {
        return isMolting;
    }

    /**
     * @param isNolting the isNolting to set
     */
    public void setIsNolting(boolean isNolting) {
        this.isMolting = isNolting;
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
    
}
