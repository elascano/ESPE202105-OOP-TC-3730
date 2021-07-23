/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractClasses.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class E extends B{ //1
    
    private float p; //1
    private float q; //1
    
    public static int m1(boolean b){ // 0 // Incomplete operation
        
        return m1(b); 
             
    }

    public E(float f, double d, ArrayList<G> gs) { //0 // Incomplete operation
        super(f, d, gs);
    }

    @Override
    public void operation1(int n) { //0  // Incomplete operation
        System.out.println(n);
        
                
    }

    @Override
    public void operation2(float f) {  //0 // Incomplete operation
        System.out.println(f);
    }

    public E(float p, float q, float f, double d, ArrayList<G> gs) {  //1
        super(f, d, gs);
        this.p = p;
        this.q = q;
    }

    @Override 
    public String toString() { //1 
        return "E{" +super.toString() + "p=" + getP() + ", q=" + getQ() + '}';
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
    
    
    
    
}
