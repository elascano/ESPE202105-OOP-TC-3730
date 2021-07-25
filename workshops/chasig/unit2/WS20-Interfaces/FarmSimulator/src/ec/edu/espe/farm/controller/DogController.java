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
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class DogController implements IAnimal{
    private Sound sound;

    @Override
    public Sound MakeSound(int time) {
        System.out.println("Dog barking for" + time + "seconds"); 
        return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println(" dog is eating " + amount  + "crockets");   
    }

    @Override
    public Location move(int dx, int dy) {
        Location location = new Location(dx,dy);
        System.out.println("the dog is walking to" + dx + " , " + dy);
        return location;
    }
    
    
    
    
    
}
