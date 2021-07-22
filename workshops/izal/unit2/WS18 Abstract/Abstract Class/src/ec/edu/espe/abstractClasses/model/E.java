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
/*MEMBERS: Luis Heredia, Lilian Iza, Jean Carlos Jarramillo*/
public class E extends B{
    
    private float p;
    private float q;
    
    public static int m1(boolean b){
        
        return m1(b);
             
    }

    public E(float f, double d, ArrayList<G> gs) {
        super(f, d, gs);
    }

    @Override
    public void operation1(int n) {
        System.out.println(n);
        
                
    }

    @Override
    public void operation2(float f) {
        System.out.println(f);
    }

    public E(float p, float q, float f, double d, ArrayList<G> gs) {
        super(f, d, gs);
        this.p = p;
        this.q = q;
    }

    @Override
    public String toString() {
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
