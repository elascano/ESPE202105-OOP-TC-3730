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
    private int z; //2

    public G(int z) { //2
        this.z = z;
    }
    
    @Override //2
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
    public int getZ() { //2
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) { //2
        this.z = z;
    }

    
}
