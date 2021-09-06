/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abstraction.model;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
/*Members: Tituaña Lesli, Tupiza Solange, Villavicencio Alina Team: 5*/
public class G {
    
    private int z;

    public G(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "G{" + "z=" + getZ() + '}';
    }

    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) {
        this.z = z;
    }
    
    
}
