/** Copyright ESPE-DECC
*/

package ec.espe.edu.farm.model;

import java.util.Date;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class Pig extends FarmAnimal{
    private float weight;

    public Pig(float weight, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{"+ super.toString() + ", weight=" + weight + '}';
    }
    
    
    @Override
    public void feed(int amount) {
        System.out.println("feeding the pig with " + amount + " units of pig food");
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void vaccinate(int numberOfVaccines) {
        System.out.println(" The pig got " + numberOfVaccines);
    }

    
    
}
