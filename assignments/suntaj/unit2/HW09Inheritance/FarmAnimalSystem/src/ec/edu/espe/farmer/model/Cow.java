/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmer.model;

import java.util.Date;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */

public class Cow extends FarmAnimal{

    private String isProducingMilk;

    public Cow(String isProducingMilk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        return "Cow{" + "isProducingMilk=" + isProducingMilk + '}';
    }

    /**
     * @return the isProducingMilk
     */
    public String getIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(String isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }
    
    
}
