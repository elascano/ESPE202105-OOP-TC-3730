/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class A {

    private A a;

    public A(A a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + '}';
    }

    /**
     * @return the a
     */
    public A getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(A a) {
        this.a = a;
    }

}
