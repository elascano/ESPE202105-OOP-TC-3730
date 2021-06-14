/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;


import java.util.ArrayList;

/**
 *
 * @author Camilo Ponce Program Builder ESPE-DCCO
 */
public class Name {
    private int i;
    private Age b;
    private ArrayList<Bonds> cs = new ArrayList<>();

 public Bonds m(Identification d){

     Bonds c = new Bonds ();
     return c; 
 }
    public Identification m ()
    {
    Identification d = new Identification();
    return d;
    }
    
    /**
     * @return the b
     */
    public Age getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Age b) {
        this.b = b;
    }

    /**
     * @return the cs
     */
    public ArrayList<Bonds> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<Bonds> cs) {
        this.cs = cs;
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
}
