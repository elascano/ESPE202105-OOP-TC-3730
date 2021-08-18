/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.model;

import java.util.ArrayList;

/**
 *
 * @author JOSSELYN SUSANA SIGCHA MANOSALVAS
 */
public class A {
   
  private ArrayList<A> as = new ArrayList<>();

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