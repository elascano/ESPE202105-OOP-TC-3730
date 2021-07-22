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
public abstract class FarmAnimal {
    
    private int id;
    private String breed;
    private Date borOn;

    public FarmAnimal(int id, String breed, Date borOn) {
        this.id = id;
        this.breed = breed;
        this.borOn = borOn;
    }
    public abstract void feed(int amount);
    public abstract void vaccinate(int numberOfVacciones);
    
    public int getAgeInMonths(){
        
        return getBorOn().getMonth();
    }
    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", borOn=" + borOn + '}';
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
     * @return the borOn
     */
    public Date getBorOn() {
        return borOn;
    }

    /**
     * @param borOn the borOn to set
     */
    public void setBorOn(Date borOn) {
        this.borOn = borOn;
    }
    
    
    
    
    
}
