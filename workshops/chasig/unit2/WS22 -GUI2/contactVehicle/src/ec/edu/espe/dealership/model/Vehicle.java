/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dealership.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
  * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Vehicle {
    private int id; 
    private String description; 
    private boolean tpe; 

    public Vehicle(int id, String description, boolean tpe) {
        this.id = id;
        this.description = description;
        this.tpe = tpe;
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

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the tpe
     */
    public boolean isTpe() {
        return tpe;
    }

    /**
     * @param tpe the tpe to set
     */
    public void setTpe(boolean tpe) {
        this.tpe = tpe;
    }



}
