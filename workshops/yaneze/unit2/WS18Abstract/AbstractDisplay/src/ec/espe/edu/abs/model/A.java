/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abs.model;

import java.util.ArrayList;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class A {
    private int a;//1
    private int b;//1
    
    private A a1;//1
    private A a2;//1
    
  
    private B[] bs = new B[5];//1
    
    private ArrayList<C> cs = new ArrayList<>();//1
    
    public A m(int m, int n){//0
         // bad return
        //return A
        return null;
    }
    
    public A m(){//0
        // bad return
        //return A
        return null;
    }

    @Override
    public String toString() {//1
        return "A{" + "a=" + a + ", b=" + b + ", a1=" + a1 + ", a2=" + a2 + ", bs=" + bs + ", cs=" + cs + '}';
    }

    //constructor
    public A(int a, int b, A a1, A a2) {//0
        //incomplete constructor
        this.a = a;
        this.b = b;
        this.a1 = a1;
        this.a2 = a2;
    }

    
    
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
