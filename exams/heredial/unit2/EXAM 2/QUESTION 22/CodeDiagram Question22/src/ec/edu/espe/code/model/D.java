/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.code.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class D extends A{
    
    private ArrayList<F> fs = new ArrayList<>();
    private ArrayList<E> es = new ArrayList<>(5);

    public D(ArrayList<F> fs ) {
        
    }

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

    public ArrayList<E> getEs() {
        return es;
    }

    public void setEs(ArrayList<E> es) {
        this.es = es;
    }

    
    
    
  
    

    
    
    
    
}
