/** Copyright ESPE-DECC
 */
package ec.edu.espe.asbtractquiz.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public abstract class B {       //1

    private float f;            //1
    private double d;           //1
    private ArrayList<G> gs = new ArrayList<>();    //1

    public abstract int operation1(int n);          //1

    public abstract float operation2(float f);      //1

    public B(float f, double d, ArrayList<G> gs) {  //1
        this.f = f;
        this.d = d;
        this.gs = gs;
    }

    @Override
    public String toString() {                      //1
        return "B{" + "f=" + f + ", d=" + d + ", gs=" + gs + '}';
    }

    //2
    
    /**
     * @return the f
     */
    public float getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(float f) {
        this.f = f;
    }

    /**
     * @return the d
     */
    public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }

    /**
     * @return the gs
     */
    public ArrayList<G> getGs() {
        return gs;
    }

    /**
     * @param gs the gs to set
     */
    public void setGs(ArrayList<G> gs) {
        this.gs = gs;
    }

}
