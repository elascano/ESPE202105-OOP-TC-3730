/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinCriollo.publicParking.model;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class Ticket {
    private double price;
    private int code;

    @Override
    public String toString() {
        return  "\n price=" + getPrice() + "\n  code=" + getCode() ;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }
    
    
  
    
}
