/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modell;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class E {
    private float p;
    private float q;

    public E(float p, float q) {
        this.p = p;
        this.q = q;
    }

    public E(float f, float f1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String toString() {
        return "E{" + "p=" + getP() + ", q=" + getQ() + '}';
    }
    
    
    
    public static boolean m1(boolean b) {
        
        return b;
 
    
}

    /**
     * @return the p
     */
    public float getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(float p) {
        this.p = p;
    }

    /**
     * @return the q
     */
    public float getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(float q) {
        this.q = q;
    }
}
