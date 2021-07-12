/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Alexander Pachacama BUILDER ESPE-DCC0
 */
    public class Pig extends FarmAnimal{
    public Pig(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    /**
     *
     * @return 
     */
    

    @Override
    public String toString() {
        return "Pig{" + super.toString() + '}';
    }


}

