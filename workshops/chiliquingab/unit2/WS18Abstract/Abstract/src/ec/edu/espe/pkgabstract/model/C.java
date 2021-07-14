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
public class C extends B{

    private ArrayList<H> hs;

    public C(float f, double d) {
        super(f, d);
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

    @Override
    public void operation1(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float operation2(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
