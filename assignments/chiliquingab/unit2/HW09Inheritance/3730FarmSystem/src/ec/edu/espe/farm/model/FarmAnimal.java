/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FarmAnimal {

    private int id;
    private String breed;
    private Date bornOn;

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn;
    }

    public FarmAnimal(int id, String breed, Date bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    public static int calculaAnos(int dia, int mes, int ano) {
        Date actual = new Date();

        int diaActual = actual.getDate();
        int mesActual = actual.getMonth() + 1;
        int anoActual = actual.getYear() + 1900;

        int diferencia = anoActual - ano;

        if (mesActual <= mes) {
            if (mesActual == mes) {
                if (dia > diaActual) {
                    diferencia--;
                }
            } else {
                diferencia--;
            }
        }
        return diferencia;
    }

    public int getAgeInMonths(int dia, int mes, int ano) {
        //TODO Compute the age in months
        Calendar inicio = Calendar.getInstance();
        inicio.set(ano, mes - 1, dia);

        Calendar actual = Calendar.getInstance();

        int anos_diferencia = calculaAnos(dia, mes, ano);

        int meses = (anos_diferencia * 12) + (actual.get(Calendar.MONTH) - inicio.get(Calendar.MONTH));

        if (actual.get(Calendar.DATE) < dia) {
            meses--;
        }
        return meses;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the bornOn
     */
    public Date getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

}
