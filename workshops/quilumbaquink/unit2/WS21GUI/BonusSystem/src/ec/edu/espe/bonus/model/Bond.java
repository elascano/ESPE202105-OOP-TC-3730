/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bonus.model;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class Bond {
    private int id;
    private String name;
    private String lastName;
    private int bond;

    public Bond(int id, String name, String lastName, int bond) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.bond = bond;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the bond
     */
    public int getBond() {
        return bond;
    }

    /**
     * @param bond the bond to set
     */
    public void setBond(int bond) {
        this.bond = bond;
    }

    
}
