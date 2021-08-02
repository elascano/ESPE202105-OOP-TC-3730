/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.model;

import java.util.Date;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class Pig extends FarmAnimal {
    private String ham;

    public Pig(int id, String breed, Date born0n, String ham) {
        super(id, breed, born0n);
        this.ham= ham;
    }

    @Override
    public String toString() {
        return "Pig{" + super.toString() + "ham" +ham+ '}';
    }

    /**
     * @return the ham
     */
    public String getHam() {
        return ham;
    }

    /**
     * @param ham the ham to set
     */
    public void setHam(String ham) {
        this.ham = ham;
    }
    
}
