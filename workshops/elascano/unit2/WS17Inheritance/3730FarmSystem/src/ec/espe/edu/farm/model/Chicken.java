/** Copyright ESPE-DECC
*/

package ec.espe.edu.farm.model;

import java.util.Date;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;
  
    public Chicken(int id, String breed, Date bornOn, boolean isMolting) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }
    

    @Override
    public String toString() {
        return "Chicken{" + super.toString() + ", isMolting=" + isMolting + '}';
    }
    
    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    @Override
    public void feed(int amount) {
        System.out.println("feeding the chicken ->"  + getId() + " with " + amount + " onzes of grains");
    }

    @Override
    public void vaccinate(int numberOfVaccines) {
        System.out.println("vaccinating the chicken with " + numberOfVaccines);
    }
    

}
