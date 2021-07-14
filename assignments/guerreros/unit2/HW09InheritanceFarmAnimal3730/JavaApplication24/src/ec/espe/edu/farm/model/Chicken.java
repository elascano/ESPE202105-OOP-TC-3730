/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.model;



/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
    
    
public class Chicken extends FarmAnimal {
    private boolean isMolting;

    public Chicken( int id, String breed, int year, int month, int day, boolean isMolting) {
        super(id, breed, year, month, day);
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
    
}
    
    