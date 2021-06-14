/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.skynet.model;
import java.util.Arrays;
/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class code {
    private int a;
    private int b;
    private System[] es = new System[59];

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
     * @return the es
     */
    public System[] getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(System[] es) {
        this.es = es;
    }

    @Override
    public String toString() {
        return "code{" + "a=" + a + ", b=" + b + ", es=" + es + '}';
    }
    
}
