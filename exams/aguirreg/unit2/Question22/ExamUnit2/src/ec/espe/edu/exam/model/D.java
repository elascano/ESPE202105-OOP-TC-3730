/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.exam.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class D {
    private final int x;
    private final int y;
    
    public boolean m(int i){
        return false;
    }

    @Override
    public String toString() {
        return "D{" + super.toString() + "x=" + getX() + ", y=" + getY() + '}';
    }

    //constructor
    public D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private String getX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
