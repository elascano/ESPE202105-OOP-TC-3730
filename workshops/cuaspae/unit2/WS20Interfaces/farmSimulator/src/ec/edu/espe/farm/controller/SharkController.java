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
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class SharkController implements IAnimal {
    @Override
    public Sound makeSound(int time) {
        Sound sound = new Sound();
        System.out.println("Shark is barking for " + time + " second ");
        return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println("Shark is eating " + amount + " crocket ");
    }

    @Override
    public Location move(int dx, int dy ) {
        Location location = new Location (dx, dy);
        System.out.println("The Shark is swiming to " +  dx + " , " + dy );
        return location;
    }
    
}
