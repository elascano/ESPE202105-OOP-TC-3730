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
    private ArrayList<H> hs = new ArrayList<>();//2
    public void m(F f){//2
        
    }

    
    
    
    
    @Override
    public String toString() {//2
        return "C{" + "hs=" + hs + '}';
    }

    
    
    //constructor
    public C() {//0.5
        //incomplete constructor
    }
    
    
    
    
    
    public float m(float f){//2
        return f;
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {//1
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {//1
        this.hs = hs;
    }
         
    
    
}
