/** Copyright ESPE-DECC
 */
package ec.edu.espe.asbtractquiz.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class E extends B {  //1

    private float p;    //1
    private float q;    //1

    public int m1(boolean b) {  //1
        int result = 0;
        if (b) {
            result = 1;
        }
        return result;
    }

    @Override
    public int operation1(int n) {  //1 
        int result;
        result = n * 10;
        return result;
    }

    @Override
    public float operation2(float f) {  //1
        float result;
        result = f / 10.0F;
        return result;
    }

    
    public E(float p, float q, float f, double d, ArrayList<G> gs) { //1
        super(f, d, gs);
        this.p = p;
        this.q = q;
    }

    @Override
    public String toString() {  //1
        return "E{" + super.toString() + ", p=" + p + ", q=" + q + '}';
    }

    
    //2
    
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

}
