/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Estefania
 */
public class C { //1
    private ArrayList<H> hs = new ArrayList<>(); //1
    
    public void m(F f){ //1
       
}
    public float m(float f){ 
    return 0;
}
     //0 the function does not return the correct thing

    public C() { //1
    }

    @Override
    public String toString() { //1
        return "C{" + "hs=" + hs + '}';
    }

  

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() { //1
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) { //1
        this.hs = hs;
    }
    
}