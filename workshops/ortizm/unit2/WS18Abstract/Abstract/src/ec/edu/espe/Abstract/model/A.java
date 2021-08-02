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
    private int a;       //1 is complete
    private int b;       //1 is complete
    
<<<<<<< HEAD
    private A a1;
    private A a2;
    private A[] as= new A[2];
    private B[] bs=new B[5];
    private ArrayList<C> cs = new ArrayList <> ();

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + ", a1=" + a1 + ", a2=" + a2 + ", as=" + as + ", bs=" + bs + ", cs=" + cs + '}';
    }

    
    
      public A m(int m, int n){
          System.out.println("Using metohd m(int m, int n), using ints m->"+ m + "and"+ n );
        A a;
        A a1= new A();
        A[] as= new A[2];
        B[] bs= new B[5];
        ArrayList<C> cs = new ArrayList <> ();
        a = new A(m, n, a1, a1, as, bs, cs);
        return a;
        } 
      public A m(){
       A a;
        a = new A();
        return a;
      }
      
    public A(int a, int b, A a1, A a2, A[] as,B[] bs, ArrayList<C> cs) {
=======
    private A a1;        //1 is complete
    private A a2;        //1 is complete
    
  
    private B[] bs = new B[5];    //1 is complete
    
    private ArrayList<C> cs = new ArrayList<>();      //1 is complete
    
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
>>>>>>> 6cab8e267d92cf1302ae51b4a3bd9be3ce7805f9
        this.a = a;
        this.b = b;
        this.a1 = a1;
        this.a2 = a2;
        this.as = as;
        this.bs= bs;
        for(int i = 0; i <2;i++ ){
            this.as[i]=as[i];
        }
        for(int i = 0; i <5;i++ ){
            this.bs[i]=bs[i];
        }
        this.cs = cs;
    }
  public A() {
        a = 0;
        b = 0;
        a1 = new A();
        a2 = new A();
       
        for(int i = 0; i <2;i++ ){
            this.as[i]=new A();
        }
        for(int i = 0; i <5;i++ ){
            if(i%2==0){
           
            this.bs[i]=new D(i, i+10, i*10.0F, i*20.0F, new ArrayList<G>());
        } else {
                bs[i]= new E(i*5.0F, i/5.0F, i/2.0F, i*100.0F, new ArrayList<G>());
            }
        }
        cs = new ArrayList<C>();
    }

<<<<<<< HEAD
=======
                                            //0
                                             //missing without constructor without parameters and without containing class D parameters.
                                             
>>>>>>> 6cab8e267d92cf1302ae51b4a3bd9be3ce7805f9
    
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

