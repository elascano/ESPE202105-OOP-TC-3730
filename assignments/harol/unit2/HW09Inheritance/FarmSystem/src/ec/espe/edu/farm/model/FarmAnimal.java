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
public class FarmAnimal {

    private int id;
    protected String breed;
    private Date bornOn;

    public FarmAnimal(int id, String breed, Date bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getBornOn() {
        return bornOn;
    }

    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    public int getAgeInMonths(Date dateBorn) {
        Date actualBorn;
        actualBorn = new Date();
        int monthActual = actualBorn.getMonth() + 1;
        int actualYear = actualBorn.getYear() + 1900;
        int monthCalculation = (actualYear * 12) - ((dateBorn.getYear() + 1900) * 12);
        int ageInMonths = monthCalculation + monthActual - (dateBorn.getMonth() + 1);
        return ageInMonths;
    }

}
