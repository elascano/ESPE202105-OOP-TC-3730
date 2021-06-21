/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Eggs {
     private int id;

    public Eggs(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Eggs{" + "id=" + id + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
