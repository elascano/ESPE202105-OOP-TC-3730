/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractquiz.model;

import java.util.ArrayList;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class D extends B {
    private int z;
    private int y;
    
    public boolean m(int i){
        boolean result=false;
        if(i%2==0){
            result=true;
        }
        return result;  
        
    }
    @Override
    public int operation1(int n) {
         int result;
         result=n+2;
         return result;
    }

    @Override
    public float operation2(float f) {
        float result;
        result=f/2.0F;
        return result;
    }

    public D(int z, int y, float f, double d, ArrayList<G> gs) {
        super(f, d, gs);
        this.z = z;
        this.y = y;
    }

    @Override
    public String toString() {
        return "D{" +super.toString()+ "z=" + z + ", y=" + y + '}';
    }
    

    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) {
        this.z = z;
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
