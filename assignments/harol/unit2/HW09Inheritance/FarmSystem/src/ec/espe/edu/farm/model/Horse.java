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
public class Horse extends FarmAnimal {
float maneSize;
boolean isGalloping;
float weightToLoad;

    public Horse(int id, String breed, Date bornOn,float maneSize,boolean isGalloping,float weightToLoad) {
        super(id, breed, bornOn);
        this.maneSize= maneSize;
        this.isGalloping = isGalloping;
        this.weightToLoad=weightToLoad;
    }

    @Override
    public String toString() {

        //return "Chicken{"+ super.toString() + "isMolting=" + isMolting + '}';
        return "Horse{id=" + getId() + ", breed=" + getBreed() + ", bornOn="
                + getBornOn() + ",maneSize = "+ maneSize+",isGalloping="+isGalloping+",weightToLoad="+weightToLoad+  '}';
    }
public float calculateJumpDistance (float weightOfHorse){
    float jumpDistance = weightOfHorse/700 *20; 
    return jumpDistance;
}
public String neigh(boolean isNeighing){
         if (isNeighing== true) {
            String neigh= "The Horse is neoghing";
            return neigh;

        } else {
            String notIsNeighing = "The horse it's calm";
            return notIsNeighing;
        }
        }
public float calculateMaximumSpeed(float weightOfHorse){
    float maximumSpeed = weightOfHorse/700*88;
    return maximumSpeed;
}
}
