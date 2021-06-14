/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sfeam.model;

/**
 *
 * @author Solsnge Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class B {
    private int a;
    private int b;
    
    private E[] es = new E[5];
    
    public C m1(F f){
    C c = new C();

     return c;
    }

    @Override
    public String toString() {
        return "B{" + "a=" + a + ", b=" + b + ", es=" + es + '}';
    }

    
    public void setA(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setB(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @return the es
     */
    public E[] getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(E[] es) {
        this.es = es;
    }
    
}
