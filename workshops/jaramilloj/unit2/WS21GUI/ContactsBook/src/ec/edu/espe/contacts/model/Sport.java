/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

/**
 *
 * @author Jean Jaramillo
 */
public class Sport {
    private int id;
    private String descriptios;
    private boolean team;

    public Sport(int id, String descriptios, boolean team) {
        this.id = id;
        this.descriptios = descriptios;
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
     * @return the descriptios
     */
    public String getDescriptios() {
        return descriptios;
    }

    /**
     * @param descriptios the descriptios to set
     */
    public void setDescriptios(String descriptios) {
        this.descriptios = descriptios;
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
