/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractquiz.model;

import java.util.ArrayList;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public abstract class B {
    private float f;
    private double d;
    private ArrayList<G> gs=new ArrayList<>();
    
    public abstract int operation1(int n);
    public abstract float operation2(float f);

    public B(float f, double d, ArrayList<G> gs) {
        this.f = f;
        this.d = d;
        this.gs=gs;
    }

    @Override
    public String toString() {
        return "B{" + "f=" + f + ", d=" + d + ", gs=" + gs + '}';
    }

    /**
     * @return the f
     */
    public float getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(float f) {
        this.f = f;
    }

    /**
     * @return the d
     */
    public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }

    /**
     * @return the gs
     */
    public ArrayList<G> getGs() {
        return gs;
    }

    /**
     * @param gs the gs to set
     */
    public void setGs(ArrayList<G> gs) {
        this.gs = gs;
    }
    
    
    
}
