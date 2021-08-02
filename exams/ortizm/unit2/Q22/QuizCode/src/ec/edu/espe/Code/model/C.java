/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Code.model;

import java.util.ArrayList;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class C {
 
   private ArrayList<E> es;

    @Override
    public String toString() {
        return "C{" + "es=" + es + '}';
    }
   
   
   
      public C() {
    }
   
   public void m(F f){
   
  }
   public float m(float f){
   return f ;
   }

    public C(ArrayList<E> es) {
        this.es = es;
    }
   
    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
    
}
