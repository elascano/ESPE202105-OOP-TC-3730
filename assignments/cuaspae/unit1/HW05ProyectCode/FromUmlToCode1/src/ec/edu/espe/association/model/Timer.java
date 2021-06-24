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
public class Timer {
    private float time;
    private String rate;
    
    public void count(){
    }

    /**
     * @return the time
     */
    public float getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(float time) {
        this.time = time;
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
    
}
