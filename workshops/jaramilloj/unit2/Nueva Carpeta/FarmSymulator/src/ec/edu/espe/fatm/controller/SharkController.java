/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fatm.controller;

import ec.edu.espe.fatm.model.Location;
import ec.edu.espe.fatm.model.Sound;

/**
 *
 * @author Jean Jaramillo
 */
public class SharkController implements IAnimal {
    @Override
    public Sound makeSound(int time) {
        Sound sound = new Sound();
        System.out.println("shark barking for"  + time +  " second");
        return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println("Shark is eating "  + amount +  "fish");
       }
    
    @Override
    public Location move(float dx, float dy) {
       Location location = new Location(dx, dy);
        System.out.println("the Shark is swiming to " + dx + "," +dy);
        return location;
    
    }
    
}

    

