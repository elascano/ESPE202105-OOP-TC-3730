/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.q22.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class B { //0.4
    private int H;
    
    private ArrayList<G> gs; //0.4
    private double d;

    public B(int H, ArrayList<G> gs, double d) {    //0.1
        this.H = H;
        this.gs = gs;
        this.d = d;
    }

    @Override
    public String toString() {
        return "B{" + "H=" + H + ", gs=" + gs + ", d=" + d + '}';
    }

    
    public B() {
    }

    /**
     * @return the H
     */
    public int getH() {
        return H;
    }

    /**
     * @param H the H to set
     */
    public void setH(int H) {
        this.H = H;
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
}
