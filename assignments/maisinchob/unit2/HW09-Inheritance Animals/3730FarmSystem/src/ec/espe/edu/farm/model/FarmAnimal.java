/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.model;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class FarmAnimal {
    private int id;
    private String breed;
    private Date bornOn;
    
    
      
    
    
    
    public int getAgeInMonths(int day, int month, int year){
        //TODO Compute the age in months
        Calendar start = Calendar.getInstance();
        start.set(year, month-1, day);
        Calendar current = Calendar.getInstance();
       
        
        return getBornOn().getMonth();
    }

    
    
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the bornOn
     */
    public Date getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    public FarmAnimal(int id, String breed, Date bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + getId() + ", breed=" + getBreed() + ", bornOn=" + getBornOn() + '}';
    }
    
    
    
}
