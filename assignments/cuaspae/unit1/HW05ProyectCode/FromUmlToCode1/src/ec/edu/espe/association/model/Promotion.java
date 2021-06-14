/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.association.model;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Promotion {
    private String nameOfThePromotion;
    private String rate;
    private int timeOfThePromotion;
   
    public void timeOfThePromotion(){
    } 

    /**
     * @return the nameOfThePromotion
     */
    public String getNameOfThePromotion() {
        return nameOfThePromotion;
    }

    /**
     * @param nameOfThePromotion the nameOfThePromotion to set
     */
    public void setNameOfThePromotion(String nameOfThePromotion) {
        this.nameOfThePromotion = nameOfThePromotion;
    }

    /**
     * @return the rate
     */
    public String getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /**
     * @return the timeOfThePromotion
     */
    public int getTimeOfThePromotion() {
        return timeOfThePromotion;
    }

    /**
     * @param timeOfThePromotion the timeOfThePromotion to set
     */
    public void setTimeOfThePromotion(int timeOfThePromotion) {
        this.timeOfThePromotion = timeOfThePromotion;
    }
    
}
