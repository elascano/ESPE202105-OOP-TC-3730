/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.model;

import java.util.Date;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class Cow extends FarmAnimal{
    private boolean isProducesMilk;

    public Cow(int id, String breed, Date bornOn, boolean isProducesMilk) {
        super(id, breed, bornOn);
        this.isProducesMilk = isProducesMilk;
    }

    @Override
    public String toString() {
        return "Cow{" + super.toString()+ "isProducingMilk=" + isIsProducesMilk() + '}';
    }

    /**
     * @return the isProducesMilk
     */
    public boolean isIsProducesMilk() {
        return isProducesMilk;
    }

    /**
     * @param isProducesMilk the isProducesMilk to set
     */
    public void setIsProducesMilk(boolean isProducesMilk) {
        this.isProducesMilk = isProducesMilk;
    }

}


