/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abstraction.model;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class E extends B{
    
    private float p;
    private float q;

    public E(float f, double d) {
        super(f, d);
    }
    
    public int m1(boolean b){
        return 0;
        
    }

    public E(float p, float q, float f, double d) {
        super(f, d);
        this.p = p;
        this.q = q;
    }

    @Override
    public String toString() {
        return "E{" +super.toString()+ "p=" + getP() + ", q=" + getQ() + '}';
    }

    
    @Override
    public int operation1(int n) {
        System.out.println("Hello");
        return 0;
    }

    @Override
    public float operation2(float f) {
        System.out.println("Hello");
        return 0;
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
