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
public class Cow extends FarmAnimal{
    private String milk;

    public Cow(int id, String breed, Date born0n, String milk) {
        super(id, breed, born0n);
        this.milk=milk;
    }

    @Override
    public String toString() {
        return "Cow{" + super.toString()  +"milk->" + milk +'}';
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
