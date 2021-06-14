/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.skynet.model;

import java.util.ArrayList;

/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class Lines {
    private int i;
    private programing b;
    private ArrayList<System> cs = new ArrayList<>();

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @return the b
     */
    public programing getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(programing b) {
        this.b = b;
    }

    /**
     * @return the cs
     */
    public ArrayList<System> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<System> cs) {
        this.cs = cs;
    }

    @Override
    public String toString() {
        return "Estudent{" + "i=" + i + ", b=" + b + ", cs=" + cs + '}';
    }
    
    
}
