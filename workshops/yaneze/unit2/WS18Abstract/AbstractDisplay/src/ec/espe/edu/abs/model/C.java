/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abs.model;

import java.util.ArrayList;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class C {
    private ArrayList<H> hs = new ArrayList<>();
    public void m(F f){
        
    }

    
    
    
    
    @Override
    public String toString() {
        return "C{" + "hs=" + hs + '}';
    }

    
    
    //constructor
    public C() {
    }
    
    
    
    
    
    public float m(float f){
        return f;
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }
         
    
    
}