/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abc.model;

import java.util.ArrayList;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class D extends A {
    private ArrayList<E> Es = new ArrayList<>();

    /**
     * @return the Es
     */
    public ArrayList<E> getEs() {
        return Es;
    }

    /**
     * @param Es the Es to set
     */
    public void setEs(ArrayList<E> Es) {
        this.Es = Es;
    }

    public D() {
    }

    @Override
    public String toString() {
        return "D{" + "Es=" + Es + '}';
    }


}
