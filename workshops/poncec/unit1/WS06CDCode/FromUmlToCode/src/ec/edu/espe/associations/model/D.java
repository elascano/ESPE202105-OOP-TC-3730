/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.model;

/**
 *
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class D {
    private int i;
    
    public B m(){
        B b = new B();
        return b;
    }
    public int m(F f){
        return 0;
        
    }

    @Override
    public String toString() {
        return "D{" + "i=" + i + '}';
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    public void setF(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
