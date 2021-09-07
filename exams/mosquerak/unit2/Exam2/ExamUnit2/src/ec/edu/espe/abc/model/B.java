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
public class  B extends A {                //0.4
     private ArrayList<H> Hs = new ArrayList<>();  //0.4

    /**
     * @return the Hs
     */
    public ArrayList<H> getHs() {                 //0
        return Hs;
    }

    /**
     * @param Hs the Hs to set
     */
    public void setHs(ArrayList<H> Hs) {
        this.Hs = Hs;
    }
}
