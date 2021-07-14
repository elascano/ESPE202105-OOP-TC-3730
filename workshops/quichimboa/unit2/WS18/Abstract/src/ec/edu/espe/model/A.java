/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;



/**
 *
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class A extends B{
    private int a;
    private A a1;
    private A a2;
    private int b;
    private B[] bs = new B[5];

    public void A (int m, int n){ 
}
    public void A (){   
}

    
    public A(int a, A a1, A a2, int b) {
        this.a = a;
        this.a1 = a1;
        this.a2 = a2;
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", a1=" + a1 + ", a2=" + a2 + ", b=" + b + ", bs=" + bs + '}';
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
    
}
    
        