/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pkgabstract.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class G {
    private int z;

    public G(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "G{" + "z=" + z + '}';
    }
    
    public static void m(F f){
        
    }
    
    public static float m(float f){
        
        return f;
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
