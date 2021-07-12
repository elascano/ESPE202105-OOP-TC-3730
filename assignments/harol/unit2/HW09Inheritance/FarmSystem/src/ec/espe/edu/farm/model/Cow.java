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
public class Cow extends FarmAnimal {

    boolean isProducingMilk;
    float hornSize;
    boolean cowIsMooing;
    String milkQuality;

    public Cow(int id, String breed, Date bornOn, boolean isProducingMilk, float hornSize, boolean cowIsMooing,String milkQuality) {
        super(id, breed, bornOn);
        this.hornSize = hornSize;
        this.cowIsMooing = cowIsMooing;
        this.milkQuality = milkQuality;
        
    }

    @Override
    public String toString() {

        //return "Chicken{"+ super.toString() + "isMolting=" + isMolting + '}';
        return "Cow{id=" + getId() + ", breed=" + getBreed() + ", bornOn=" + 
                getBornOn() + ", isProducingMilk=" + isProducingMilk + ",HornSize=" 
                + hornSize + ",cowIsMooing=" + cowIsMooing + ", milkQuality=" + milkQuality + '}';
    }

    public String calculateApproximateHornWeight(float hornSize) {
        float hornWeigth = hornSize / 7;
        String resultHornWeight = "The weight of the horn is " + hornWeigth + " Kg";
        return resultHornWeight;
    }

    public String mooing(boolean isMooing) {
        if (isMooing == true) {
            String cowMooing = "The Cow is Mooing";
            return cowMooing;
        } else {
            String cowNotMooing = "The Cow is`nt Mooing";
            return cowNotMooing;
        }

    }
    public String checkIfItGivesMilk(boolean giveMilk){
          if (giveMilk == true) {
            String already = "The cow is ready to give milk";
            return already;
        } else {
            String notYey = "The cow is not ready to give milk";
            return notYey ;
        }
        
    }
}
