/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Abstract.model;

import java.util.ArrayList;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class A {
    private int a;
    private int b;
    private A a1;
    private A a2;
    //exculsive or 
    private A[] as = new A[2];
    
    private B[] bs = new B[5];
    private ArrayList<C> cs = new ArrayList<>();
    
    
    public A m(int m, int n){
        System.out.println("using the method m(int m, int n), using ints m ->" + m + "and n" + n);
        A a;
        A a1 = new A();
        A[] as = new A[2];
        B[] bs = new B[5];
        ArrayList<C> cs = new ArrayList<>();
        
        a = new A(m, n, a1, a1, as, bs, cs);
        return a;
    }
    
    public A m(){
        A a;
        a = new A();
        return a;        
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + ", a1=" + a1 + ", a2=" + a2 + ", as=" + as + ", bs=" + bs + ", cs=" + cs + '}';
    }
    
    
   
    public A(int a, int b, A a1, A a2, A[] as, B[] bs, ArrayList<C> cs) {
        this.a = a;
        this.b = b;
        this.a1 = a1;
        this.a2 = a2;
        
        this.as = as;
        this.bs = bs;
        // we may need a loop for bs
        for(int i=0; i<2 ;i++){
            this.as[i] = as[i];
        }
        for(int i=0; i<5 ;i++){
            this.bs[i] = bs[i];
        }
        
         this.cs = cs;    
    }
    
    public A() {
        a = 0;
        b = 0;
        a1 = new A();
        a2 = new A();
         
       
        for(int i=0; i<2 ;i++){
            this.as[i] = new A();
        }
            
        for(int i=0; i<5 ;i++){
            if (i % 2 == 0){
                bs[i] = new D(i, i+10, i*10.0F, i*20.0F, new ArrayList<G>());
            }else{
                bs[i] = new E(i * 5.0F, i / 5.0F, i / 2.0F, i * 100, new ArrayList<G>());
            } 
        }
        
        cs = new ArrayList<C>();    
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
     * @return the as
     */
    public A[] getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(A[] as) {
        this.as = as;
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
