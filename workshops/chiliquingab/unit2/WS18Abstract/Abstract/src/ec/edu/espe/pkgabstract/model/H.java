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
public class H extends B{

    public H(float f, double d) {
        super(f, d);
    }

    @Override //5 points
    public String toString() {
        return "H{" + '}';
    }

<<<<<<< HEAD
    public H() {  //5 points
=======
    @Override
    public void operation1(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float operation2(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> 95649c147e804d6dca6e3f38f5c544b54ef3e496
    }
}
