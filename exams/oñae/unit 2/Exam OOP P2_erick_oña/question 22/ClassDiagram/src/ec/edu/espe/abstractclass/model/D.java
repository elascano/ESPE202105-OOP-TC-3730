
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.model;

import java.util.ArrayList;

/**
 *
* @author Erick Oña PROGRAM BUILDER ESPE-DCCO
*/
public class D extends B { //0.2 extens A

    private int x; //0 // Others attributes
    private int y; //0 

    @Override
    public String toString() {
        return "D{" + super.toString()+ "x=" + x + ", y=" + y + '}';
    }
    
    

    public D() {
    }

    public D(int x, int y, float f, double d, ArrayList<G> gs) { //0.2 Constructor with attributes
        this.x = x;
        this.y = y;
    }

    public boolean m(int i) {
        return true;
    }

    @Override
    public int operation1(int n) {
        return n;
    }

    @Override
    public float operation2(float f) {
        return f;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

}