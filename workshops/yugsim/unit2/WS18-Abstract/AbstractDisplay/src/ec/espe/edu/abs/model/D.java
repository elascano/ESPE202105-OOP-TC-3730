/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abs.model;

import java.util.ArrayList;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCC0
 */
public class D extends B {
    private int x;
    private int y;
    
    public boolean m(int i){
         boolean result = false;
        if(i % 2 == 0){
            result = true;
        }
        return result;
    }

    public D(int x, int y, float f, double d, ArrayList<G> gs) {
        super(f, d, gs);
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "D{" + super.toString() +"x=" + x + ", y=" + y + '}';
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

    @Override
    public int operation1(int n) {
        int result;
        result = n + 2;
        return result;
    }

    @Override
    public float operation2(float f) {
        float result;
        result = f / 2.0F;
        return result;
    }

    
    
}
