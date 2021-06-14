/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.association.model;

import java.util.ArrayList;

/**
 *
 * @author Alexander Pachacama BUILDER ESPE-DCC0
 */
public class Protecj {
    private int i;
    private Protecj b;
    private ArrayList<Enyti> cs = new ArrayList<>();
    
   
    public Enyti m(User d)
    {
        Enyti c = new Enyti ();
        return c;        
    }
    
        public User m()
        {
        User d = new User();
        return d;
        }

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
    public Protecj getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Protecj b) {
        this.b = b;
    }

    /**
     * @return the cs
     */
    public ArrayList<Enyti> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<Enyti> cs) {
        this.cs = cs;
    }
}
