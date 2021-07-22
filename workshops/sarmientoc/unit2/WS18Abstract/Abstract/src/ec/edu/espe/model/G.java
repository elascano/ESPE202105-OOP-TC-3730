/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Estefania
 */
public class G {
    private int z;
 
     public static void m(F f){
        
    }
    
    public static float m(float f){
        
        return f;
    }

    public G(int z) {
        this.z = z;
    }

    public G() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public String toString() {
        return "G{" + "z=" + z + '}';
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
