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
public class Sheep extends FarmAnimal{
    private String wool;

    public Sheep(int id, String breed, Date born0n, String wool) {
        super(id, breed, born0n);
        this.wool=wool;
    }

    @Override
    public String toString() {
        return "Sheep{" + super.toString()  + "wool->"+wool+ '}';
    }

    /**
     * @return the wool
     */
    public String getWool() {
        return wool;
    }

    /**
     * @param wool the wool to set
     */
    public void setWool(String wool) {
        this.wool = wool;
    }
}
