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

    private ArrayList<H> hs;

    public C(ArrayList<H> hs) {
        this.hs = hs;
    }

    @Override
    public String toString() {
        return "C{" + "hs=" + hs + '}';
    }

    public static void m(F f) {

    }

    public static float m(float f) {

        return f;
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
