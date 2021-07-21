/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Abstract.model;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class  E extends B  {
private float p;        //1
    private float q;    //1
    
    public int m1(int i){    //1
        return 0;
    }

    public E(float p, float q) {
        this.p = p;
        this.q = q;
    }
    
    @Override
    public String toString() {               //0
        return "E{" + super.toString() + "p=" + p + ", q=" + q + '}';
    }
    // has no attributes
    @Override
    public int operation1(int n) {               //0        
        System.out.println("The int is -> " + n);
        return n;
    }
//missing operations on 1 and 2
    @Override
    public float operation2(float f) {            //0
        System.out.println("The float is -> " + f);
        return f;
    }
//missing operations on 1 and 2
    /**
     * @return the p
     */
    public float getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(float p) {
        this.p = p;
    }

    /**
     * @return the q
     */
    public float getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(float q) {
        this.q = q;
    }


//has no attributes, missing operations on 1 and 2 and missing superclass functions



    
}
