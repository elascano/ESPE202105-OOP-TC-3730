/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class F {

    private D d;

    public F(D d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "F{" + "d=" + d + '}';
    }

    /**
     * @return the d
     */
    public D getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(D d) {
        this.d = d;
    }

}
