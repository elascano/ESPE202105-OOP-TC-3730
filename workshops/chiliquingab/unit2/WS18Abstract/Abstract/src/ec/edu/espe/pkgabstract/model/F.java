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
public class F {
    private String f;

    @Override
    public String toString() {
        return "F{" + "f=" + f + '}';
    }

    public F(String f) {
        this.f = f;
    }

    /**
     * @return the f
     */
    public String getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(String f) {
        this.f = f;
    }
    
}
