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
public class B extends A { //0.4
    private ArrayList<H> hs = new ArrayList<>(); //0.20

    public B() {//0.10
    }

    @Override
    public String toString() {
        return "B{" + "hs=" + hs + '}';
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }
    
}
