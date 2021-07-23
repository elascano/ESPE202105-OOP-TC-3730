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
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class SharkController implements IAnimal{
  @Override
    public Sound makeSound(int time) {
        Sound sound = new Sound ();
        System.out.println(" shatk is barking for " + time + " seconds");
        return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println(" Shark is eating " + amount + " fish ");
    }

    @Override
    public Location move(int dx, int dy) {
        Location location = new Location (dx, dy);
        System.out.println(" the shark is swiming to " + dx + "," + dy);
        return location;
    }      
}
