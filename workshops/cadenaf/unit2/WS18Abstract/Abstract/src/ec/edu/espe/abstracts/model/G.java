/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstracts.model;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class G {
  private int z; 

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

    public G() {
    }

    @Override
    public String toString() {
        return "G{" + "z=" + z + '}';
    }

  
}