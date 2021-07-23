/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Abstract.model;

import java.util.ArrayList;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class E extends B{
private float p;        
private float q;   

public int m1(boolean b){
    int result = 0;
    if(b){
        result=1;
    }
    return result;
}
@Override
    public int operation1(int n) {
        int result;
        result = n*10;
        return result;
    }

    @Override
    public float operation2(float f) {
        float result;
        result= f / 10.0F;
        return result;
    }
    
      
    @Override
    public String toString() {
        return "E{" + super.toString() +"p=" + p + ", q=" + q + '}';
    }


    public E(float p, float q, float f, double d, ArrayList<G> gs) {
        super(f, d, gs);
        this.p = p;
        this.q = q;
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
