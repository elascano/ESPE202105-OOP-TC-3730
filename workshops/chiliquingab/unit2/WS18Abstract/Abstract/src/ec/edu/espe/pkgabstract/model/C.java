/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pkgabstract.model;

import java.util.ArrayList;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class C {

    private ArrayList<H> hs; // Needs completing 1,5

    public C(ArrayList<H> hs) { //2
        this.hs = hs;
    }

    @Override //1
    public String toString() {
        return "C{" + "hs=" + hs + '}';
    }

    public static void m(F f) { // Methods to complete 1


    }

    public static float m(float f) { //Needs completing 1


        return f;
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() { //1
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) { //1
        this.hs = hs;
    }
}
