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
public class Chicken extends FarmAnimal {

    boolean isMolting;
    int averageNumberOfEggsPerDay;
    String featherQuality;
    boolean isClucking;
    

    public Chicken(int id, String breed, Date bornOn, boolean isMolting, 
            int averageNumberOfEggsPerDay,String featherQuality,  boolean isClucking) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.averageNumberOfEggsPerDay = averageNumberOfEggsPerDay;
        this.featherQuality = featherQuality;
        this.isClucking = isClucking;

    }

    

    @Override
    public String toString() {
        //String localBreed = breed;
        //return "Chicken{"+ super.toString() + "isMolting=" + isMolting + '}';
        return "Chicken{id=" + getId() + ", breed=" + getBreed() + ", bornOn=" +
                getBornOn() + ", isMolting=" + isMolting +", averageNumberOfEggsPerDay="
                +averageNumberOfEggsPerDay+", featherQuality="+featherQuality+", isClucking=" + isClucking+'}';
    }

    public String layEgg(boolean egg) {
        if (egg == true) {
            String layAnEgg = "The Chicken is laying an egg";
            return layAnEgg;

        } else {
            String notLayAnEgg = "The Chicken is`nt laying an egg";
            return notLayAnEgg;
        }
    }
    public float flightDistance(float weightInGrams){
        float distance = weightInGrams/850 * 30;
        return distance;
    }
   public String Cluck(int hourOfDay){
    
        if ( hourOfDay>4 && hourOfDay<10) {
            String clucking = "The Chicken is crowing very loud";
            return clucking;

        } else {
            String notClucking = "The Chicken is not clucking";
            return notClucking;
        }
   }
}
