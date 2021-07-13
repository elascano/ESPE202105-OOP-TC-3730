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
public class Pig extends FarmAnimal{
    float weight;
    
    public Pig(int id, String breed, Date bornOn, float weight) {
        super(id, breed, bornOn);
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Pig{" + super.toString() + "weight=" + weight + '}';
    }
    
    
}
