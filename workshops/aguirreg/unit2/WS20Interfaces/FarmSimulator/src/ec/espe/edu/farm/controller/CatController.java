/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.controller;

import ec.espe.edu.farm.model.Location;
import ec.espe.edu.farm.model.Sound;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class CatController implements IAnimal {

    
    @Override
    public Sound makeSound(int time) {
        Sound sound = new Sound();
        System.out.println(" Meaw for " + time + " seconds");
        return sound;    
    }

    @Override
    public void eat(float amount) {
        System.out.println(" Cat is eating " + amount + " pieces chicken");
    }

    @Override
    public Location move(int dx, int dy) {
        Location location = new Location(dx, dy);
        System.out.println("The Cat is jumping "+ dx + " , " + dy );
        return location;
    }
    
}
