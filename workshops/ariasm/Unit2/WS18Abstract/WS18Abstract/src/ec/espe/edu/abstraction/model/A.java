/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abstraction.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class A {
    private int a;  //1
    private int b;  //1
    private A a1;   //1
    private A a2;   //1
    private B[] bs = new B[5];  //1
    private ArrayList<C> cs = new ArrayList<>();    //1
    
    public void A(int m, int n){    //0   //missing m
        //System.out.println("using the method m, using ints m ->" + m + "and n" + n);
        //A a;
        //A a1 = new A();
        //A[] as = new A[2];
        //B[] bs = new B[5];
        
        //a = new A(m, n, a1, a1, as, bs, cs);
        //return a;
    }
    
    public void A(){    //0   //missing m
        //A a;
        //a = new A();
        //return a;
    }

    public A(int a, int b, A a1, A a2) {    //0.5   //missing the B[] bs, ArrayList<C> cs
        this.a = a;
        this.b = b;
        this.a1 = a1;
        this.a2 = a2;
        
        //this.bs = bs;
        //this.cs = cs;
        /*for(int i = 0; i < 2; i++{
            this.as[i] = a1[i];
        }*/
        /*for(int i = 0; i < 2; i++{
            this.as[i] = a2[i];
        }*/
    }

    /*public A() {  //0
        a = 0;
        b = 0;
        a1 = new A();
        a2 = new A();
        
        for(int i = 0; i < 2; i++{
            this.as[i] = new A();
        }
        for(int i = 0; i < 2; i++{
            if(i % 2 == 0){
            this.bs[i] = new D(i, i+10, i*10.0F, i*20.0F, new ArrayList<G>());
            }else{
                bs[i] = new E(i+5.0F, i/5.0F, i / 2.0F, i * 100.0F, new ArrayList<>)
            }
            
        }
        cs = new ArrayList<C>();
    }*/
    
    @Override
    public String toString() {  //0.5
        return "A{" + "a=" + a + ", b=" + b + ", a1=" + a1 + ", a2=" + a2 + ", bs=" + Arrays.toString(bs) + ", cs=" + cs + '}';
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
