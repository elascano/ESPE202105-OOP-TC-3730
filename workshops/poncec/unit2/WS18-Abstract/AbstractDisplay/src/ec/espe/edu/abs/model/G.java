/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abs.model;

/**
 *
 * @author Camilo Ponce PROGRAM BUILDER ESPE-DCCO
 */
public class G {
    private int z;

    @Override
    public String toString() {
        return "G{" + "z=" + z + '}';
    }

    //constructor
    public G(int z) {
        this.z = z;
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
    
    
}
