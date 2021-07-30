/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class Activity {
    private int id;
    private String descretion;
    private boolean team;

    public Activity(int id, String descrotion, boolean team) {
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
     * @return the descrotion
     */
    public String getDescretion() {
        return descretion;
    }

    /**
     * @param descrotion the descrotion to set
     */
    public void setDescretion(String descrotion) {
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
