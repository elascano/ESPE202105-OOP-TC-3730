/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.association.model;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class D {
    private int i;
    public B m(){
        B b = new B();
        return b;
    }

    @Override
    public String toString() {
        return "D{" + "i=" + i + '}';
    }
    
    public int m(F f){
        return 0;
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
