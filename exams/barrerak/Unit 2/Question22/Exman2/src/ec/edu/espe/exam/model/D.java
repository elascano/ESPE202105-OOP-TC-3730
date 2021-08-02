/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

import java.util.ArrayList;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class D {
    private ArrayList<F> f = new ArrayList<>();
    private ArrayList<E> e = new ArrayList<>();

    @Override
    public String toString() {
        return "D{" + "f=" + f + ", e=" + e + '}';
    }

    public D() {
    }

    /**
     * @return the f
     */
    public ArrayList<F> getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(ArrayList<F> f) {
        this.f = f;
    }

    /**
     * @return the e
     */
    public ArrayList<E> getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(ArrayList<E> e) {
        this.e = e;
    }

 
    
}
