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
public class B {                           
    private float f;                       //1
    private double d;                 //1
    private ArrayList<G> gs = new ArrayList<>();        //1 

   public int operation1(int n){                     //1
       
       return n; 
   }
   
   public float operation(float f){
       
       return f; 
   }

    /**
     * @return the f
     */
    public float getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(float f) {
        this.f = f;
    }

    /**
     * @return the d
     */
    public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }

    /**
     * @return the gs
     */
    public ArrayList<G> getGs() {
        return gs;
    }

    /**
     * @param gs the gs to set
     */
    public void setGs(ArrayList<G> gs) {
        this.gs = gs;
    }
}
    
        
        

