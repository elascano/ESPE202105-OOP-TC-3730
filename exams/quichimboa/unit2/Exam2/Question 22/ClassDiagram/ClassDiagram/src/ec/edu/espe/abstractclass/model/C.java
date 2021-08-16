/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.model;

import java.util.ArrayList;

/**
 *
* @author Andrea Quichimbo PROGRAM BUILDER ESPE-DCCO
*/
public class C { // 0.4
    
   private ArrayList<E> hs;

    @Override
    public String toString() {
        return "C{" + "hs=" + hs + '}';
    }

    public C(ArrayList<E> hs) {
        this.hs = hs;
    }

    public C() {
    }
   
   public void m(F f){
   
  }
   public float m(float f){
   return f ;
   }

    /**
     * @return the hs
     */
    public ArrayList<E> getEs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setEs(ArrayList<E> hs) {
        this.hs = hs;
    }
    
}