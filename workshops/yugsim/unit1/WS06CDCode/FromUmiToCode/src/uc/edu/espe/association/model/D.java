/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uc.edu.espe.association.model;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCD
 */
public class D {
    private int i;
    
    public B m(){
        B b = new B();
        
        return b;
    }
    
    public int m(F f){
        
        return 0;
    }

    @Override
    public String toString() {
        return "D{" + "i=" + i + '}';
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }
}
