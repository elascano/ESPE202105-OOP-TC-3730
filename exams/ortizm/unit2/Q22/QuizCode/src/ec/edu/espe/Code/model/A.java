/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Code.model;


/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class A {
   
   private A a1;

   
    public A(A a1) {
        this.a1 = a1;
    }

    @Override
    public String toString() {
        return "A{" + "a1=" + a1 + '}';
    }
   
   

    /**
     * @return the a1
     */
    public A getA1() {
        return a1;
    }

    /**
     * @param a1 the a1 to set
     */
    public void setA1(A a1) {
        this.a1 = a1;
    }
      
    
}
