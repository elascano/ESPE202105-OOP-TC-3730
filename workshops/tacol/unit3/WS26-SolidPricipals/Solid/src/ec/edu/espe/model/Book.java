/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Book {
    
int is;
String description;
    ArrayList<Contact> contacts;

    public Book(int is, String description, ArrayList<Contact> contacts) {
        this.is = is;
        this.description = description;
        this.contacts = contacts;
    }
  

    public int getIs() {
        return is;
    }

    public void setIs(int is) {
        this.is = is;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.contacts, other.contacts)) {
            return false;
        }
        return true;
    }

    public Object getContacts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getContact() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
