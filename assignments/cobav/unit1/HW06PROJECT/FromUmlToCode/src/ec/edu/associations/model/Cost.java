/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.model;

import java.util.ArrayList;

/**
 *
 * @author Victor Coba Beta Software ESPE-DCCD
 */
public class Cost {
    private int i;
    private Cost b; 
    private ArrayList<Name> cs = new ArrayList<>();
    
    
    
    public Name m(Registry d)
    {
       Name c = new Name ();
        return c;        
    }
    
        public Registry m()
        {
        Registry d = new Registry();
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
    public Cost getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Cost b) {
        this.b = b;
    }

    /**
     * @return the cs
     */
    public ArrayList<Name> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<Name> cs) {
        this.cs = cs;
    }
 
    
}