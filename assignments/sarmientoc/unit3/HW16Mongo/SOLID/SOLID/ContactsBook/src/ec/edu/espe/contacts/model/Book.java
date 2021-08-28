
package ec.edu.espe.contacts.model;

import java.util.ArrayList;

public class Book {

int id;
String description;
ArrayList<Contact> contacts;

    public Book(int id, String description, ArrayList<Contact> contacts) {
        this.id = id;
        this.description = description;
        this.contacts = contacts;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    

    
}
