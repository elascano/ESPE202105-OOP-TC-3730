/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pkgabstract.model;

import java.util.ArrayList;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public abstract class B {

    private float f;
    private double d;
    private ArrayList<G> gs = new ArrayList();

    public abstract void operation1(int n);

    public abstract float operation2(float f);

    @Override
    public String toString() {
        return "B{" + "f=" + f + ", d=" + d + ", gs=" + gs + '}';
    }

    public B(float f, double d) {
        this.f = f;
        this.d = d;
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
