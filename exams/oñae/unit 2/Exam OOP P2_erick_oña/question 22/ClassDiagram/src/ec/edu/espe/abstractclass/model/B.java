
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.model;

import java.util.ArrayList;

/**
 *
* @author * @author Erick Oña PROGRAM BUILDER ESPE-DCCO


*/
public abstract class B { //0.2

    private float H;
    
    private ArrayList<G> gs; //0.4
    private double d;

    public B() { //0.2
    }

    @Override
    public String toString() {
        return "B{" + "H=" + H + ", gs=" + gs + '}';
    }

     public abstract int operation1(int n) ;
    
     public abstract float operation2(float H);

    /**
     * @return the f
     */
    public float getH() {
        return H;
    }

    /**
     * @param f the f to set
     */
    public void setH(float f) {
        this.H = H;
    }

    /**
     * @return the d
     */
    public double getD() {
        return H;
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

