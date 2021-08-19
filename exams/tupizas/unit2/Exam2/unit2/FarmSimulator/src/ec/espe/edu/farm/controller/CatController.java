/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.controller;

import ec.edu.espe.farsimulator.model.Location;
import ec.edu.espe.farsimulator.model.Sound;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class CatController implements IAnimal{
     @Override
    public Sound makeSound(int time) {
        Sound sound = new Sound();
        System.out.println(" Meaw for " + time + " second ");
        return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println("cat is eating" + amount + "pieces of chicken");
        
    }

    @Override
    public Location move(int x, int y) {
        Location location = new Location(x, y); 
        System.out.println(" the cat jumps to" + x + " , " + y );
        return location;
    }
   
}
