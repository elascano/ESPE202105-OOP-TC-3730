/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farmSystem.model;

import java.util.Date;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Chicken extends FarmAnimal{
    
    private boolean isMolting;

    public Chicken(int id, String breed, Date borOn, boolean isMolting) {
        super(id, breed, borOn);
        this.isMolting = isMolting;
    }

    
    
            
    @Override
    public String toString() {
        return "Chicken{" + super.toString()+ "isMolting=" + isMolting + '}';
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
        
        System.out.println("Feeding the Chicken -> " + getId() +"With " + amount + "Onzes"); 
        
    }

    @Override
    public void vaccinate(int numberOfVacciones) {
        System.out.println("Vaccinating the chicken with" + numberOfVacciones);

    }
    
    
}
