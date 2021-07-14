/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.modell;

import ec.edu.espe.farmsystem.controller.FarmAnimal;
import java.util.Date;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */

    public class Cow extends FarmAnimal{
    
    private boolean isProducingMilk;

    public Cow(int id, String breed, Date bornOn, boolean isProducingMilk) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        return "Pig{" + super.toString() + "isProducingMilk=" + isProducingMilk + '}';
    }

    /**
     * @return the isMolting
     */
    public boolean isProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isMolting to set
     */
    public void setisProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }
    
    
}
