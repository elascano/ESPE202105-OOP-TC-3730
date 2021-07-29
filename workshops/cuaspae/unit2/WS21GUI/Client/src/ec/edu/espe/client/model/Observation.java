/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.client.model;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Observation {
    private String collision;
    private String rupture;
    private String Scratches;

    public Observation(String collision, String rupture, String Scratches) {
        this.collision = collision;
        this.rupture = rupture;
        this.Scratches = Scratches;
    }

    /**
     * @return the collision
     */
    public String getCollision() {
        return collision;
    }

    /**
     * @param collision the collision to set
     */
    public void setCollision(String collision) {
        this.collision = collision;
    }

    /**
     * @return the rupture
     */
    public String getRupture() {
        return rupture;
    }

    /**
     * @param rupture the rupture to set
     */
    public void setRupture(String rupture) {
        this.rupture = rupture;
    }

    /**
     * @return the Scratches
     */
    public String getScratches() {
        return Scratches;
    }

    /**
     * @param Scratches the Scratches to set
     */
    public void setScratches(String Scratches) {
        this.Scratches = Scratches;
    }
    
    
    
}
