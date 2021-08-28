/** Copyright ESPE-DECC
*/

package ec.edu.espe.farm.controller;

import ec.edu.espe.farm.model.Location;
import ec.edu.espe.farm.model.Sound;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class CatController implements IAnimal{
    @Override
    public Sound makeSound(int time) {
        Sound sound = new Sound();
        System.out.println(" a Cat meaws for " + time + " seconds");
        return sound;
    }

    @Override
    public void eat(float amount) {
        System.out.println("dog is eating " + amount + " pieces of chicken");
    }

    @Override
    public Location move(int dx, int dy) {
        Location location = new Location(dx, dy);
        System.out.println("the dog jumps to " + dx + " , " + dy);
        return location;
    }
}
