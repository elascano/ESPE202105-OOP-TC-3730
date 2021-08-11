/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.examP2.model;

import java.util.ArrayList;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class D {
    private ArrayList<F> fs = new ArrayList<>();
    private ArrayList<E> es = new ArrayList<>();

    @Override
    public String toString() {
        return "D{" + "fs=" + fs + ", es=" + es + '}';
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }

    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
    
}