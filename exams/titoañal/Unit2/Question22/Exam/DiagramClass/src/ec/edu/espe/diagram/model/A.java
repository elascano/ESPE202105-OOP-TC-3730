/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.diagram.model;

import java.util.ArrayList;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class A {
    private ArrayList<A> as = new ArrayList<>();

    public A(ArrayList<A> as) {
        this.as= as;
    }

    @Override
    public String toString() {
        return "A{" + "as=" + getAs() + '}';
    }

    /**
     * @return the as
     */
    public ArrayList<A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }
}    
    
