/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.diagram.model;

import java.util.ArrayList;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class C extends A {
    
 private ArrayList<E> es = new ArrayList<>();

    public C(ArrayList<A> as, ArrayList<E> es) {
        super(as);
        this.es = es;
    }

    @Override
    public String toString() {
        return "C{" +super.toString()+ "es=" + getEs() + '}';
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
