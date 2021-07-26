/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.controller;

import ec.edu.espe.farm.model.Location;
import ec.edu.espe.farm.model.Sound;

/**
 *
 *  @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class DogController implements IAnimal{
    
    
     
    
    @Override
    public Sound makeSound(int time) {
        Sound sound = new Sound();
        System.out.println("balking for " + time + "Seconds");
        return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println("dog is eating " + amount + "crocket");
        
    }

    @Override
    public Location move(int dx, int dy) {
        Location location = new Location(dx, dy);
        System.out.println("The dog is walking to " + dx + " , " + "dy");
        return location;
    }

   
    
    
}
