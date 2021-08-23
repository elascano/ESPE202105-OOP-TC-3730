/** Copyright ESPE-DECC
 */
package ec.edu.espe.farm.controller;

import ec.edu.espe.farm.model.Location;
import ec.edu.espe.farm.model.Sound;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class DogController implements IAnimal {

    @Override
    public Sound makeSound(int time) {
        Sound sound = new Sound();
        System.out.println(" barking for " + time + " seconds");
        return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println("dog is eating " + amount + " crockets");
    }

    @Override
    public Location move(int dx, int dy) {
        Location location = new Location(dx, dy);
        System.out.println("the dog is walking to " + dx + " , " + dy);
        return location;
    }
}