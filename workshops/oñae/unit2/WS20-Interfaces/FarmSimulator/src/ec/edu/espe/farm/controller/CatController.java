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
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class CatController implements IAnimal {

    private Sound sound;
  
    @Override
    public Sound makeSound(int time) {
       System.out.println(" a Cat meaws for " + time + "seconds");
       return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println("cat is creating " + amount + " pieces of chicken ");
    }

    @Override
    public Location move(int dx, int dy) {
        Location location = new Location(dx, dy);
        System.out.println(" the cat is jumps" + dx + "," + dy);
        return location;
                
    }

     
}
