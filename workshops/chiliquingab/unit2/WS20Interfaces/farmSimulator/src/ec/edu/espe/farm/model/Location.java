/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Location {
    private int dx;
    private int dy;

    @Override
    public String toString() {
        return "Location{" + "dx=" + dx + ", dy=" + dy + '}';
    }

    public Location(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    /**
     * @return the dx
     */
    public int getDx() {
        return dx;
    }

    /**
     * @param dx the dx to set
     */
    public void setDx(int dx) {
        this.dx = dx;
    }

    /**
     * @return the dy
     */
    public int getDy() {
        return dy;
    }

    /**
     * @param dy the dy to set
     */
    public void setDy(int dy) {
        this.dy = dy;
    }
}
