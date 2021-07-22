/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Abstract.model;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class F {
    private String r;
    // the class F is complete
    public F(String r) {
        this.r = r;
    } 

    @Override
    public String toString() {
        return "F{" + "r=" + r + '}';
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
