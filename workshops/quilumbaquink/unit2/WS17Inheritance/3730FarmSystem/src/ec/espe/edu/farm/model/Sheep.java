/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.model;

import java.util.Date;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class Sheep extends FarmAnimal {
    String color;
    
    public Sheep(int id, String breed, Date bornOn, String color) {
        super(id, breed, bornOn);
        this.color= color;
    }

    @Override
    public String toString() {
        return "Sheep{" + super.toString() + "color=" + color + '}';
    }
    
}
