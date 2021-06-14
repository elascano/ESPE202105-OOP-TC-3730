/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.skynet.model;

import java.util.ArrayList;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class People {
    private String name;
    private String lastname;
    private String ID;
    private System1 System;     
    private ArrayList<System1> Administrator = new ArrayList<>();

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", lastname=" + lastname + ", ID=" + ID + ", System=" + System + ", Administrator=" + Administrator + '}';
    }
    
    public void learn(){
    }
    public void programmer(){
    }
    public void operation(){        
    }
    public void username(){        
    }
    public void controller(){        
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
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the System1
     */
    public System1 getSystem() {
        return System;
    }

    /**
     * @param System the System1 to set
     */
    public void setSystem(System1 System) {
        this.System = System;
    }

    /**
     * @return the Administrator
     */
    public ArrayList<System1> getAdministrator() {
        return Administrator;
    }

    /**
     * @param Administrator the Administrator to set
     */
    public void setAdministrator(ArrayList<System1> Administrator) {
        this.Administrator = Administrator;
    }
 }
