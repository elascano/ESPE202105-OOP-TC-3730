/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Car {
    private int id;
    private String dateOfBirth;
    private boolean team;

    public Car(int id, String dateOfBirth, boolean team) {
        this.id = id;
        this.dateOfBirth= dateOfBirth;
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
     * @return the description
     */
    public String getdateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param description the description to set
     */
    public void setdateOfBirth(String description) {
        this.dateOfBirth= dateOfBirth;
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
