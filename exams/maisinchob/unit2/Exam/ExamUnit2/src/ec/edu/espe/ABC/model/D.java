/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ABC.model;

import java.util.ArrayList;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class D extends A{ //0.2
    private ArrayList<E> es = new ArrayList<>(); //0.2

    public D() {
    }

    @Override
    public String toString() {
        return "D{" + "es=" + es + '}';
    }

    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
    
    
    
    
}
