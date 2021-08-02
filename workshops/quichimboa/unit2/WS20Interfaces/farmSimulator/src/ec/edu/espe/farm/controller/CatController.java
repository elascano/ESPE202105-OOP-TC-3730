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
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class CatController implements IAnimal{
    @Override
    public Sound makeSound(int time) {
        Sound sound = new Sound();
        System.out.println(" Meaw for " + time + " Seconds ");
        return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println(" Cat is eating " + amount + " Chicken ");
          }

    @Override
    public Location move(int dx, int dy) {
        Location location = new Location(dx, dy);
        System.out.println(" The cat is jumping for " + dx + ", " +dy);
        return location;
       }
}
