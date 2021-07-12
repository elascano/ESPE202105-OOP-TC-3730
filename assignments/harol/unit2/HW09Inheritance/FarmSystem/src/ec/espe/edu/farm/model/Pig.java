/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.model;

import java.util.Date;

/**
 *
 * @author  Luis Haro LAMESTech ESPE-DCC0
 */
public class Pig extends FarmAnimal {
   
    String hamQuality;
    float amountOfHamItProduces;
    float quiantityOfBacon;
    
    public Pig(int id, String breed, Date bornOn,String hamQuality, float amountOfHamItProduces,float quiantityOfBacon ) {
        super(id, breed, bornOn);
        this.hamQuality = hamQuality;
        this.amountOfHamItProduces =amountOfHamItProduces;
        this.quiantityOfBacon= quiantityOfBacon;
    }
     @Override
    public String toString() {
     
        //return "Chicken{"+ super.toString() + "isMolting=" + isMolting + '}';
        return "Pig{id=" + getId() + ", breed=" + getBreed() + ", bornOn=" + 
                getBornOn() + ", hamQuality=" +  hamQuality+ 
                ",amountOfHamItProduces ="+ amountOfHamItProduces+",quiantityOfBacon="+quiantityOfBacon+'}';
        
    }
    public String eatGarbage(boolean isHungry){
   
        if(isHungry == true){
            String isEating = "The pig is Eating garbage";
          return isEating;
        }else{
            String isNotEating = "The pig is not Hungry";
            return isNotEating;
        }
    }
    public float calclulatePriceHam(float weightOfHam){
        float priceHam = weightOfHam *15;
        return priceHam;
        
    }
    public float calculatePriceBacon(float weightOfBaconInGrams){
        float priceBacon = (float) (weightOfBaconInGrams * 1.5);
        return priceBacon;
    }
}
