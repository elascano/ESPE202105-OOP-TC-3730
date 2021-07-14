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
public class F extends B{
    private String f;

    public F(float f, double d) {
        super(f, d);
    }

    @Override
    public String toString() {
        return "F{" + "f=" + f + '}';
    }

    /**
     * @param f the f to set
     */
    public void setF(String f) {
        this.f = f;
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
