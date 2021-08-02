/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Code.model;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class H {
    
    private H h;

    public H(H h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "H{" + "h=" + h + '}';
    }
   

    /**
     * @return the h
     */
    public H getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(H h) {
        this.h = h;
    }
    
    
}
