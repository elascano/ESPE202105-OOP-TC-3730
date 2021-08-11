/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class FarmAnimal {
    private int id;
    private String breed;
    private Date born0n;
    
    public int getAgeInMonths(){ 
        //TODO Compute the age in months
        
        return getBorn0n().getMonth();
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", born0n=" + born0n + '}';
    }

    
    public FarmAnimal(int id, String breed, Date born0n) {
        this.id = id;
        this.breed = breed;
        this.born0n = born0n;
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
     * @return the born0n
     */
    public Date getBorn0n() {
        return born0n;
    }

    /**
     * @param born0n the born0n to set
     */
    public void setBorn0n(Date born0n) {
        this.born0n = born0n;
    } 
}
