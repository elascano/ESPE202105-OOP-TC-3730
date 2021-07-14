/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abs.model;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class E extends B {//1
    private float p;//1
    private float q;//1
    
    public int m1(int i){//0
        return 0;
    }

    @Override
    public String toString() {
        return "E{" + super.toString() + "p=" + p + ", q=" + q + '}';
    }

    //2
    
    //constructor
    public E(float p, float q) {//0
        //incomplete constructor
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

    @Override
    public int operation1(int n) {//1
        System.out.println("The int is -> " + n);
        return n;
    }

    @Override
    public float operation2(float f) {//1
        System.out.println("The float is -> " + f);
        return f;
    }

}
