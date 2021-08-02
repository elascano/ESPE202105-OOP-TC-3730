/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Estefania
 */
public class E {//It is not inheritance,, 
    private float p;
    private float q;

    public static int m1(int i){ //1
        return 0;
}
//0  it has no methods
    public E(float p, float q) { //1
        this.p = p;
        this.q = q;
    }
    //0 it has no methods 1 and 2
    public E() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "E{" + "p=" + p + ", q=" + q + '}';
    }
//0 to String is wrong
    /**
     * @return the p
     */
    public float getP() { //1
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(float p) { //1
        this.p = p;
    }

    /**
     * @return the q
     */
    public float getQ() { //1
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(float q) { //1
        this.q = q;
    }
    
}
