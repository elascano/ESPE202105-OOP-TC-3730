/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Abstract.model;

import java.util.ArrayList;

/**
 *
 * @author Alexander Pachacama BUILDER ESPE-DCCO
 */
public class C {
    private ArrayList<H> hs = new ArrayList<>();
    
    public void m(F f){    
    }
    public float m(float f){
    return f;
    }
    
    public C() {
    }
    
    @Override
    public String toString() {
        return "C{" + "hs=" + hs + '}';
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
   
