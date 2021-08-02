/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Abstract.model;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class D extends B { //1
    private int x; //1
    private int y; //1
    
    public boolean m(int i){ // 1
        return false;
    }

    @Override
    public String toString() { //1
        return "D{" + super.toString() + "x=" + getX() + ", y=" + getY() + '}';
    }

    //constructor
    public D(int x, int y) { //0  the method
        this.x = x;
        this.y = y;
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
    public int operation1(int n) { // missing the method
        System.out.println("The int is -> " + n);
        return n;
    }

    @Override
    public float operation2(float f) { // missin the method
        System.out.println("The float is -> " + f);
        return f;
    }

    
    
}
