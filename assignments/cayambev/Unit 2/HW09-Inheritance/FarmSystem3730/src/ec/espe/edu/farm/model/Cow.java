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
public class Cow extends FarmAnimal {
    private String milk;

    @Override
    public String toString() {
        return "Cow{" + "milk=" + milk + '}';
    }

    public Cow(String milk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.milk = milk;
    }

    /**
     * @return the milk
     */
    public String getMilk() {
        return milk;
    }

    /**
     * @param milk the milk to set
     */
    public void setMilk(String milk) {
        this.milk = milk;
    }
    
}
