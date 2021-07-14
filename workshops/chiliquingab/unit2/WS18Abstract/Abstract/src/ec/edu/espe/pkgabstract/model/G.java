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
<<<<<<< HEAD
public class G {
    private int z; //2

    public G(int z) { //2
        this.z = z;
=======
public class G extends B{
    private int z;

    public G(float f, double d) {
        super(f, d);
>>>>>>> 95649c147e804d6dca6e3f38f5c544b54ef3e496
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

    @Override
    public void operation1(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float operation2(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
