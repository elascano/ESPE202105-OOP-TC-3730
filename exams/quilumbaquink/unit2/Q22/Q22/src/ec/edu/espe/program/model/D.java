/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.program.model;

import java.util.ArrayList;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class D extends A {  //0.2
    private F f;    //0  No private E
    private ArrayList<E> es=new ArrayList<>();  //0   No Arraylist F

    @Override
    public String toString() {
        return "D{" + "f=" + f + ", es=" + es + '}';
    }

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
