/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstracts.model;

import java.util.ArrayList;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class C {              //public void missing m
    private ArrayList<H> hs = new ArrayList<>();   //2
    
    public void m(F f){   //1
        
    }
    
    public float m(float f){    //1
        
        return f; 
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {    //1
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {     //1
        this.hs = hs;
    }

    public C() {  //1
    }

    @Override
    public String toString() {       //1
        return "C{" + "hs=" + hs + '}';
    }
    
    
}
