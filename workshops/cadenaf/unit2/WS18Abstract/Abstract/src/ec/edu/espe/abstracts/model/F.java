/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstracts.model;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class F {       // The don’t have the method  
   private String r; 

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

    public F(String r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "F{" + "r=" + r + '}';
    }
   
   
}
