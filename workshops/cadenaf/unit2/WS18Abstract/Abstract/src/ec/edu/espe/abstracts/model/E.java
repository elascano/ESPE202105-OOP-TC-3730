/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstracts.model;

import java.util.ArrayList;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class E extends B{
   private float p; 
   private float q;   

   public int a1(boolean b){
       
       int result = 0; 
       if (b) {
           result = 1;
       }
       return result; 
   }

   
    @Override
    public String toString() {
        return "E{" + super.toString() +  "p=" + getP() + ", q=" + getQ() + '}';
    }
 

    @Override
    public int operation1(int a){    
    }
    
    @Override
    public float operation1(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  @Override
    public float operation2(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

   public E(float p, float q, float f, double d, ArrayList<G> gs) {
        super(f, d, gs);
        this.p = p;
        this.q = q;
    }

    

   
   
    /**
     * @return the p
     */
    public float getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(float p) {
        this.p = p;
    }

    /**
     * @return the q
     */
    public float getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(float q) {
        this.q = q;
    }
   
   
    
    
   
   
}
