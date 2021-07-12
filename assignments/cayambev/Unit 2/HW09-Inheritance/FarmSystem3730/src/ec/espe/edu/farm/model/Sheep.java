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
public class Sheep extends FarmAnimal {
    private String wool;

    @Override
    public String toString() {
        return "Sheep{" + "wool=" + wool + '}';
    }

    public Sheep(String wool, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.wool = wool;
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
