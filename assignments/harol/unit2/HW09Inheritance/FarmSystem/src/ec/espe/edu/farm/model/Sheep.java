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
public class Sheep extends FarmAnimal {

    Date lastSheering;
    String woolQuality;
    String woolColor;
    float woolQuantityingramsperyear;

    public Sheep(int id, String breed, Date bornOn, Date lastSheering, String woolQuality, String woolColor) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.woolColor = woolColor;
        this.woolQuality = woolQuality;

    }

    @Override
    public String toString() {
        return "Sheep{id=" + getId() + ", breed=" + getBreed() + ", bornOn=" + 
                getBornOn() + ", lastSheering=" +  lastSheering + 
                ",woolColor ="+  woolColor +",woolQuality="+woolQuality+'}';
    }

   

    public float calculateSheepWoolPerYear(float weihgtOfSheep) {
        float woolQuantityingramsperyear1 = weihgtOfSheep / 120 * 3;
        return woolQuantityingramsperyear1;
    }

    public Date calculateNextShear(Date lastSheering) {
        int dayLastSheering = lastSheering.getDay();
        int monthLastSheering = lastSheering.getMonth();
        int yearLastSheering = lastSheering.getYear();
        Date dateNextShear = new Date(yearLastSheering,monthLastSheering ,dayLastSheering+300);

        return  dateNextShear ;
    }
    public float calculateWoolPrice(float woolWeight){
        float priceWoolWeight = woolWeight /5 *6;
        return priceWoolWeight;
    }
    
}
