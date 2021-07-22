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
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;

    public Cow(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public String toString() {
        return "Cow{" + super.toString()+ "isProducingMilk=" + isProducingMilk + '}';
    }

    public Cow(boolean isProducingMilk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }
}
    

