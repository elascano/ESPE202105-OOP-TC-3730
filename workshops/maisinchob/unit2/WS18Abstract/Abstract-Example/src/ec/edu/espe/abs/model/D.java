/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abs.model;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class  D extends B{
    private int x;
    private int y;
    
    public boolean m(int i){ //0 incomplete m
        return false;
    }

    @Override
    public String toString() {
        return "D{" + super.toString() + "x=" + getX() + ", y=" + getY() + '}';
    }

    //constructor
    public D(int x, int y) { //0 incomplete constructor
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
    public int operation1(int n) {//0 incomplete operation1
        System.out.println("The int is -> " + n);
        return n;
    }

    @Override
    public float operation2(float f) {//0 incomplete operation2
        System.out.println("The float is -> " + f);
        return f;
    }

    
}
