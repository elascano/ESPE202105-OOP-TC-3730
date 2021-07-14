/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstracts.model;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class E {
   private float p; 
   private float q; 

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

    public E(float p, float q) {
        this.p = p;
        this.q = q;
    }

    @Override
    public String toString() {
        return "E{" + "p=" + p + ", q=" + q + '}';
    }
   
   
}
