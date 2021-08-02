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
public class CatController implements IAnimal{
    
    
    @Override
    public Sound makeSound(int time) {
        Sound sound = new Sound();
        System.out.println("a Cat Meaws for" + time + "second");
        return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println("cat is eating " + amount + "pieces of chicken");
       }

    @Override
    public Location move(float dx, float dy) {
       Location location = new Location(dx, dy);
        System.out.println("the Cat is walking ti " + dx + "," +dy);
        return location;
    
    }
    
}

    

