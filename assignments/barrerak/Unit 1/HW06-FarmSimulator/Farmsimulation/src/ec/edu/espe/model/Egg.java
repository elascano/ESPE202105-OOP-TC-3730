/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class Egg {
    private int id;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
    }

    public Egg(int id) {
        this.id = id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
