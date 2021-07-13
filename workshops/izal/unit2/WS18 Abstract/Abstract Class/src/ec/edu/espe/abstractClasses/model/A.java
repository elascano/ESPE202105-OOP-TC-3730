/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractClasses.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
/*MEMBERS: Luis Heredia, Lilian Iza, Jean Carlos Jarramillo*/
public class A {
    
    private int a;
    private int b;
    private A a1;
    private A b2;
    private B[] bs = new B[5];
    private ArrayList<C> cs = new ArrayList<>();
    
    public static A m(int m, int n){
        
        System.out.println(m);
        System.out.println(n);
        
       return m();
  
    }
    
    public static A m(){
        
    return m();
    }

    public A(int a, int b, A a1, A b2, ArrayList<C> cs) {
        this.a = a;
        this.b = b;
        this.a1 = a1;
        this.b2 = b2;
        this.cs = cs;
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + ", a1=" + a1 + ", b2=" + b2 + ", bs=" + bs + ", cs=" + cs + '}';
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
     * @return the b2
     */
    public A getB2() {
        return b2;
    }

    /**
     * @param b2 the b2 to set
     */
    public void setB2(A b2) {
        this.b2 = b2;
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
