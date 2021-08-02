/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FarmSimulator.controller;

import ec.edu.espe.FarmSimulator.modell.Location;
import ec.edu.espe.FarmSimulator.modell.Sound;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class SharkController implements IAnimal {
    
      @Override
    public Sound makeSound(int time) {
        Sound sound = new Sound();
        System.out.println("Braming for "+ time + " Seconds");
        return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println("Shark is eating " + amount + "Fish");
   }

    @Override
    public Location move(int dx, int dy) {
        Location location = new Location(dx , dy);
        System.out.println("The dog is swining to " + dx + " , " + dy);
        return location;
    }
    
}
