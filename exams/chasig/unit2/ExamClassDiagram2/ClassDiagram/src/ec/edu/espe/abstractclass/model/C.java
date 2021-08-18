/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.model;

import java.util.ArrayList;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
*/
public class C {//It is not inherited from the pope
    
   private ArrayList<E> hs;

    @Override
    public String toString() {
        return "C{" + "hs=" + hs + '}';
    }

    public C(ArrayList<E> hs) {////incomplete constructor
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