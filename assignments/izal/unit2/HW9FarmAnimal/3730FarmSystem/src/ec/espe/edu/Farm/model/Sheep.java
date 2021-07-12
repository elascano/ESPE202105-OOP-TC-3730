/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Farm.model;

import java.util.Date;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class Sheep extends FarmAnimal {
    private boolean isMolting;

    public Sheep(int id, String breed, Date bornOn, boolean isMolting) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        return "Sheep{" +super.toString()+ "lastSheeping=" + isIsMolting() + '}';
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
