/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

import java.util.ArrayList;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class C extends A{ //0,4
    private ArrayList<E> es = new ArrayList<>();//0,4

    public C() { //0,0
    }

    @Override
    public String toString() {
        return "C{" + "es=" + es + '}';
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
