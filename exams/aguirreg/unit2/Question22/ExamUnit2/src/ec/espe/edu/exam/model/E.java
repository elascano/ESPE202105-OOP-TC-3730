/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.exam.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class E {
    private float p;
    private float q;

    public E(float f, float f0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public E(float f, float f0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public E(float f, float f0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public E(float f, float f0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int m1(int i){
        return 0;
    }

    @Override
    public String toString() {
        return "E{" + super.toString() + "p=" + p + ", q=" + q + '}';
    }

    
    //constructor
    public E(float p, float q) {
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

    public int operation1(int n) {
        System.out.println("The int is -> " + n);
        return n;
    }

    public float operation2(float f) {
        System.out.println("The float is -> " + f);
        return f;
    }

}

