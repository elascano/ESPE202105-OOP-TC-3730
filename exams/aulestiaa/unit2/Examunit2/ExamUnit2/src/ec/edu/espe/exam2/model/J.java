/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2.model;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class J { //0.8
    private String r;

    public J(String r) {
        this.r = r;
    }

    @Override
    public String toString() { //0.2
        return "J{" + "r=" + r + '}';
    }
    
    
    
    /**
     * @return the r
     */
    public String getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(String r) {
        this.r = r;
    }
    
   
    
}
