/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.model;

import java.util.Date;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class Pig extends FarmAnimal{
    private float weight;

    public Pig(float weight, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" + "weight=" + weight + '}';
    }

    @Override
    public void feed(int amount) {
        System.out.println("feeding the pig whit" + amount + "units of pig food");
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void vaccinate(int NumberOfVaccines) {
        System.out.println("");
    }
    
}
