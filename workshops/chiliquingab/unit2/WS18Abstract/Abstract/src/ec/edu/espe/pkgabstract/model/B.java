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
public abstract class B { //1

    private float f; //1
    private double d; //1
    private ArrayList<G> gs = new ArrayList(); // 1

    public abstract void operation1(int n); // Es int no void, 0,8

    public abstract float operation2(float f); //1

    @Override //1
    public String toString() {
        return "B{" + "f=" + f + ", d=" + d + ", gs=" + gs + '}';
    }

    public B(float f, double d) { // falta completar el constructor 0,5
        this.f = f;
        this.d = d;
    }

    /**
     * @return the f
     */
    public float getF() { //2
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
