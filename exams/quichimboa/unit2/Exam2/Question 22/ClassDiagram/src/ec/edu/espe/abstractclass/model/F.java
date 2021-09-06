/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.model;

/**
 *
* @author Andrea Quichimbo PROGRAM BUILDER ESPE-DCCO
*/
public class F {   //0.8
    private String r;

    @Override
    public String toString() {   //0.2
        return "F{" + "r=" + r + '}';
    }

    public F() {
    }
    public F(String r) {
        this.r = r;
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
