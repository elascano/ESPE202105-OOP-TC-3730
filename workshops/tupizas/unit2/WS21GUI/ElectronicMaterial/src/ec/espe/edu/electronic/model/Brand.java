/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.electronic.model;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class Brand {
    private int id;
    private String descretion;
    private boolean team;

    public Brand(int id, String descretion, boolean team) {
        this.id = id;
        this.descretion = descretion;
        this.team = team;
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
     * @return the descretion
     */
    public String getDescretion() {
        return descretion;
    }

    /**
     * @param descretion the descretion to set
     */
    public void setDescretion(String descretion) {
        this.descretion = descretion;
    }

    /**
     * @return the team
     */
    public boolean isTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(boolean team) {
        this.team = team;
    }
    
    
    
}
