/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.skynet.model;

import java.util.ArrayList;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class Estudent {
    private String name;
    private String id;
    private int email;
    private ArrayList<Cloud> cloud= new ArrayList<>();

    @Override
    public String toString() {
        return "Estudent{" + "name=" + name + ", id=" + id + ", email=" + email + ", cloud=" + cloud + '}';
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the email
     */
    public int getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(int email) {
        this.email = email;
    }

    /**
     * @return the cloud
     */
    public ArrayList<Cloud> getCloud() {
        return cloud;
    }

    /**
     * @param cloud the cloud to set
     */
    public void setCloud(ArrayList<Cloud> cloud) {
        this.cloud = cloud;
    }
    
    
    
}
