/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class Mass {
    private int mass;

    @Override
    public String toString() {
        return "Mass{" + "mass=" + mass + '}';
    }

    /**
     * @return the mass
     */
    public int getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    public void setMass(int mass) {
        this.mass = mass;
    }
    
    
    
}
