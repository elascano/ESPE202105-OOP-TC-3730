/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abstraction.model;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class D extends B{
    
    private int x;
    private int y;

    public D(float f, double d) {
        super(f, d);
    }
    
    public boolean m(int i){
        
        return false;
        
    }

    @Override
    public int operation1(int n) {    //does not return the value
        System.out.println("Hello");
        return 0;
    }

    @Override
    public float operation2(float f) {   //does not return the value
        System.out.println("Hello x2");
        return 0;
    }

    public D(int x, int y, float f, double d) {
        super(f, d);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "D{" + "x=" + super.toString()+ getX() + ", y=" + getY() + '}';
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
