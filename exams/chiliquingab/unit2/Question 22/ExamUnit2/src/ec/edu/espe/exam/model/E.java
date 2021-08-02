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
public class E {

    private B[] b = new B[3];
    private D[] d = new D[4];

    public E() {
    }

    @Override
    public String toString() {
        return "E{" + "b=" + b + ", d=" + d + '}';
    }

    /**
     * @return the b
     */
    public B[] getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(B[] b) {
        this.b = b;
    }

    /**
     * @return the d
     */
    public D[] getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(D[] d) {
        this.d = d;
    }
    
}
