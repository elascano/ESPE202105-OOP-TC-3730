/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstrac.model;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class A {
    private int a;
    private int b;
    private A a1;
    private A a2;
    private B[] bs = new B[5];
    private ArrayList<C> gs = new ArrayList<>(); 

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + ", a1=" + a1 + ", a2=" + a2 + ", bs=" + bs + ", gs=" + gs + '}';
    }

    public A(int a, int b, A a1, A a2) {
        this.a = a;
        this.b = b;
        this.a1 = a1;
        this.a2 = a2;
    }
   

    public A m(int m, int n){
        A a = new A();
    
        return a;
    }
 
    public A m(){
        A a = new A();
        return a;
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
     * @return the gs
     */
    public ArrayList<C> getGs() {
        return gs;
    }

    /**
     * @param gs the gs to set
     */
    public void setGs(ArrayList<C> gs) {
        this.gs = gs;
    }
}

 