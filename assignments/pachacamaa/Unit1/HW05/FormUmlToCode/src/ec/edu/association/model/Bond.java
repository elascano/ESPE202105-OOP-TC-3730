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
public class Bond {
    private int i;
    private Bond b;
    private ArrayList<Male> cs = new ArrayList<>();
    
   
    public Male m(User d)
    {
        Male c = new Male ();
        return c;        
    }
    
        public User m()
        {
        User d = new User();
        return d;
        }
        
    public int getI(){
    return i;
    }
    
    public void setI(int i){
        this.i = i;
    }

    /**
     * @return the b
     */
    public Bond getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Bond b) {
        this.b = b;
    }

    /**
     * @return the cs
     */
    public ArrayList<Male> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<Male> cs) {
        this.cs = cs;
    }
    }


