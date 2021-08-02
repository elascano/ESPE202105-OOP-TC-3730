/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.code.model;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class B {
 private H h;



    public B(H h) {
        this.h = h;
    }
 
    
        @Override
    public String toString() {
        return "B{" + "h=" + getH() + '}';
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
