/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractClasses.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public abstract class B {//1     //The class is complete  
    private float f;//1
    private double d;//1
    private ArrayList<G> gs = new ArrayList<>();//1
    
    public abstract void operation1(int n);//1
    public abstract void operation2(float f);//1

    public B(float f, double d, ArrayList<G> gs) {//2
        this.f = f;
        this.d = d;
        this.gs = gs;
    }

    @Override
    public String toString() { //2
        return "B{" + "f=" + getF() + ", d=" + getD() + ", gs=" + getGs() + '}';
    }

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
