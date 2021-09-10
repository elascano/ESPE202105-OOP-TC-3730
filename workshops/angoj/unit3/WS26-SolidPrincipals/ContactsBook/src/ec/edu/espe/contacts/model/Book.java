/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

import java.util.ArrayList;

/**
 *
 * @author Andrea Quichimbo PROGRAM BUILDER ESPE-DCCO
 */
public class Book {
    int id;
    String description;
    ArrayList<Contact>contacts;

    public Book(int id, String description, ArrayList<Contact> contacts) {
        this.id = id;
        this.description = description;
        this.contacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public Book(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    
}
