/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Abstract.model;

import java.util.ArrayList;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class A {
    private int a;       //1
    private int b;       //1
    
    private A a1;        //1
    private A a2;        //1
    
  
    private B[] bs = new B[5];    //1
    
    private ArrayList<C> cs = new ArrayList<>();      //1
    
    public A m(int m, int n){   //0,6
        return null;             //does not contain your return a from to not declaration in method nor scope of method variables
    }
    
    public A m(){      //0,6          
                              // does not apply concept of polymorphism in its method
        
        return null;
    }

    @Override
    public String toString() {    //0.6 (does not contain a2 and cs prints)
                                   
        return "A{" + "a=" + a + ", b=" + b + ", a1=" + a1 + ", a2=" + a2 + ", bs=" + bs + ", cs=" + cs + '}';
    }

    //constructor
    public A(int a, int b, A a1, A a2) {     // 0 (missing parameters and constructors with parameters B[]bs,A[] as ,ArrayList<C>cs).
        this.a = a;
        this.b = b;
        this.a1 = a1;
        this.a2 = a2;
    }

                                            //0
                                             //missing without constructor without parameters and without containing class D parameters.
                                             
    
    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
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

    /**
     * @return the a2
     */
    public A getA2() {
        return a2;
    }

    /**
     * @param a2 the a2 to set
     */
    public void setA2(A a2) {
        this.a2 = a2;
    }

    /**
     * @return the bs
     */
    public B[] getBs() {
        return bs;
    }

    /**
     * @param bs the bs to set
     */
    public void setBs(B[] bs) {
        this.bs = bs;
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

