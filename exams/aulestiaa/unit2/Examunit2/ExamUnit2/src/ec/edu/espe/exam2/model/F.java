/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2.model;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class F {
    private float w;

    /**
     * @return the w
     */
    public float getW() {
        return w;
    }

    /**
     * @param w the w to set
     */
    public void setW(float w) {
        this.w = w;
    }

    public F(float w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "F{" + "w=" + w + '}';
    }
    
}
