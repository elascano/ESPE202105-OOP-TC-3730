/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abs.model;

import java.util.ArrayList;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCC0
 */
public class C {
    private ArrayList<H> hs = new ArrayList<>();
    public void m(F f){
        System.out.println("inside method m of class C receiving an F -> " + f);
    }
    
    public float m(float f){
        float result;
        result = f*5.0F;
        return result;
    }
    
    public C(ArrayList<H> hs) {
        this.hs = hs;
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
