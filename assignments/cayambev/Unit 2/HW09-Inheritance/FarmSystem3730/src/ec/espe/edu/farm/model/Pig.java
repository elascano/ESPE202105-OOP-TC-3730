/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.model;

import java.util.Date;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class Pig extends FarmAnimal {
    private String SmokedProducts;

    /**
     * @return the SmokedProducts
     */
    public String getSmokedProducts() {
        return SmokedProducts;
    }

    public Pig(String SmokedProducts, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.SmokedProducts = SmokedProducts;
    }

    @Override
    public String toString() {
        return "Pig{" + super.toString() +  "SmokedProducts=" + SmokedProducts + '}';
    }

    /**
     * @param SmokedProducts the SmokedProducts to set
     */
    public void setSmokedProducts(String SmokedProducts) {
        this.SmokedProducts = SmokedProducts;
    }
}
