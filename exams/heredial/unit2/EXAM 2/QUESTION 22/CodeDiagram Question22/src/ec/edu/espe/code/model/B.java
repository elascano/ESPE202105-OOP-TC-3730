/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.code.model;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class B extends A{
    
    public H h;

    public B(H h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "B{"  + "h=" + h + '}';
    }

    public H getH() {
        return h;
    }

    public void setH(H h) {
        this.h = h;
    }
    
    
    
}
