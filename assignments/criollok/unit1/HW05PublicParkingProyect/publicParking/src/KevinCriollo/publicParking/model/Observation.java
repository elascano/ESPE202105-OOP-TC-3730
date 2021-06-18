/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinCriollo.publicParking.model;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class Observation {
    private boolean scratches;
    private boolean rupture;
    private boolean collision;

    @Override
    public String toString() {
        return  "\n scratches=" + scratches + "\n  rupture=" + rupture + 
                "\n  collision=" + collision ;
    }

    
    
    /**
     * @return the scratches
     */
    public boolean isScratches() {
        return scratches;
    }

    /**
     * @param scratches the scratches to set
     */
    public void setScratches(boolean scratches) {
        this.scratches = scratches;
    }

    /**
     * @return the rupture
     */
    public boolean isRupture() {
        return rupture;
    }

    /**
     * @param rupture the rupture to set
     */
    public void setRupture(boolean rupture) {
        this.rupture = rupture;
    }

    /**
     * @return the collision
     */
    public boolean isCollision() {
        return collision;
    }

    /**
     * @param collision the collision to set
     */
    public void setCollision(boolean collision) {
        this.collision = collision;
    }
    
    
}
