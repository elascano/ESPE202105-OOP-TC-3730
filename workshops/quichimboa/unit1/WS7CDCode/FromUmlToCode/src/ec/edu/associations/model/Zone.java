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
public class Zone {
    private float e;
            
            public void m(){
            }          

    @Override
    public String toString() {
        return "Zone{" + "e=" + e + '}';
    }

    /**
     * @return the e
     */
    public float getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(float e) {
        this.e = e;
    }

    public void setC(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMale(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
