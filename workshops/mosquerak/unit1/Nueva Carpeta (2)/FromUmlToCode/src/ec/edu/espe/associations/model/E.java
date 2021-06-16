/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class E {
    private char c;

    @Override
    public String toString() {
        return "E{" + "c=" + c + '}';
    }

    /**
     * @return the c
     */
    public char getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(char c) {
        this.c = c;
    }

    public void setC(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
