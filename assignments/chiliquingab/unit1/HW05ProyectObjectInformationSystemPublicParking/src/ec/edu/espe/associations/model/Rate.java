/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Rate {
    private int rate_code;
    private int rate_type;
    
    public void payment(){
        
    }

    /**
     * @return the rate_code
     */
    public int getRate_code() {
        return rate_code;
    }

    /**
     * @param rate_code the rate_code to set
     */
    public void setRate_code(int rate_code) {
        this.rate_code = rate_code;
    }

    /**
     * @return the rate_type
     */
    public int getRate_type() {
        return rate_type;
    }

    /**
     * @param rate_type the rate_type to set
     */
    public void setRate_type(int rate_type) {
        this.rate_type = rate_type;
    }
    
}
