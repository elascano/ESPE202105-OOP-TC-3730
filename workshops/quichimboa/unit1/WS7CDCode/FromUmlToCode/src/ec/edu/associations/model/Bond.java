/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.model;

import java.util.ArrayList;

/**
 *
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class Bond {
    private int i;
    private Bond b; 
    private ArrayList<Male> cs = new ArrayList<>();
    
    
    
    public Male m(Name d)
    {
        Male c = new Male ();
        return c;        
    }
    
        public Name m()
        {
        Name d = new Name();
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

    public void setBond(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

  
    
}
