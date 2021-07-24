/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsimulator.controller;

import ec.edu.espe.farmsimulator.model.Location;
import ec.edu.espe.farmsimulator.model.Sound;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class SharkController implements IAnimal{

  @Override
    public Sound makeSound(int time) {
       Sound sound = new Sound();
        System.out.println("Shark is barking for" + time + "seconds");
        return sound;
    }
    

    @Override
    public void eat(float amount) {
        System.out.println("Dog is eating" + amount + "pieces of meat");  
    }

    @Override
    public Location move(int dx, int dy) {
        Location location = new Location(dx, dy);
        System.out.println("The dog  swimming to " + dx + " , " + dy );
        return location;
    }
  
   
}
