/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Abstract.model;

import java.util.ArrayList;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class E extends B {
    private float p;
    private float q;
    
    public int m1(boolean b){
        
        
        int result = 0;
        if(b){
            result = 1; 
        }
        return result;
    }

    public E(float p, float q, float f, double d, ArrayList<G> gs) {
        super(f, d, gs);
        this.p = p;
        this.q = q;
    }

    @Override
    public String toString() {
        return "E{" + super.toString() +"p=" + p + ", q=" + q + '}';
    }
    
    
    
    /**
     * @return the p
     */
    public float getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(float p) {
        this.p = p;
    }

    /**
     * @return the q
     */
    public float getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(float q) {
        this.q = q;
    }

    @Override
    public int operation1(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float operation2(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
