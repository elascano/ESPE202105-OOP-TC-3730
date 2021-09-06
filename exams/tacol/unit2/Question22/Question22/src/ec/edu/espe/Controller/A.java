/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Controller;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class A {//0.5
    
   private ArrayList<A> as = new ArrayList<>();//0.5

    /**
     * @return the as
     */
    public ArrayList<A> getAs() {
        return as;
    }

 


    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }
    
}
