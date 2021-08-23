/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.contactBook.model;

import java.util.ArrayList;

/**
 *
 * @author Jean Jaramillo
 */
public class Book {

    private int id;
    private String description;
    private ArrayList <Contact> contact;

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
     * @return the contact
     */
    public ArrayList <Contact> getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(ArrayList <Contact> contact) {
        this.contact = contact;
    }

    public Book(int id, String description, ArrayList<Contact> contact) {
        this.id = id;
        this.description = description;
        this.contact = contact;
    }

}
