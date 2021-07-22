/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farmSystem.model;

import java.util.Date;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Pig extends FarmAnimal{

    private float weight;

    public Pig(int id, String breed, Date borOn, float weight) {
        super(id, breed, borOn);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" +super.toString()+ "weight=" + weight + '}';
    }
    
    
    
 

    @Override
    public void feed(int amount) {

        System.out.println("Feedin the Pig with -> " + amount + "of pig food");
        
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
    public void vaccinate(int numberOfVacciones) {
        System.out.println("Vacinnating Pig -> " + numberOfVacciones);

    }
   
    
    
}
