/*
 * To change this license header, choose License Headers in Project Properties.
 */
package ec.edu.espe.associations.model.view;

import java.util.ArrayList;
/**
 *
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class A {
    
   private int i;
   private B b;
   private ArrayList<C> cs = new ArrayList<>();
   
   
   public C m(D d){
       C c = new C();
       
       return c;
   }
   
   public D m(){
       D d = new D();
       
     return d;
     
       
   }
   public int getI() {
       return i;
   }
    /**
     * @return the b
     */
    public B getB() {
        return b;
    }
    public void setI(int i){
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" + "i=" + i + ", b=" + b + ", cs=" + cs + '}';
    }
    /**
     * @param b the b to set
     */
    public void setB(B b) {
        this.b = b;
    }

    /**
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }
}
