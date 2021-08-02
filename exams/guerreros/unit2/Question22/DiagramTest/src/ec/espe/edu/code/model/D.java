/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.code.model;

import java.util.ArrayList;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class D {
    
    private F f;
   private ArrayList<F> fs = new ArrayList<>();
   private ArrayList<E> es =new ArrayList<>();

    public D(F f) {
        this.f = f;
    }

    /**
     * @return the f
     */
    public F getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(F f) {
        this.f = f;
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
