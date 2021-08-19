/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contact.model;

import java.util.ArrayList;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Book {
    
    private int Id; 
    private String description; 
    private ArrayList<Contact> contacts; 

    
    
    public Book(int Id, String description, ArrayList<Contact> contacts) {
        this.Id = Id;
        this.description = description;
        this.contacts = contacts;
    }

    
    
    
    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
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
     * @return the cntacts
     */
    public ArrayList<Contact> getCntacts() {
        return contacts;
    }

    /**
     * @param cntacts the cntacts to set
     */
    public void setCntacts(ArrayList<Contact> cntacts) {
        this.contacts = cntacts;
    }
    
    
}
