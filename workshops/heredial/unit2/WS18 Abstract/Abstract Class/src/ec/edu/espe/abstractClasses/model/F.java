/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractClasses.model;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class F {
    
    private String r;

    public F(String r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "F{" + "r=" + getR() + '}';
    }

    /**
     * @return the r
     */
    public String getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(String r) {
        this.r = r;
    }
    
    
}
